package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Filters extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtYyyymmddHhmmss;
	private JTextField txtYyyymmddHhmmss_1;
	private JTextField txtMinLat;
	private JTextField txtMinLon;
	private JTextField txtMinAlt;
	private JTextField txtMaxLat;
	private JTextField txtMaxLon;
	private JTextField txtMaxAlt;
	private JTextField txtIdNumber;

	public String initTime;
	public String FinalTime;

	public String ID;

	public String minLat, maxLat;
	public String minLon, maxLon;
	public String minAlt, maxAlt;
	public boolean[] checkBox = new boolean[4];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Filters frame = new Filters();
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
	public Filters() {
		//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFilters = new JLabel("Filters");
		lblFilters.setFont(new Font("Verdana", Font.BOLD, 24));
		lblFilters.setBounds(10, 11, 160, 29);
		contentPane.add(lblFilters);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 52, 414, 130);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Time Settings", null, panel, null);
		panel.setLayout(null);

		JLabel lblInitialTime = new JLabel("Initial Time");
		lblInitialTime.setBounds(10, 11, 64, 14);
		panel.add(lblInitialTime);

		JLabel lblFinalTime = new JLabel("Final Time");
		lblFinalTime.setBounds(10, 77, 64, 14);
		panel.add(lblFinalTime);

		txtYyyymmddHhmmss = new JTextField();
		txtYyyymmddHhmmss.setText("yyyy-MM-dd HH:mm:ss");
		txtYyyymmddHhmmss.setBounds(84, 8, 154, 20);
		panel.add(txtYyyymmddHhmmss);
		txtYyyymmddHhmmss.setColumns(10);

		txtYyyymmddHhmmss_1 = new JTextField();
		txtYyyymmddHhmmss_1.setText("yyyy-MM-dd HH:mm:ss");
		txtYyyymmddHhmmss_1.setColumns(10);
		txtYyyymmddHhmmss_1.setBounds(84, 74, 154, 20);
		panel.add(txtYyyymmddHhmmss_1);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Location Settings", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblLatitude = new JLabel("Latitude");
		lblLatitude.setBounds(10, 11, 64, 14);
		panel_1.add(lblLatitude);

		JLabel lblLongitude = new JLabel("Longitude ");
		lblLongitude.setBounds(10, 41, 64, 14);
		panel_1.add(lblLongitude);

		JLabel lblAltitude = new JLabel("Altitude");
		lblAltitude.setBounds(10, 71, 64, 14);
		panel_1.add(lblAltitude);

		txtMinLat = new JTextField();
		txtMinLat.setText("Min Lat");
		txtMinLat.setToolTipText("");
		txtMinLat.setColumns(10);
		txtMinLat.setBounds(84, 8, 110, 20);
		panel_1.add(txtMinLat);

		txtMinLon = new JTextField();
		txtMinLon.setText("Min Lon");
		txtMinLon.setColumns(10);
		txtMinLon.setBounds(84, 38, 110, 20);
		panel_1.add(txtMinLon);

		txtMinAlt = new JTextField();
		txtMinAlt.setText("Min Alt");
		txtMinAlt.setColumns(10);
		txtMinAlt.setBounds(84, 68, 110, 20);
		panel_1.add(txtMinAlt);

		txtMaxLat = new JTextField();
		txtMaxLat.setToolTipText("");
		txtMaxLat.setText("Max Lat");
		txtMaxLat.setColumns(10);
		txtMaxLat.setBounds(236, 8, 110, 20);
		panel_1.add(txtMaxLat);

		txtMaxLon = new JTextField();
		txtMaxLon.setText("Max Lon");
		txtMaxLon.setColumns(10);
		txtMaxLon.setBounds(236, 38, 110, 20);
		panel_1.add(txtMaxLon);

		txtMaxAlt = new JTextField();
		txtMaxAlt.setHorizontalAlignment(SwingConstants.LEFT);
		txtMaxAlt.setText("Max Alt");
		txtMaxAlt.setColumns(10);
		txtMaxAlt.setBounds(236, 68, 110, 20);
		panel_1.add(txtMaxAlt);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("ID Settings", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblId = new JLabel("Set ID");
		lblId.setBounds(10, 41, 48, 14);
		panel_2.add(lblId);

		txtIdNumber = new JTextField();
		txtIdNumber.setToolTipText("");
		txtIdNumber.setText("ID Number");
		txtIdNumber.setColumns(10);
		txtIdNumber.setBounds(68, 38, 221, 20);
		panel_2.add(txtIdNumber);

		JCheckBox chckbxTimeFilter = new JCheckBox("Time Filter");
		chckbxTimeFilter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxTimeFilter.setBounds(10, 189, 101, 23);
		contentPane.add(chckbxTimeFilter);

		JCheckBox chckbxLocationFilter = new JCheckBox("Location Filter");
		chckbxLocationFilter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxLocationFilter.setBounds(113, 189, 125, 23);
		contentPane.add(chckbxLocationFilter);

		JCheckBox chckbxIdFilter = new JCheckBox("ID Filter");
		chckbxIdFilter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIdFilter.setBounds(240, 189, 85, 23);
		contentPane.add(chckbxIdFilter);
		
		JCheckBox chckbxNoFilter = new JCheckBox("NO Filter");
		chckbxNoFilter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNoFilter.setBounds(327, 189, 110, 23);
		contentPane.add(chckbxNoFilter);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 414, 2);
		contentPane.add(separator);

		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initTime = txtYyyymmddHhmmss.getText();
				FinalTime = txtYyyymmddHhmmss_1.getText();
				ID = txtIdNumber.getText();
				minLat = txtMinLat.getText();
				maxLat = txtMaxLat.getText();
				minLat = txtMinLon.getText();
				maxLat = txtMaxLon.getText();
				minLat = txtMinAlt.getText();
				maxLat = txtMaxAlt.getText();
				checkBox[0] = chckbxTimeFilter.isSelected();
				checkBox[1] = chckbxLocationFilter.isSelected();
				checkBox[2] = chckbxIdFilter.isSelected();
				checkBox[3] = chckbxNoFilter.isSelected();

				if(checkBox[3] == false && checkBox[0] == false && checkBox[1] == false && checkBox[2] == false) JOptionPane.showMessageDialog(null, "You have not selected any filters");
				else{
					JOptionPane.showMessageDialog(null, "Filter(s) loaded");
					setVisible(false);
				}
			}
		});
		btnSaveChanges.setFont(new Font("Verdana", Font.BOLD, 15));
		btnSaveChanges.setBounds(264, 219, 160, 32);
		contentPane.add(btnSaveChanges);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnReturn.setFont(new Font("Verdana", Font.BOLD, 15));
		btnReturn.setBounds(10, 219, 160, 32);
		contentPane.add(btnReturn);
		
	}
}
