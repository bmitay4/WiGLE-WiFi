package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import Row.Merge_Rows;
import Threads.State;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class MainGUI {

	private JFrame frame;
	private OpenFiles OpenFilesObj;
	private About AboutObj;
	private Welcome WelcomeObj;
	private Filters FilterObj;
	private Algorithms AlgorithmsObj;
	private Wrap WrapObj;
	private SaveFiles SaveFilesObj;
	private State StateObj;
	private DB DBObj;

	public String recordsCount;
	public DefaultListModel<Object> DLM;
	public DefaultListModel<Object> DBDLM;
	private JList<Object> list = new JList<>();
	private final JToggleButton tglbtnNewToggleButton = new JToggleButton("Filters");
	private ArrayList<List<String>> Matrix;
	private Merge_Rows Merge_Rows_Object = new Merge_Rows();
	private JTextField textField;
	private JTextField txtNone;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.setBounds(100, 100, 600, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list.setBounds(10, 11, 400, 100);

		list.setBorder(BorderFactory.createTitledBorder("Files Loaded"));
		DLM = new DefaultListModel<>();
		DBDLM = new DefaultListModel<>();
		Matrix = new ArrayList<>();
		WrapObj = new Wrap();
		FilterObj = new Filters();
		AlgorithmsObj = new Algorithms();
		StateObj = new State("Thread");
		DBObj = new DB();

		textField = new JTextField(); //records count
		txtNone = new JTextField();//filter type

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpenFile = new JMenuItem("Open File..");
		mntmOpenFile.addActionListener(new ActionListener() { //Open single file 
			public void actionPerformed(ActionEvent e) {
				OpenFilesObj = new OpenFiles();
				try {
					OpenFilesObj.openFile();
					DLM.addElement(OpenFilesObj.file.getAbsolutePath());
					list.setModel(DLM);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnFile.add(mntmOpenFile);

		JMenuItem mntmOpenFolder = new JMenuItem("Open Folder..");
		mntmOpenFolder.addActionListener(new ActionListener() { //Open whole folder
			public void actionPerformed(ActionEvent e) {
				OpenFilesObj = new OpenFiles();
				try {
					OpenFilesObj.openFolder();
					DLM.addElement(OpenFilesObj.file.getAbsolutePath());
					list.setModel(DLM);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnFile.add(mntmOpenFolder);

		JMenuItem mntmImportDb = new JMenuItem("Import DB..");
		mntmImportDb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DBObj.setVisible(true);
				try{
					WrapObj.DB();
					DBDLM.addElement("(SQL DataBase) host:  5.29.193.52:3306");
					list.setModel(DBDLM);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnFile.add(mntmImportDb);

		JMenu mnSaveAs = new JMenu("Save As");
		mnFile.add(mnSaveAs);

		JMenuItem mntmCsvFile = new JMenuItem("CSV File");
		mntmCsvFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//Saving the united CSV file
				if(Matrix.size() < 1) JOptionPane.showMessageDialog(null, "You have not created a database yet!");
				else {
					SaveFilesObj = new SaveFiles();
					Merge_Rows_Object.Merge(Matrix);
					SaveFilesObj.SavingCSV(Matrix); //TODO
				}
			}
		});
		mnSaveAs.add(mntmCsvFile);

		JMenuItem mntmKmlFile = new JMenuItem("KML File");
		mntmKmlFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Matrix.size() < 1) JOptionPane.showMessageDialog(null, "You have not created a database yet!");
				else{
					SaveFilesObj = new SaveFiles();
					Merge_Rows_Object.Merge(Matrix);
					SaveFilesObj.SavingKML(Matrix); //TODO
				}
			}
		});
		mnSaveAs.add(mntmKmlFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() { //Pressing Exit will exit the program
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mntmWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeObj = new Welcome();
				WelcomeObj.setVisible(true);
			}
		});
		mnHelp.add(mntmWelcome);

		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutObj = new About();
				AboutObj.setVisible(true);
			}
		});
		mnHelp.add(mntmAboutUs);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(list);

		JButton btnClearData = new JButton("Clear DB");
		btnClearData.setBounds(20, 122, 154, 42);
		btnClearData.setFont(new Font("Verdana", Font.BOLD, 17));
		btnClearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.clear();
				DBDLM.clear();
				txtNone.setText(null);
				textField.setText("0");
				JOptionPane.showMessageDialog(null, "Database deleted");
			}
		});
		frame.getContentPane().add(btnClearData);

		JButton btnStart = new JButton("Generate DB");
		btnStart.setBounds(184, 122, 226, 42);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DLM.getSize() < 1 && DBDLM.getSize() < 1) JOptionPane.showMessageDialog(null, "You have not uploaded any files!");
				else{
					WrapObj.OpenFiles(DLM);
					Matrix = WrapObj.Filters(FilterObj);

					StateObj.setState(Matrix, DLM);

					Thread State = new Thread(StateObj);
					State.start();
					textField.setText(String.valueOf(Matrix.size()));
					if(FilterObj.checkBox[0]) txtNone.setText(txtNone.getText() + "Date, ");
					if(FilterObj.checkBox[1]) txtNone.setText(txtNone.getText() + "Location, ");
					if(FilterObj.checkBox[2]) txtNone.setText(txtNone.getText() + "ID, ");
					if(!FilterObj.checkBox[0] && !FilterObj.checkBox[1] && !FilterObj.checkBox[2]) txtNone.setText("None");
					JOptionPane.showMessageDialog(null, "DATABASE Created successfully!");
				}
			}
		});
		frame.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				if(StateObj.flag){
					//NEW DLM
					DLM = StateObj.DLM;
					//CLEAR DB
					Matrix.clear();
					//GENERATE DB 
					btnStart.doClick();
					StateObj.flag = false;
				}
			}
		});

		btnStart.setFont(new Font("Verdana", Font.BOLD, 18));
		frame.getContentPane().add(btnStart);
		tglbtnNewToggleButton.setBounds(420, 17, 154, 42);



		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DLM.getSize() < 1) JOptionPane.showMessageDialog(null, "You need to creat DB before you can select filters!");
				else {
					FilterObj.setVisible(true);
				}
			}
		});
		tglbtnNewToggleButton.setFont(new Font("Verdana", Font.BOLD, 16));
		frame.getContentPane().add(tglbtnNewToggleButton);

		JToggleButton tglbtnAlgorithms = new JToggleButton("Algorithms");
		tglbtnAlgorithms.setBounds(420, 70, 154, 42);
		tglbtnAlgorithms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DLM.getSize() < 1) JOptionPane.showMessageDialog(null, "You need to creat DB before you can use algorithms!");
				else {
					AlgorithmsObj.setVisible(true);	
					AlgorithmsObj.AlgorithmsSetMatrix(Matrix);
				}
			}
		});

		tglbtnAlgorithms.setFont(new Font("Verdana", Font.BOLD, 16));
		frame.getContentPane().add(tglbtnAlgorithms);

		JLabel lblRecords = new JLabel("Records Counts:   ");
		lblRecords.setBackground(UIManager.getColor("Button.light"));
		lblRecords.setBounds(10, 175, 129, 18);
		frame.getContentPane().add(lblRecords);

		JLabel lblFilter = new JLabel("Selected filter:");
		lblFilter.setBackground(UIManager.getColor("Button.light"));
		lblFilter.setBounds(194, 175, 108, 18);
		frame.getContentPane().add(lblFilter);

		textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBackground(UIManager.getColor("Button.light"));
		textField.setBounds(110, 175, 60, 18);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		txtNone.setText(null);
		txtNone.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNone.setColumns(10);
		txtNone.setBackground(UIManager.getColor("Button.light"));
		txtNone.setBounds(280, 175, 152, 18);
		frame.getContentPane().add(txtNone);

		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("Button.light"));
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(10, 176, 564, 14);
		frame.getContentPane().add(panel);
	}
}
