package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Algorithms extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMacNum;
	private JTextField txtMacStr;
	private JTextField Mac1;
	private JTextField txtSignal1;
	private JTextField txtSignal2;
	private JTextField Mac2;
	private JTextField Mac3;
	private JTextField txtSignal3;
	private ArrayList<List<String>> Matrix;
	private Wrap WrapObj = new Wrap();
	public String Mac;

	public String MacString;

	public String uMac1, uMac2, uMac3;
	public String Sig1, Sig2, Sig3;

	boolean[] checkBox = new boolean[2];

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
	public void AlgorithmsSetMatrix(ArrayList<List<String>> Matrix){
		this.Matrix = Matrix;
	}
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
		tabbedPane.setBounds(10, 52, 292, 256);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Algorithm A Settings", null, panel, null);
		panel.setLayout(null);

		JLabel lblInitialTime = new JLabel("Set Mac");
		lblInitialTime.setBounds(10, 76, 64, 14);
		panel.add(lblInitialTime);

		txtMacNum = new JTextField();
		txtMacNum.setText("Mac Number");
		txtMacNum.setBounds(84, 73, 154, 20);
		panel.add(txtMacNum);
		txtMacNum.setColumns(10);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Algorithm B Settings", null, panel_1, null);
		panel_1.setLayout(null);

		txtMacStr = new JTextField();
		txtMacStr.setToolTipText("");
		txtMacStr.setText("Enter String");
		txtMacStr.setColumns(10);
		txtMacStr.setBounds(106, 8, 177, 20);
		panel_1.add(txtMacStr);

		Mac1 = new JTextField();
		Mac1.setHorizontalAlignment(SwingConstants.LEFT);
		Mac1.setText("Mac1");
		Mac1.setColumns(10);
		Mac1.setBounds(106, 68, 107, 20);
		panel_1.add(Mac1);

		JRadioButton rdbtnByString = new JRadioButton("By String");
		rdbtnByString.setBounds(10, 7, 80, 23);
		panel_1.add(rdbtnByString);

		JRadioButton rdbtnByValues = new JRadioButton("By Values");
		rdbtnByValues.setBounds(10, 67, 92, 23);
		panel_1.add(rdbtnByValues);

		txtSignal1 = new JTextField();
		txtSignal1.setText("Signal1");
		txtSignal1.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignal1.setColumns(10);
		txtSignal1.setBounds(223, 68, 54, 20);
		panel_1.add(txtSignal1);

		txtSignal2 = new JTextField();
		txtSignal2.setText("Signal2");
		txtSignal2.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignal2.setColumns(10);
		txtSignal2.setBounds(223, 99, 54, 20);
		panel_1.add(txtSignal2);

		Mac2 = new JTextField();
		Mac2.setText("Mac2");
		Mac2.setHorizontalAlignment(SwingConstants.LEFT);
		Mac2.setColumns(10);
		Mac2.setBounds(106, 99, 107, 20);
		panel_1.add(Mac2);

		Mac3 = new JTextField();
		Mac3.setText("Mac3");
		Mac3.setHorizontalAlignment(SwingConstants.LEFT);
		Mac3.setColumns(10);
		Mac3.setBounds(106, 130, 107, 20);
		panel_1.add(Mac3);

		txtSignal3 = new JTextField();
		txtSignal3.setText("Signal3");
		txtSignal3.setHorizontalAlignment(SwingConstants.LEFT);
		txtSignal3.setColumns(10);
		txtSignal3.setBounds(223, 130, 54, 20);
		panel_1.add(txtSignal3);

		JButton btnGenerateMacLocation = new JButton("Generate Mac Location");
		btnGenerateMacLocation.setBounds(10, 167, 267, 32);
		panel.add(btnGenerateMacLocation);
		btnGenerateMacLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mac = txtMacNum.getText();
				if(Mac.length() != 17) JOptionPane.showMessageDialog(null, "Please enter a valid Mac Address!");
				else WrapObj.AlgorithmA(Matrix, Mac);
			}
		});
		btnGenerateMacLocation.setFont(new Font("Verdana", Font.BOLD, 15));

		JButton btnGenerateSelfLocation = new JButton("Generate Self Location");
		btnGenerateSelfLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MacString = txtMacStr.getText();
				uMac1 = Mac1.getText();
				uMac2 = Mac2.getText();
				uMac3 = Mac3.getText();
				Sig1 = txtSignal1.getText();
				Sig2 = txtSignal2.getText();
				Sig3 = txtSignal3.getText();

				checkBox[0] = rdbtnByString.isSelected();// for string
				checkBox[1] = rdbtnByValues.isSelected();// for values

				if(checkBox[0] && checkBox[1]) JOptionPane.showMessageDialog(null, "You can not choose both algorithm B's methods");
				else if(!checkBox[0] && !checkBox[1]) JOptionPane.showMessageDialog(null, "You have not selected any of B's algorithms");
				else if(checkBox[0] && !checkBox[1]) WrapObj.AlgorithmB1(Matrix, MacString); //Algo B1, by String
				else if(!checkBox[0] && checkBox[1]) WrapObj.AlgorithmB2(Matrix, uMac1, uMac2, uMac3, Sig1, Sig2, Sig3);//Algo B2, by Values

			}
		});
		btnGenerateSelfLocation.setFont(new Font("Verdana", Font.BOLD, 15));
		btnGenerateSelfLocation.setBounds(10, 167, 267, 32);
		panel_1.add(btnGenerateSelfLocation);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 320, 2);
		contentPane.add(separator);

		JButton button = new JButton("Return");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setBounds(85, 319, 153, 32);
		contentPane.add(button);
	}

}
