package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Find_AP_Location {

	String userLocation;
	private ArrayList<List<String>> Matrix, AP_Matrix;
	private OpenFile OpenFile_Object = new OpenFile();
	private MAC_Matrix_A MAC_Matrix_Obj = new MAC_Matrix_A();
	private Algorithm_A Algo_Obj;
	private Sort_AP_Matrix Sort_AP_Matrix_Obj = new Sort_AP_Matrix();
	
	public void Program(String userLocation, String MAC){
		this.userLocation = userLocation;
		this.Matrix = OpenFile_Object.openFiles(userLocation);
		this.AP_Matrix = MAC_Matrix_Obj.isContainsMAC(this.Matrix, MAC);
		Sort_AP_Matrix_Obj.Sort_AP(AP_Matrix);
		if(AP_Matrix.size() == 0) System.out.println("MAC Address not found"); //If the MAC address ins't in the list
		else{
			Algo_Obj = new Algorithm_A(AP_Matrix);
			System.out.println("Approximate Location of MAC address " + MAC + "\nLat: "+Algo_Obj.Lat+""
					+ " ,Lon: "+Algo_Obj.Lon+" ,Alt: "+Algo_Obj.Alt);
		}
	}

}
