/*
 * Tejas Pinjala
 * COSC 2436 / Professor Woods
 * 03/31/2021
 * Joes Automotive
 */

//imports the package
package JoesAutomotive;

//import the necessary classes required for the program
import javax.swing.*;	
import java.awt.event.*;	
import java.awt.*;


public class JoesAutomotive extends JFrame{
	//declares the main method that displays the program
	public static void main(String[] args) {
        new JoesAutomotive();
    }
	
	//declares the checkbox button for each of the services available
	JTextField hours = new JTextField(3);
	JCheckBox Oil_field = new JCheckBox("Oil Change");
	JCheckBox lube_field = new JCheckBox("Lube job");
	JCheckBox Radiatorbox = new JCheckBox("Radiator flush");
	JCheckBox transmissionbox = new JCheckBox("Transmission flush");
	JCheckBox inspection_box = new JCheckBox("Inspection");
	JCheckBox muffler_box = new JCheckBox("Muffler replacement");
	JCheckBox tire_box = new JCheckBox("Tire rotation");
	JCheckBox non_box = new JCheckBox("");
	JButton button = new JButton("Total"); 
	
	
	//constructor method
	public JoesAutomotive() {
		//sets the title of the window
		setTitle("Joe's Automotive");
		
		//exits when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sets the layout
        setLayout(new BorderLayout() );

        //creates a new panel
        JPanel panel = new JPanel();  
        JPanel leftPanel = new JPanel();

        button.addActionListener(new ButtonListener());

        //adds all the declared checkboxes to the leftpanel
        leftPanel.add(Oil_field);
        leftPanel.add(lube_field);
        leftPanel.add(Radiatorbox);
        leftPanel.add(transmissionbox);
        leftPanel.add(inspection_box);
        leftPanel.add(muffler_box);
        leftPanel.add(tire_box);
        leftPanel.add(non_box);
        leftPanel.add(hours);
        panel.add(button);

        //adds the panels
        add(panel, BorderLayout.SOUTH);        
        add(leftPanel, BorderLayout.WEST);

        //makes the window visible
        pack();                
        setVisible(true);    
    }

    
	//method impliments the action listener
    private class ButtonListener implements ActionListener{
    	//performs the action when button is clicked
        public void actionPerformed(ActionEvent e) {
            String in;            
            double non_boxRoutineCost, Total = 0;    

            //adds the money to the total based on checkboxes selected
            if ( Oil_field.isSelected()) {
            	Total += 26;
            }
            if ( lube_field.isSelected()) {
            	Total += 18;
            }
            if ( Radiatorbox.isSelected()) {
            	Total += 30;
            }
            if ( transmissionbox.isSelected()) {
            	Total += 80;
            }
            if ( inspection_box.isSelected()) {
            	Total += 15;
            }
            if ( muffler_box.isSelected()) {
            	Total += 100;
            }
            if ( tire_box.isSelected()) {
            	Total += 20;
            }
            if ( non_box.isSelected()) {
                in = hours.getText();
                non_boxRoutineCost = Double.parseDouble(in) * 20;
                Total += non_boxRoutineCost;
            }

            //displays the total amount of money that is needed to be paid
            JOptionPane.showMessageDialog(null, "Your subtotal comes to $" + Total);

        }
    }

}

	