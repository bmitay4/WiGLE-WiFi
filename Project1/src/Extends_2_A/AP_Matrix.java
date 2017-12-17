package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import Row.Single_Row_After_Merge;
import WiFi.All_WiFi;
import WiFi.WiFi;

public class AP_Matrix {

	ArrayList<List<String>> Matrix, AP_Matrix;
	All_WiFi All_WiFi_Object;
	Single_Row_After_Merge Row_After_Merge_Obj;
	WiFi WiFi_Obj = new WiFi();

	List<String> WiFi_Row, temp_Row;

	public ArrayList<List<String>> fillMatrix(ArrayList<List<String>> Matrix, String MAC){
		AP_Matrix = new ArrayList<>();
		temp_Row = new ArrayList<>();

		for (int i = 1; i < Matrix.size() && AP_Matrix.size() < 3; i++) {
			if(WiFi_Obj.WiFi_Row(Matrix.get(i)).equals(MAC)) 
				AP_Matrix.add(WiFi_Obj.WiFi_Row(Matrix.get(i)));
			if(Row_After_Merge_Obj.getNum_Of_WiFi_As_Integer() > 1){
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
