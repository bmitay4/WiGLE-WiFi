package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Find_User_Location_2 {
	
	private String userLocation;
	private ArrayList<List<String>> Matrix, AP_Matrix;
	
	private OpenFile OpenFile_Object = new OpenFile();


	public void Program(String userLocation, ArrayList<String> MAC){
		this.userLocation = userLocation;
		this.Matrix = OpenFile_Object.openFiles(userLocation);

		
	}

}
