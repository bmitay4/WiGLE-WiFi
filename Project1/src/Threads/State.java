package Threads;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import Folder.OpenFolder;

public class State implements Runnable{

	String name;
	public boolean flag = false;
	public DefaultListModel<Object> DLM;
	private OpenFolder OpenFolderObj = new OpenFolder();
	private ArrayList<List<String>> Matrix;
	private ArrayList<List<String>> TempMatrix = new ArrayList<>();

	public State(String name){
		this.name = name;
	}

	public void setState(ArrayList<List<String>> Matrix, DefaultListModel<Object> DLM){
		this.Matrix = Matrix;
		this.DLM = DLM;
	}

	@Override
	public void run() {
		while(true){
			flag = false;
			try {
				Thread.sleep(5000);
				this.TempMatrix.clear();
				OpenFiles(DLM);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!isChanged()){
				JOptionPane.showMessageDialog(null, "Database changed!\nSystem will re-generate DB");
				this.flag = true;
				sleep();			}
		}
	}
	private void OpenFiles(DefaultListModel<Object> DLM){
		for (int i = 0; i < DLM.size(); i++) {
			String filename = (String)DLM.get(i);
			if(filename.endsWith(".csv")) OpenFolderObj.addSingleMatrix(this.TempMatrix, filename);
			else{
				OpenFolderObj.addFolderMatrix(this.TempMatrix, filename);
			}
		}
	}
	private boolean isChanged(){
		return this.Matrix.equals(this.TempMatrix);

	}
	private void sleep(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
