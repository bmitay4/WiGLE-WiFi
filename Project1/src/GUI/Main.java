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
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;
	private OpenFiles OpenFilesObj;
	private About AboutObj;
	private Welcome WelcomeObj;
	private Filters FilterObj;
	private Algorithms AlgorithmsObj;
	private Wrap WrapObj;
	private SaveFiles SaveFilesObj;

	public DefaultListModel<Object> DLM;
	private JList<Object> list = new JList<>();
	private final JToggleButton tglbtnNewToggleButton = new JToggleButton("Filters");
	private ArrayList<List<String>> Matrix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		list.setBorder(BorderFactory.createTitledBorder("Files Loaded"));
		DLM = new DefaultListModel<>();
		Matrix = new ArrayList<>();
		WrapObj = new Wrap();
		FilterObj = new Filters();

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

		JMenu mnSaveAs = new JMenu("Save As");
		mnFile.add(mnSaveAs);

		JMenuItem mntmCsvFile = new JMenuItem("CSV File");
		mntmCsvFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//Saving the united CSV file
				if(Matrix.size() < 1) JOptionPane.showMessageDialog(null, "You have not selected any filters!");
				else {
					SaveFilesObj = new SaveFiles();
					SaveFilesObj.SavingCSV(Matrix); //TODO
				}
			}
		});
		mnSaveAs.add(mntmCsvFile);

		JMenuItem mntmKmlFile = new JMenuItem("KML File");
		mntmKmlFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Matrix.size() < 1) JOptionPane.showMessageDialog(null, "You have not selected any filters!");
				else{
					SaveFilesObj = new SaveFiles();
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

		list.setBounds(10, 11, 400, 100);
		frame.getContentPane().add(list);

		JButton btnClearData = new JButton("CLEAR DATA");
		btnClearData.setFont(new Font("Verdana", Font.BOLD, 17));
		btnClearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.clear();
				JOptionPane.showMessageDialog(null, "Database deleted");
			}
		});
		btnClearData.setBounds(50, 122, 154, 30);
		frame.getContentPane().add(btnClearData);

		JButton btnStart = new JButton("RUN");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DLM.getSize() < 1) JOptionPane.showMessageDialog(null, "You have not uploaded any files!");
				else{
					WrapObj.OpenFiles(DLM);
					Matrix = WrapObj.Filters(FilterObj);		
				}
			}
		});

		btnStart.setFont(new Font("Verdana", Font.BOLD, 18));
		btnStart.setBounds(214, 122, 154, 30);
		frame.getContentPane().add(btnStart);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 175, 564, 16);
		frame.getContentPane().add(toolBar);

		JLabel lblRecords = new JLabel("Records Counts: ");
		toolBar.add(lblRecords);

		JLabel lblNewLabel = new JLabel(String.valueOf(Matrix.size()));
		toolBar.add(lblNewLabel);

		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilterObj = new Filters();
				FilterObj.setVisible(true);
			}
		});
		tglbtnNewToggleButton.setFont(new Font("Verdana", Font.BOLD, 16));
		tglbtnNewToggleButton.setBounds(420, 17, 154, 30);
		frame.getContentPane().add(tglbtnNewToggleButton);

		JToggleButton tglbtnAlgorithms = new JToggleButton("Algorithms");
		tglbtnAlgorithms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlgorithmsObj = new Algorithms();
				AlgorithmsObj.setVisible(true);

			}
		});
		tglbtnAlgorithms.setFont(new Font("Verdana", Font.BOLD, 16));
		tglbtnAlgorithms.setBounds(420, 58, 154, 30);
		frame.getContentPane().add(tglbtnAlgorithms);
	}
}
