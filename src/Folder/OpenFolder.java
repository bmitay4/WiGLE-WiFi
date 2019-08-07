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
	
	/**
	 * Generate a matrix with all CSV files
	 * @param location
	 * @param destination
	 * @return
	 */
	
	public ArrayList<List<String>> openFolder(String location) {
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
	
	/**
	 * Keep the new_Matrix updated all time 
	 * @param new_Matrix
	 * @param temp_Matrix
	 */
	public void updateMatrix(ArrayList<List<String>> new_Matrix, ArrayList<List<String>> temp_Matrix){
		for (int i = 0; i < temp_Matrix.size(); i++) {
			new_Matrix.add(temp_Matrix.get(i));
		}
	}
	public void addSingleMatrix(ArrayList<List<String>> new_Matrix, String filename){
		this.File_Path = filename;
		this.temp_Matrix = Open_File_Object.openFiles(File_Path);
		All_Rows_Object.getDetails(temp_Matrix);
		updateMatrix(new_Matrix, temp_Matrix);
	}
	public void addFolderMatrix(ArrayList<List<String>> new_Matrix, String folderLocation){
		this.temp_Matrix = new ArrayList<>();
		File folder = new File(folderLocation);
		File[] listOfFiles = folder.listFiles();
		for(int i = 0; i < listOfFiles.length; i++){
			String filename = listOfFiles[i].getName();
			if(filename.endsWith(".csv")){
				this.File_Path = folderLocation+"/"+filename;
				this.temp_Matrix = Open_File_Object.openFiles(File_Path);
			}
			All_Rows_Object.getDetails(temp_Matrix);
			updateMatrix(new_Matrix, temp_Matrix);
		}		
	}
}
