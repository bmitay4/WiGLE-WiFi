package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import DB.MySQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DB extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField texthost;
	private JTextField txtRoot;
	private JTextField textport;
	private JTextField textpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DB frame = new DB();
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
	public DB() {
		//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 52, 414, 146);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Login Details", null, panel, null);
		panel.setLayout(null);

		JLabel lblHost = new JLabel("Hostname");
		lblHost.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHost.setBounds(10, 7, 64, 20);
		panel.add(lblHost);

		JLabel lblPort = new JLabel("Port");
		lblPort.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPort.setBounds(225, 6, 64, 22);
		panel.add(lblPort);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(10, 77, 64, 22);
		panel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(225, 77, 64, 22);
		panel.add(lblPassword);

		texthost = new JTextField();
		texthost.setFont(new Font("Tahoma", Font.PLAIN, 12));
		texthost.setText("5.29.193.52");
		texthost.setColumns(10);
		texthost.setBounds(79, 8, 100, 22);
		panel.add(texthost);

		txtRoot = new JTextField();
		txtRoot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRoot.setText("oop1");
		txtRoot.setColumns(10);
		txtRoot.setBounds(79, 79, 100, 22);
		panel.add(txtRoot);

		textport = new JTextField();
		textport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textport.setText("3306/oop_course_ariel");
		textport.setColumns(10);
		textport.setBounds(299, 8, 100, 22);
		panel.add(textport);

		textpass = new JTextField();
		textpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textpass.setText("Lambda1();");
		textpass.setColumns(10);
		textpass.setBounds(299, 79, 100, 22);
		panel.add(textpass);

		JLabel lblImportDatabase = new JLabel("Import DataBase");
		lblImportDatabase.setFont(new Font("Verdana", Font.BOLD, 24));
		lblImportDatabase.setBounds(10, 11, 250, 30);
		contentPane.add(lblImportDatabase);

		JButton btnLoadDatabas = new JButton("Load DataBase");
		btnLoadDatabas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MySQL.main(texthost.getText(), textport.getText(), txtRoot.getText(), textpass.getText());
					JOptionPane.showMessageDialog(null, "DB loaded successfully");
					setVisible(false);
				} catch (SQLException e1){
				}

			}
		});
		btnLoadDatabas.setFont(new Font("Verdana", Font.BOLD, 15));
		btnLoadDatabas.setBounds(221, 209, 203, 32);
		contentPane.add(btnLoadDatabas);

		JButton button = new JButton("Return");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setBounds(10, 209, 201, 32);
		contentPane.add(button);
	}
}
