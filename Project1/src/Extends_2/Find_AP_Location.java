package Extends_2;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Find_AP_Location {

	String userLocation;
	ArrayList<List<String>> Matrix, AP_Matrix;
	OpenFile OpenFile_Object = new OpenFile();
	Look_For_MAC Look_For_MAC_Object = new Look_For_MAC();
	
	public Find_AP_Location(String userLocation, String MAC){
		this.Matrix = OpenFile_Object.openFiles(userLocation);
		
		if(!Look_For_MAC_Object.isContainsMAC(this.Matrix, MAC)) 
			System.out.println("MAC Address not found");
	}

}
