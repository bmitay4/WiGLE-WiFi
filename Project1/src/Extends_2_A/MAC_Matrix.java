package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import Row.Single_Row_After_Merge;
import WiFi.All_WiFi;
import WiFi.WiFi;

public class MAC_Matrix {

	List<String> WiFi_Row, temp_Row;
	All_WiFi All_WiFi_Object;
	Single_Row_After_Merge Row_After_Merge_Obj;
	ArrayList<List<String>> AP_Matrix;
	WiFi WiFi_Obj = new WiFi();


	public ArrayList<List<String>> isContainsMAC(ArrayList<List<String>> Matrix, String MAC){
		AP_Matrix = new ArrayList<>();
		temp_Row = new ArrayList<>();

		for (int i = 1; i < Matrix.size() && AP_Matrix.size() < 3; i++) {
			WiFi_Obj.WiFi_Row(Matrix.get(i));
			if(WiFi_Obj.getMAC().equals(MAC)){
				AP_Matrix.add(WiFi_Obj.WiFi_Row(Matrix.get(i)));
			}
			else if(Row_After_Merge_Obj.getNum_Of_WiFi_As_Integer() > 1){
				WiFi_Row = All_WiFi_Object.All_WiFi_Row(Matrix.get(i));
				if(WiFi_Row.contains(MAC)){
					temp_Row = All_WiFi_Object.WiFi_Row_By_MAC(MAC);
					AP_Matrix.add(temp_Row);
				}
			}
		}
		return AP_Matrix;
	}
}
