package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Find_User_Location_2 {

	ArrayList<List<String>> Matrix;
	ArrayList<String> AP_Row;

	private OpenFile OpenFile_Obj = new OpenFile();
	private AP_Counts AP_Counts_Obj = new AP_Counts();

	public void Program(String userLocation, ArrayList<String> MAC){
		this.AP_Row = AP_Counts_Obj.AP(MAC);
		this.Matrix = OpenFile_Obj.openFiles(userLocation);

	}

}
