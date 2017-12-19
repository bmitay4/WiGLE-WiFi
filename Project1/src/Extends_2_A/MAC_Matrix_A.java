package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import Row.Single_Row_After_Merge;
import WiFi.All_WiFi;
import WiFi.WiFi_After_Merge;
import WiFi.WiFi_Algorithm_A;

public class MAC_Matrix_A {

	List<String> WiFi_Row, temp_Row;
	All_WiFi All_WiFi_Object;
	Single_Row_After_Merge Row_After_Merge_Obj;
	ArrayList<List<String>> AP_Matrix;
	WiFi_After_Merge WiFi_Obj = new WiFi_After_Merge();
	WiFi_Algorithm_A WiFi_Algo_A_Obj;

	public ArrayList<List<String>> isContainsMAC(ArrayList<List<String>> Matrix, String MAC){
		AP_Matrix = new ArrayList<>();
		temp_Row = new ArrayList<>();

		for (int i = 1; i < Matrix.size(); i++) {
			All_WiFi_Object = new All_WiFi();
			WiFi_Row = All_WiFi_Object.All_WiFi_Row(Matrix.get(i));
			if(WiFi_Row.contains(MAC)){
				temp_Row = All_WiFi_Object.WiFi_Row_By_MAC(MAC);
				AP_Matrix.add(temp_Row);
			}
		}
		return AP_Matrix;
	}
}
