package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Create_Matrix {
	
	private ArrayList<List<String>> Matrix, data_with_mac;
	private OpenFile OpenFile_Object = new OpenFile();
	Tools t=new Tools();
	
	public ArrayList<List<String>> CreateMatrix(String Location){
		this.Matrix= OpenFile_Object.openFiles(Location);
		return Matrix;
	}
	public ArrayList<List<String>> CreateMatrix(ArrayList<List<String>> Matrix, String mac1,String mac2, String mac3){
		this.data_with_mac=t.isContain(this.Matrix, mac1, mac2, mac3);
		return data_with_mac;
	}
	
}
