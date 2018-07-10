package Restaurant;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Restaurant.Login;

public class Welcome {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSimpleBillingSystem = new JLabel("SIMPLE BILLING SYSTEM");
		lblSimpleBillingSystem.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSimpleBillingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleBillingSystem.setBounds(246, 129, 263, 31);
		frame.getContentPane().add(lblSimpleBillingSystem);
		
		JButton btnEnter = new JButton("ENTER !!");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.display();
				frame.dispose();
			}
		});
		btnEnter.setBounds(323, 209, 97, 25);
		frame.getContentPane().add(btnEnter);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
