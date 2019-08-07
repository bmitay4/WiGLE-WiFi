package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

import ExportKML.WriteKML;
import File.WriteFile;

public class SaveFiles {

	final JFileChooser fc = new JFileChooser();
	private WriteFile WriteFileObj = new WriteFile();
	private WriteKML WriteKMLObj = new WriteKML();
	public String filename;

	public void SavingCSV(ArrayList<List<String>> Matrix){
		if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
			filename = fc.getSelectedFile().toString()+".csv";
			WriteFileObj.writeFiles(filename, Matrix);
		}
	}
	public void SavingKML(ArrayList<List<String>> Matrix){
		if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
			filename = fc.getSelectedFile().toString();
			WriteKMLObj.exportKml(filename, Matrix);
		}
	}

}
