/* 
 * Tejas Pinjala
 * COSC - 1437
 * Professor Woods
 * 12/09/2020
 * 
 * Conference Registration System
 *
 */

package ConferenceRegistrationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ConferenceRegistration {
	public static void main(String [] args) {
		//creates a new frame
		JFrame frame = new JFrame("Conference Registration");
		
		//calls on getContentPane method and sets the panel layout to null
		frame.getContentPane().setLayout(null);
		
		//declares label to select the registration type
		JLabel message = new JLabel("Select the registation type.");
		message.setBounds(50, 10, 200, 20);
		frame.add(message);
		//declares a ComboBox to choose the the gereral or student registration
		final JComboBox<String> comboBox = new JComboBox<String>();
		//adds general registration and student registration to the combo box
		comboBox.addItem("General Registration");
		comboBox.addItem("Student Registration");
		//sets the position of the combo box
		comboBox.setBounds(80, 50, 200, 20);
		//displays them on the frame
		frame.add(comboBox);
		
		//declares a button group
		final ButtonGroup buttonGroup = new ButtonGroup();
				
		//declares label that asks the user whether they want to attend the night dinner
		JLabel message1 = new JLabel("Would you like to attend the opening night dinner?");
		message1.setBounds(50, 90, 500, 20);
		frame.add(message1);
		//declares radio buttons that check whether you want to eat the night dinner
		final JRadioButton radioButton1 = new JRadioButton("Yes");
		final JRadioButton radioButton2 = new JRadioButton("No");
		//adds the radio boxes
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		//sets the position of the radio button
		radioButton1.setBounds(80, 130, 100, 30);
		radioButton2.setBounds(80, 170, 100, 30);
		//displays them on the frame
		frame.add(radioButton1);
		frame.add(radioButton2);
		
		
		//declared label that asks the user to choose an optional workshop
		JLabel message2 = new JLabel("Select the workshops (optional)");
		message2.setBounds(50, 210, 500, 20);
		frame.add(message2);
		//declares buttons to select the workshop groups they're interested in
		final JCheckBox checkBox1 = new JCheckBox("Introduction to E-commerce");
		final JCheckBox checkBox2 = new JCheckBox("The future of the web");
		final JCheckBox checkBox3 = new JCheckBox("Advanced Java Programming");
		final JCheckBox checkBox4 = new JCheckBox("Network Security");
		//sets the position of the check boxes
		checkBox1.setBounds(80, 250, 500, 50);
		checkBox2.setBounds(80, 290, 500, 50);
		checkBox3.setBounds(80, 330, 500, 50);
		checkBox4.setBounds(80, 370, 500, 50);
		//displays them on the frame
		frame.add(checkBox1);
		frame.add(checkBox2);
		frame.add(checkBox3);
		frame.add(checkBox4);

		
		//declares a label that prints out the total summary amount and the things they selected
		JLabel message3 = new JLabel("Registration Summary: ");
		message3.setBounds(50, 500, 500, 20);
		frame.add(message3);
		
		//declares a textarea to display the summary
		final TextArea text = new TextArea();
		//sets the position
		text.setBounds(50, 550, 600, 200);
		//displays on the frame
		frame.add(text);
		
		
		//declares a submit and cancel button 
		JButton submit = new JButton("Submit");
		JButton cancel = new JButton("Cancel");
		//sets the position
		submit.setBounds(300, 450, 100, 20);
		cancel.setBounds(500, 450, 100, 20);
		//displays them on the frame
		frame.add(submit);
		frame.add(cancel);
		
		//defines what happens when the user selects the required things and clicks submit
		submit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//holds the combo box index
				int type = comboBox.getSelectedIndex();
				
				//declares a string buffer
				StringBuffer buffer = new StringBuffer();
				
				//displays in the summary
				buffer.append("Registration type: ");
				
				//holds the total amount of money
				double money = 0;
				
				//if the general registration is chosen it adds 895 to the total
				if(type == 0) {
					money += 895;
					buffer.append(comboBox.getSelectedItem().toString());
				
				//if the student registration is chosen it adds 495 to the total
				} else if(type == 1) {
					money += 495;
					buffer.append(comboBox.getSelectedItem().toString());
				}
				
				buffer.append("\n\n");
				
				//displays if dinner was chosen or not in the summary
				buffer.append("Dinner: ");
				
				boolean dinner = false;
				
				//adds 30 to the money if dinner is selected
				if(radioButton1.isSelected()) {
					dinner = true;
					money += 30;
				} else {
					dinner = false;
				}
				
				buffer.append(dinner);
				buffer.append("\n\n");
				
				//adds 295 to money if Introduction to E-commerce is selected
				buffer.append("Workshops: ");
				if(checkBox1.isSelected()) {
					money += 295;
					buffer.append("\n");
					buffer.append("Introduction to E-commerce");
				} 
				
				//adds 295 to money if The future of the web is selected
				if(checkBox2.isSelected()) {
					money += 295;
					buffer.append("\n");
					buffer.append("The future of the web");
				}
				
				//adds 395 to money if Advanced java programming is selected
				if(checkBox3.isSelected()) {
					money += 395;
					buffer.append("\n");
					buffer.append("Advanced Java Programming");
				}
				
				//adds 395 to money if network security is selected
				if(checkBox4.isSelected()) {
					money += 395;
					buffer.append("\n");
					buffer.append("Network Security");
				}
				
				//shows the total amount they need to pay
				buffer.append("\n\nTotal: " + money);
				text.setText(buffer.toString());
			}
		});
		
		//resets everything to default when cancel is clicked
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedIndex(0);
				buttonGroup.clearSelection();
				
				checkBox1.setSelected(false);
				checkBox2.setSelected(false);
				checkBox3.setSelected(false);
				checkBox4.setSelected(false);
				
				text.setText("");
			}
		});
		
		//displays the frame and makes it visible
		frame.getContentPane().add(submit);
		frame.setSize(700,800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
