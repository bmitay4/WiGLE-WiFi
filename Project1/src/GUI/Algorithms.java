package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Algorithms extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtYyyymmddHhmmss;
	private JTextField txtMaxLat;
	private JTextField txtMaxAlt;
	private JTextField txtSignal;
	private JTextField txtSignal_1;
	private JTextField txtMac;
	private JTextField txtMac_1;
	private JTextField txtSignal_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Algorithms frame = new Algorithms();
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
	public Algorithms() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFilters = new JLabel("Algorithms");
		lblFilters.setFont(new Font("Verdana", Font.BOLD, 24));
		lblFilters.setBounds(10, 11, 160, 29);
		contentPane.add(lblFilters);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 52, 292, 201);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Algorithm A Settings", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblInitialTime = new JLabel("Set Mac");
		lblInitialTime.setBounds(10, 76, 64, 14);
		panel.add(lblInitialTime);
		
		txtYyyymmddHhmmss = new JTextField();
		txtYyyymmddHhmmss.setText("Mac Number");
		txtYyyymmddHhmmss.setBounds(84, 73, 154, 20);
		panel.add(txtYyyymmddHhmmss);
		txtYyyymmddHhmmss.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Algorithm B Settings", null, panel_1, null);
		panel_1.setLayout(null);
		
		txtMaxLat = new JTextField();
		txtMaxLat.setToolTipText("");
		txtMaxLat.setText("Enter String");
		txtMaxLat.setColumns(10);
		txtMaxLat.setBounds(106, 8, 177, 20);
		panel_1.add(txtMaxLat);
		
		txtMaxAlt = new JTextField();
		txtMaxAlt.setHorizontalAlignment(SwingConstants.LEFT);
		txtMaxAlt.setText("Mac1");
		txtMaxAlt.setColumns(10);
		txtMaxAlt.setBounds(106, 68, 107, 20);
		panel_1.add(txtMaxAlt);
		
		JRadioButton rdbtnByString = new JRadioButton("By String");
		rdbtnByString.setBounds(10, 7, 80, 23);
		panel_1.add(rdbtnByString);
		
		JRadioButton rdbtnByValues = new JRadioButton("By Values");
		rdbtnByValues.setBounds(10, 67, 92, 23);
		panel_1.add(rdbtnByValues);
		
		txtSignal = new JTextField();
		txtSignal.setText("Signal1");
		txtSignal.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignal.setColumns(10);
		txtSignal.setBounds(223, 68, 54, 20);
		panel_1.add(txtSignal);
		
		txtSignal_1 = new JTextField();
		txtSignal_1.setText("Signal2");
		txtSignal_1.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignal_1.setColumns(10);
		txtSignal_1.setBounds(223, 99, 54, 20);
		panel_1.add(txtSignal_1);
		
		txtMac = new JTextField();
		txtMac.setText("Mac2");
		txtMac.setHorizontalAlignment(SwingConstants.LEFT);
		txtMac.setColumns(10);
		txtMac.setBounds(106, 99, 107, 20);
		panel_1.add(txtMac);
		
		txtMac_1 = new JTextField();
		txtMac_1.setText("Mac3");
		txtMac_1.setHorizontalAlignment(SwingConstants.LEFT);
		txtMac_1.setColumns(10);
		txtMac_1.setBounds(106, 130, 107, 20);
		panel_1.add(txtMac_1);
		
		txtSignal_2 = new JTextField();
		txtSignal_2.setText("Signal3");
		txtSignal_2.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignal_2.setColumns(10);
		txtSignal_2.setBounds(223, 130, 54, 20);
		panel_1.add(txtSignal_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Algorithm A");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(10, 260, 125, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxLocationFilter = new JCheckBox("Algorithm B");
		chckbxLocationFilter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxLocationFilter.setBounds(141, 260, 125, 23);
		contentPane.add(chckbxLocationFilter);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 320, 2);
		contentPane.add(separator);
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSaveChanges.setFont(new Font("Verdana", Font.BOLD, 15));
		btnSaveChanges.setBounds(164, 319, 160, 32);
		contentPane.add(btnSaveChanges);
	}
}
