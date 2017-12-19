package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;
import WiFi.WiFi_Algorithm_B;

public class Find_User_Location_2 {

	ArrayList<List<String>> Matrix, AP_Matrix;
	ArrayList<String> AP_Row = new ArrayList<>();

	private OpenFile OpenFile_Obj = new OpenFile();
	private MAC_Matrix_B MAC_Matrix_B_Obj = new MAC_Matrix_B();
	private WiFi_Algorithm_B WiFi_Algorithm_B_Obj = new WiFi_Algorithm_B();
	WriteFile Write_File_Object = new WriteFile();

	
	public void Program(String userLocation, ArrayList<String> MAC){
		
		this.Matrix = OpenFile_Obj.openFiles(userLocation);
		this.AP_Row = WiFi_Algorithm_B_Obj.WiFis_B_Row(MAC);
		this.AP_Matrix = MAC_Matrix_B_Obj.setMacMatrix(Matrix, AP_Row);
		Write_File_Object.writeFiles(userLocation+"NOOB.csv", AP_Matrix);

		
	}

}
