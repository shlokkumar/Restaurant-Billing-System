package Restaurant;
import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Login {
	/**
	 * @wbp.parser.entryPoint
	 */
	public void display() {
		JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField textField_1;
		JPasswordField passwordField;
		JLabel label_1;
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField.setBounds(314, 182, 180, 28);
		frame.getContentPane().add(passwordField);
		
		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(218, 57, 280, 37);
		frame.getContentPane().add(label_1);
		
		
		JLabel label = new JLabel("Username");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(218, 126, 84, 37);
		frame.getContentPane().add(label);
		
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(218, 176, 84, 37);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(314, 132, 180, 28);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(247, 274, 114, 37);
		
		
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = null;
				try {
					
					con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite-tools-win32-x86-3170000/test.db");
					Statement statement = con.createStatement();
					String u = textField_1 .getText();
					String p = passwordField.getText();
					String sql = "SELECT * FROM data WHERE u_name='"+u+"' and pwd='" + p + "'"  ;
					ResultSet rs = statement.executeQuery(sql);
					if(rs.next()) {
						lblNewLabel_1.setText("Login Successful!!");												
					}
					else {
						lblNewLabel_1.setText("Incorrect Credentials!!");
						
					}
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		
		
		
		
		frame.getContentPane().setLayout(null);
		
		
		frame.setVisible(true);
	}
	public void change() {
		Billing b = new Billing();
		b.bill();
	}
}
