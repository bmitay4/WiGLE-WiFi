package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import WiFi.WiFi_After_Merge;

public class Find_User_Location_2 {
	
	String userLocation;
	String MAC1, MAC2, MAC3;
	
	private ArrayList<List<String>> Matrix, AP_Matrix;
	private OpenFile OpenFile_Object = new OpenFile();
	private MAC_Matrix_B MAC_Matrix_Obj = new MAC_Matrix_B();
	private WiFi_After_Merge WiFi_After_Merge_Obj = new WiFi_After_Merge();


	public void Program(String userLocation, ArrayList<String> MAC1, ArrayList<String> MAC2, ArrayList<String> MAC3){
		this.userLocation = userLocation;
		this.MAC1 = ALtoString(MAC1);
		this.MAC2 = ALtoString(MAC2);
		this.MAC3 = ALtoString(MAC3);

		System.out.println(this.MAC1 +", " +this.MAC2+", " + this.MAC3);
		this.Matrix = OpenFile_Object.openFiles(userLocation);
		this.AP_Matrix = MAC_Matrix_Obj.setMatrix(this.Matrix, this.MAC1, this.MAC2, this.MAC3);

		
	}
	private String ALtoString(ArrayList<String> MAC){
		WiFi_After_Merge_Obj.WiFi_Row(MAC);
		return WiFi_After_Merge_Obj.getMAC();
	}
}
