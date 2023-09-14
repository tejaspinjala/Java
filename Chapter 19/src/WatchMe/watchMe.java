/*
 * Tejas Pinjala
 * COSC 2436 / Professor Woods
 * 04/21/2021
 * WatchMe Applet
 */

package WatchMe;

//imports the necessary files
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Eye_Test_Info extends Thread {

	   public static int mouse_X;

	   public static int mouse_Y;
	   private static final int WIDTH_DATA = 50;
	   private static final int HEIGHT_DATA = 75;
	   private static final int IRISSIZE = 30;
	   private static final int PUPILSIZE = 12;
	   private Color irisColor;

	   private static final int SMALLXRAD = (WIDTH_DATA - IRISSIZE) / 2;
	   private static final int SMALLYRAD = (HEIGHT_DATA - IRISSIZE) / 2;

	   private int x, y;
	   private double new_x, new_y;
	   private Graphics g;

	   public Eye_Test_Info(int x, int y, Graphics g) {
	       this.g = g;
	       this.x = x;
	       this.y = y;
	       irisColor = new Color((float) Math.random(), (float) Math.random(),
	               (float) Math.random());
	   }

	   private void draw_info() {
	       synchronized (g) {
	           g.setColor(Color.white);
	           g.fillOval(x - WIDTH_DATA / 2, y - HEIGHT_DATA / 2, WIDTH_DATA, HEIGHT_DATA);
	           g.setColor(irisColor);
	           g.fillOval((int) new_x - IRISSIZE / 2 + 1, (int) new_y - IRISSIZE / 2
	                   + 1, IRISSIZE, IRISSIZE);
	           g.setColor(Color.black);
	           g.fillOval((int) new_x - PUPILSIZE / 2 + 1, (int) new_y - PUPILSIZE
	                   / 2 + 1, PUPILSIZE, PUPILSIZE);
	           g.drawOval(x - WIDTH_DATA / 2, y - HEIGHT_DATA / 2, WIDTH_DATA, HEIGHT_DATA);
	       }
	   }

	   public void run() {
	       for (;;) {
	           update_Coordinates();
	           draw_info();
	           try {
	               sleep(50);
	           } catch (InterruptedException e) {
	           }
	       }

	   }

	   private void update_Coordinates() {

	       if (mouse_X == x) {
	           new_x = mouse_X;

	           if (Math.abs(y - mouse_Y) >= SMALLYRAD) {
	               if ((y - mouse_Y) > 0)
	                   new_y = y - SMALLYRAD;
	               else
	                   new_y = y + SMALLYRAD;
	           } else
	               new_y = mouse_Y;
	           return;
	       }

	       double slope = (double) (mouse_Y - y) / (double) (mouse_X - x);
	       double numerator = SMALLXRAD * SMALLXRAD * SMALLYRAD * SMALLYRAD;
	       double denominator = SMALLYRAD * SMALLYRAD + slope * slope * SMALLXRAD
	               * SMALLXRAD;
	       new_x = Math.sqrt(numerator / denominator);
	       new_y = slope * new_x;

	       if (mouse_X < x)
	           new_x = -Math.abs(new_x);
	       else
	           new_x = Math.abs(new_x);

	       if (mouse_Y < y)
	           new_y = -Math.abs(new_y);
	       else
	           new_y = Math.abs(new_y);

	       new_x += x;
	       new_y += y;

	       if ((double) (mouse_X - x) * (mouse_X - x) / (SMALLXRAD * SMALLXRAD)
	               + (double) (mouse_Y - y) * (mouse_Y - y)
	               / (SMALLYRAD * SMALLYRAD) < 1) {
	           new_x = mouse_X;
	           new_y = mouse_Y;
	       }
	   }
	}

public class watchMe extends Applet {
	   static final int NUM_EYES = 50;
	   Eye_Test_Info[] eyes_info = new Eye_Test_Info[NUM_EYES];
	   int count = -1;
	   int width, height;

	   public void init() {
	       addMouseMotionListener(new MouseMotionListener() {
	           public void mouseDragged(MouseEvent e) {
	           }

	           public void mouseMoved(MouseEvent e) {
	               Eye_Test_Info.mouse_X = e.getX();
	               Eye_Test_Info.mouse_Y = e.getY();
	               repaint();
	           }
	       });
	   }

	   public void start() {
	       if (count == -1) {
	           width = getSize().width;
	           height = getSize().height;
	           final Graphics g = getGraphics();
	           eyes_info[++count] = new Eye_Test_Info(width / 4, height / 2, g);
	           eyes_info[count].start();
	           eyes_info[++count] = new Eye_Test_Info(3 * width / 4, height / 2, g);
	           eyes_info[count].start();
	           addMouseListener(new MouseListener() {
	               public void mouseClicked(MouseEvent e) {
	                   if ((count + 1) >= NUM_EYES)
	                       return;
	                   eyes_info[++count] = new Eye_Test_Info(e.getX(), e.getY(), g);
	                   eyes_info[count].start();
	               }

	               public void mousePressed(MouseEvent e) {
	               }

	               public void mouseReleased(MouseEvent e) {
	               }

	               public void mouseEntered(MouseEvent e) {
	               }

	               public void mouseExited(MouseEvent e) {
	               }
	           });
	       } else {
	           for (int i = 0; i < count; i++)
	               eyes_info[i].resume();
	       }
	       repaint();
	   }

	   public void stop() {
	       for (int i = 0; i < count; i++)
	           eyes_info[i].suspend();
	   }

	   public void destroy() {
	       for (int i = 0; i < count; i++)
	           eyes_info[i].stop();
	   }

	   public void update(Graphics g) {
	       g.drawRect(0, 0, width - 1, height - 1);
	   }
	}


