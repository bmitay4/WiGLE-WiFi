package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This will avoid the exit from the entire application
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAll = new JLabel("\u00A9 2018 All rights Reserved");
		lblAll.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAll.setBounds(10, 226, 212, 24);
		contentPane.add(lblAll);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setFont(new Font("Verdana", Font.BOLD, 24));
		lblAbout.setBounds(10, 11, 160, 29);
		contentPane.add(lblAbout);
		
		JLabel lblVersiona = new JLabel("Version: 1a");
		lblVersiona.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVersiona.setBounds(351, 226, 83, 24);
		contentPane.add(lblVersiona);
		
		JTextArea txtrCreditsForHani = new JTextArea();
		txtrCreditsForHani.setBackground(UIManager.getColor("Button.background"));
		txtrCreditsForHani.setFont(new Font("Verdana", Font.BOLD, 12));
		txtrCreditsForHani.setText("This software builded as an assignment of Object Oriented\r\nProgramming course, at Ariel University, Israel\r\n\r\nCredits for: \r\nHani Bakbani\r\nAvital Israeli\r\nItay Ben Moshe\r\n\r\nVisit us at https://github.com/itaybm/ArielOOP");
		txtrCreditsForHani.setBounds(10, 51, 414, 176);
		contentPane.add(txtrCreditsForHani);
	}
}

