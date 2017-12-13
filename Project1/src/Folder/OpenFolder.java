package Folder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import Row.All_Rows;

public class OpenFolder {
	
	String Location;
	String Destination;
	String File_Path;
	OpenFile Open_File_Object = new OpenFile();
	All_Rows All_Rows_Object = new All_Rows();
	ArrayList<List<String>> new_Matrix, temp_Matrix;
	
	public OpenFolder(){
		
	}
	//Generate a matrix with all CSV files
	public ArrayList<List<String>> openFolder(String location, String destination) {
		this.new_Matrix = new ArrayList<>();
		this.temp_Matrix = new ArrayList<>();
		
		File folder = new File(location);
		File[] listOfFiles = folder.listFiles();
		for(int i = 0; i < listOfFiles.length; i++){
			String filename = listOfFiles[i].getName();
			if(filename.endsWith(".csv")){
				this.File_Path = location+"/"+filename;
				this.temp_Matrix = Open_File_Object.openFiles(File_Path);
			}
			updateMatrix(new_Matrix, temp_Matrix);
		}		
		All_Rows_Object.getDetails(new_Matrix);
		
		return new_Matrix;
	}
	
	//Update new_Matrix all time 
	public void updateMatrix(ArrayList<List<String>> new_Matrix, ArrayList<List<String>> temp_Matrix){
		for (int i = 0; i < temp_Matrix.size(); i++) {
			new_Matrix.add(temp_Matrix.get(i));
		}
	}
}
