/*
 * Tejas Pinjala
 * COSC 2436 / Professor Woods
 * 04/21/2021
 * House Applet
 */

package HouseApplet;

//imports all the necessary files
import java.awt.*;	
import java.awt.event.*;
import java.applet.*;

public class houseApplet extends Applet{
	//sets a boolean 
	boolean leftWindow;
	boolean rightWindow;
	boolean door;

	//constructor to initialize the boolean values
	public void init(){      
		leftWindow = false;
		rightWindow = false;
		door = false;      

		//sets the background color to white
		setBackground(Color.white);   
		addMouseListener(new MyMouseListener());       
	  }

	  
	public void paint(Graphics g){
		//calls on the super class
		super.paint(g);

		//draws the roof and defines its dimensions
		g.drawLine(80, 100, 320, 100);
		g.drawLine(80, 100, 200, 40);
		g.drawLine(200, 40, 320, 100);

		//draws the house and defines it dimensions
		g.setColor(Color.black);
		g.drawRect(100, 100, 200, 100);

		//draws the left window open.
		g.fillRect(120, 130, 40, 40);

	    //draws the right window open.
		g.fillRect(240, 130, 40, 40);

		//draws the door open.
		g.fillRect(180, 130, 40, 70);          

		if (leftWindow) {	        
			//draws the closed left window
	        g.setColor(Color.white);
	        g.fillRect(120, 130, 40, 40);
	        g.setColor(Color.black);
			g.drawRect(120, 130, 40, 40);
	        g.drawLine(140, 130, 140, 170);
	        g.drawLine(120, 150, 160, 150);
		}
  
		if (rightWindow) {
	    	 //draws the closed right window
			g.setColor(Color.white);
			g.fillRect(240, 130, 40, 40);
			g.setColor(Color.black);
			g.drawRect(240, 130, 40, 40);
			g.drawLine(260, 130, 260, 170);
			g.drawLine(240, 150, 280, 150);
		}

	     if (door) {
	    	 //draws the closed door
	    	 g.setColor(Color.white);
	    	 g.fillRect(180, 130, 40, 70);
	    	 g.setColor(Color.black);
	    	 g.drawRect(180, 130, 40, 70);
	    	 g.fillOval(210, 165, 07, 07);
	     }    
	}

	private class MyMouseListener implements MouseListener{
		

		public void mousePressed(MouseEvent e){}

		public void mouseReleased(MouseEvent e){}

		public void mouseEntered(MouseEvent e){}

		public void mouseExited(MouseEvent e){}

		public void mouseClicked(MouseEvent e){
			//gets the mouse position
			int x = e.getX();
	        int y = e.getY();

	        //repaints if it is clicked and closes or opens the left window
	        boolean WindowLeft = (x >= 120 && x < 160 && y >= 130 && y <= 170);
	        if (WindowLeft)
	        {
	           leftWindow = !leftWindow;
	           repaint();               
	        }

	        //repaints if it is clicked and closes or opens the right window
	        boolean WindowRight = (x >= 240 && x < 280 && y >= 130 && y <= 170);
	        if (WindowRight)
	        {
	           rightWindow = !rightWindow;
	           repaint();
	        }

	        //repaints if it is clicked and closes or opens the door
	        boolean Door = (x >= 180 && x < 220 && y >= 40 && y <= 200);
	        if (Door)
	        {            
	           door = !door;
	           repaint();     
	        }  

	        else;  
	     
		}
	  
	}
}
