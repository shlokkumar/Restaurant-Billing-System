package Restaurant;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javafx.scene.text.Font;

public class Billing {

	 void bill() {
		
		
		JFrame frame;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		JTextField textField_3;
		JTextField textField_4;
		JTextField textField_5;
		JTextField textField_6;
		frame = new JFrame("BILLING");
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Burger");
		lblNewLabel.setBounds(50, 91, 85, 25);
		//lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFries = new JLabel("Fries");
		lblFries.setBounds(50, 122, 85, 25);
		//lblFries.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblFries);
		
		JLabel lblTacos = new JLabel("Tacos");
		lblTacos.setBounds(50, 154, 85, 25);
		//lblTacos.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblTacos);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(149, 94, 116, 22);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(149, 125, 116, 22);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(149, 157, 116, 22);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(8, 91, 33, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(8, 124, 33, 25);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(8, 156, 34, 25);
		frame.getContentPane().add(checkBox_1);
		
		JLabel lblDrinks = new JLabel("Drink");
		lblDrinks.setBounds(50, 221, 85, 33);
		//lblDrinks.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblDrinks);
		
		String[] d = {"Select Any Drink", "Coca-Cola", "Pepsi", "Sprite", "Fanta", "Diet Coke", "Dew"};
		
		JComboBox comboBox = new JComboBox(d);
		comboBox.setBounds(149, 226, 116, 26);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(8, 227, 33, 25);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblItem = new JLabel("ITEM");
		lblItem.setBounds(50, 49, 56, 16);
		//lblItem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblItem);
		
		JLabel lblNewLabel_1 = new JLabel("QUANTITY");
		lblNewLabel_1.setBounds(149, 42, 116, 30);
		//lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 328, 107, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(21, 328, 116, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("FOOD");
		//lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(42, 289, 116, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DRINKS");
		//lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(170, 288, 125, 25);
		frame.getContentPane().add(lblNewLabel_3);
		textField_5 = new JTextField();
		textField_5.setBounds(173, 395, 92, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(363, 93, 33, 25);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(363, 126, 33, 25);
		frame.getContentPane().add(checkBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("TAX");
		lblNewLabel_4.setBounds(404, 94, 92, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblHomeDelivery = new JLabel("HOME DELIVERY");
		lblHomeDelivery.setBounds(404, 125, 100, 22);
		frame.getContentPane().add(lblHomeDelivery);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setBounds(380, 190, 372, 227);
		frame.getContentPane().add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setBounds(363, 191, 383, 226);
		frame.getContentPane().add(textArea);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					textField.setEditable(true);
				}
				else {
					textField.setEditable(false);
				}
			}
		});
		
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected()) {
					textField_1.setEditable(true);
				}
				else {
					textField_1.setEditable(false);
				}
			}
		});
		
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox_1.isSelected()) {
					textField_2.setEditable(true);
				}
				else {
					textField_2.setEditable(false);
				}
			}
		});
		
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1.isSelected()) {
					comboBox.setEditable(true);
				}
				else {
					comboBox.setEditable(false);
				}
			}
		});
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float amount = 0;
				
				if(chckbxNewCheckBox.isSelected()) {
					amount+=80 * Integer.parseInt(textField.getText());
				}
				if(checkBox.isSelected()) {
					amount+=40 * Integer.parseInt(textField_1.getText());
				}
				if(checkBox_1.isSelected()) {
					amount+=90 * Integer.parseInt(textField_2.getText());
				}
				textField_4.setText(Float.toString(amount));
				
				if(chckbxNewCheckBox_1.isSelected()) {
					textField_3.setText("45");				
				}
				
				if(chckbxNewCheckBox_2.isSelected()) {
					amount+=(1.05 * amount);
				}
				if(checkBox_2.isSelected()) {
					amount+=30.0;
				}
				
				textField_5.setText(Float.toString(amount + 45));
				
			}
		});
		//btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(21, 392, 127, 25);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("RECEIPT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText("Burger	" + 80 * Integer.parseInt(textField.getText()) + '\n' + 
						"Fries	" + 40 * Integer.parseInt(textField_1.getText()) + '\n' + 
						"Tacos	" + 90 * Integer.parseInt(textField_2.getText()) + '\n' + 
						comboBox.getItemAt(comboBox.getSelectedIndex()) + '\t' + "45" + '\n'
						);				
				
			}
		});
		//btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(570, 93, 132, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}

}
