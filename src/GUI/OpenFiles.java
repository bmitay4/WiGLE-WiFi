package GUI;

import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class OpenFiles {

	final JFileChooser fc = new JFileChooser();
	FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
	StringBuilder sb = new StringBuilder();
	public String filename;

	java.io.File file;

	//Open a single file
	public void openFile() throws Exception {
		fc.setFileFilter(filter);
		if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){

			//get the file
			this.file = fc.getSelectedFile();
			
			//get the path
			filename = file.getAbsolutePath();

			//create a scanner for the file
			Scanner input = new Scanner(file);

			//read text from file
			while(input.hasNext()){
				sb.append(input.nextLine());
				sb.append("\n");
			}

			input.close();
		}
		else{
			sb.append("No file was selected");
		}	
	}
	//Open a folder
	public void openFolder() throws Exception{
		fc.setFileFilter(filter);
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			
			//get the folder
			this.file = fc.getSelectedFile();
			
			//get the path
			filename = file.getAbsolutePath();
		}
		else{
			sb.append("No file was selected");
		}
	}

}
