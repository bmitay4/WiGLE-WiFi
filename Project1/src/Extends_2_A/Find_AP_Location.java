package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Find_AP_Location {

	String userLocation;
	ArrayList<List<String>> Matrix, AP_Matrix;
	OpenFile OpenFile_Object = new OpenFile();
	MAC_Matrix Look_For_MAC_Object = new MAC_Matrix();
	AP_Matrix AP_Matrix_Obj = new AP_Matrix();

	public Find_AP_Location(String userLocation, String MAC){
		this.Matrix = OpenFile_Object.openFiles(userLocation);
		AP_Matrix = Look_For_MAC_Object.isContainsMAC(this.Matrix, MAC);
		if(AP_Matrix.size() == 0) System.out.println("MAC Address not found");
	}

}
