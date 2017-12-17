package Extends_2;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import Row.Single_Row_After_Merge;
import WiFi.All_WiFi;

public class Look_For_MAC {

	List<String> WiFi_Row;

	All_WiFi All_WiFi_Object;
	Single_Row_After_Merge Single_Row_After_Merge_Object;
	OpenFile OpenFile_Object;

	public boolean isContainsMAC(ArrayList<List<String>> Matrix, String MAC){
		for (int i = 0; i < Matrix.size(); i++) {
			Single_Row_After_Merge_Object = new Single_Row_After_Merge(Matrix.get(i));
		
			if(Single_Row_After_Merge_Object.getSSID().equals(MAC)) return true;
			
			else if(Single_Row_After_Merge_Object.getNum_Of_WiFi_As_Integer() > 1){
				WiFi_Row = All_WiFi_Object.All_WiFi_Row(Matrix.get(i));
				if(WiFi_Row.contains(MAC)) return true;
			}
		}
		return false;
	}
}
