package Extends_2;

import java.util.ArrayList;
import java.util.List;

import Row.Single_Row_After_Merge;
import WiFi.All_WiFi;

public class Look_For_MAC {

	List<String> WiFi_Row;

	All_WiFi All_WiFi_Object;
	Single_Row_After_Merge Row_After_Merge_Obj;

	public boolean isContainsMAC(ArrayList<List<String>> Matrix, String MAC){
		for (int i = 1; i < Matrix.size(); i++) {
			Row_After_Merge_Obj = new Single_Row_After_Merge(Matrix.get(i));
		
			if(Row_After_Merge_Obj.getMAC().equals(MAC)) return true;
			
			else if(Row_After_Merge_Obj.getNum_Of_WiFi_As_Integer() > 1){
				WiFi_Row = All_WiFi_Object.All_WiFi_Row(Matrix.get(i));
				if(WiFi_Row.contains(MAC)) return true;
			}
		}
		System.out.println("MAC Address not found");
		return false;
	}
}
