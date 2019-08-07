package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Welcome extends JFrame {

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
					Welcome frame = new Welcome();
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
	public Welcome() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This will avoid the exit from the entire application
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Verdana", Font.BOLD, 24));
		lblWelcome.setBounds(10, 11, 132, 30);
		contentPane.add(lblWelcome);
		
		JTextArea txtrBlaBlaBla = new JTextArea();
		txtrBlaBlaBla.setBackground(UIManager.getColor("Button.background"));
		txtrBlaBlaBla.setFont(new Font("Verdana", Font.BOLD, 12));
		txtrBlaBlaBla.setText("Welcome!\r\n\r\nThis Application enables the collection of geographic information, the production of \r\ninsights from this information, and the presentation of information in graphical\r\ntools, using WiGLE WiFi Wardriving mobile app.\r\n\r\nTo start the process, upload CSV files to the system, from File -> Open File/Folder.\r\n\r\nThen, you can select a filter (or not select) and create a database.\r\n\r\nOnce the database is present, you can do more by clicking on Algorithms.\r\n\r\nFeel free to save this information as a CSV file or as a KML file that can be opened\r\nby Google Maps.\r\n\r\nThe team wishes you effective use of the software.");
		txtrBlaBlaBla.setBounds(10, 51, 554, 300);
		contentPane.add(txtrBlaBlaBla);
	}

}

