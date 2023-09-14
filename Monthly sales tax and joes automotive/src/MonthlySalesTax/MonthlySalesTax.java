/*
 * Tejas Pinjala
 * COSC 2436 / Professor Woods
 * 03/31/2021
 * Monthly Sales Tax: 
 * A retail company must file a monthly sales tax report listing the total sales for
 * the month, and the amount of state and county sales tax collected. The state
 * sales tax rate is 4 percent and the county sales tax rate is 2 percent. Create a
 * GUI application that allows the user to enter the total sales for the month into
 * a text field.
 */

//imports the package
package MonthlySalesTax;

//imports the required classes
import java.awt.event.*;
import javax.swing.*;

public class MonthlySalesTax extends JFrame{
	//declares the necessary fields
    public JPanel frame;                                
    public JTextField textField;
    public JButton calcButton;
    
    //constructor method
    public MonthlySalesTax() {
    	
        //sets the title of the window
        setTitle("Monthly Sales Tax");
        
        //declares and sets the length and width of the window screen
    	final int width = 300;
    	final int height = 100;
        setSize(width, height);
        
        //builds the panel and add it to the frame.
        buildPanel();
        
        //adds the panel and displays it
        add(frame);
        setVisible(true);
        
        //exits when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //declares a method thats adds a label, textfield and a button
    public void buildPanel() {
    	
        //creates a label with the following text
        JLabel messageLabel = new JLabel("Enter the total sales for the month: ");
        //create a text field
        textField = new JTextField(12);
        //create a button
        calcButton = new JButton("Calculate");
        //adds an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());
        //creates a panel object
        frame = new JPanel();
        
        //adds them to the frame
        frame.add(messageLabel);
        frame.add(textField);
        frame.add(calcButton);
    }
    
    //action listener class 
    public class CalcButtonListener implements ActionListener{
    	//perform the action when the calculate button is clicked
        public void actionPerformed(ActionEvent e) {
        	
        	//stores user input
            String input;       
            
            //county and state tax rates
            final double countytax = 0.02;
            final double statetax = 0.04;
            
            //declares the doubles to hold the values
            double monthlySales, countySalesTax, stateSalesTax, totalSalesTax;                       
            
            //gets the user input 
            input = textField.getText();
            
            //converts to a double
            monthlySales = Double.parseDouble(input);
            
            //calculates the county sales tax, state sales tax and the total sales tax
            countySalesTax = monthlySales * countytax;
            stateSalesTax = monthlySales * statetax;
            totalSalesTax = countySalesTax + stateSalesTax;
            
            //displays the calculations
            JOptionPane.showMessageDialog(null, String.format("County Sales Tax: $%,.2f"
            		+ "\nState Sales Tax: $%,.2f"
            		+ "\nTotal Sales Tax: $%,.2f",
            countySalesTax, stateSalesTax, totalSalesTax));
        }
    }
}

