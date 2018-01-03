import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class testGUI {

	private JFrame frame;
	private JTextField WigglePath;
	private Matefet matefet = new Matefet();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testGUI window = new testGUI();
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
	public testGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 21));
		frame.getContentPane().setBackground(new Color(0, 0, 153));
		frame.getContentPane().setForeground(new Color(0, 0, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnExample = new JButton("Example");
		btnExample.setForeground(new Color(0, 0, 0));
		btnExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "good choice:)");
				String path = WigglePath.getText();
				matefet.goToOpenFolder(path);
			}
		});
		btnExample.setBackground(new Color(102, 0, 102));
		btnExample.setFont(new Font("Sylfaen", Font.BOLD, 26));
		btnExample.setBounds(12, 48, 154, 68);
		frame.getContentPane().add(btnExample);
		
		WigglePath = new JTextField();
		WigglePath.setText("Enter folder");
		WigglePath.setBounds(191, 72, 229, 22);
		frame.getContentPane().add(WigglePath);
		WigglePath.setColumns(10);
	}
}
