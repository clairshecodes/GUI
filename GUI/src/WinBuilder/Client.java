package WinBuilder;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class Client implements Serializable{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(400, 300));
		frame.getContentPane().setBackground(new Color(51, 102, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Bubble Shooter");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel.setForeground(UIManager.getColor("TextPane.inactiveBackground"));
		lblNewLabel.setBackground(UIManager.getColor("TextPane.inactiveBackground"));
		lblNewLabel.setBounds(109, 21, 260, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setForeground(new Color(47, 79, 79));
		panel.setBounds(142, 64, 164, 167);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("RoomID");
		lblNewLabel_1.setBounds(21, 66, 85, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("UserName");
		lblNewLabel_1_1.setBounds(21, 13, 85, 16);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField(); //name
		textField.setBounds(15, 30, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(); //roomID
		textField_1.setColumns(10);
		textField_1.setBounds(16, 83, 130, 26);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(21, 123, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/bubbles-icon.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(6, 11, 350, 260);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
