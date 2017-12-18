package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.All_WiFi;

public class MAC_Matrix {

	ArrayList<List<String>> AP_Matrix;
	List<String> WiFi_Row, temp_Row;
	Algo_B_Tools algo_B_Tools_Obj = new Algo_B_Tools();
	All_WiFi All_WiFi_Obj = new All_WiFi();

	public ArrayList<List<String>> setMatrix(ArrayList<List<String>> Matrix, String MAC1, String MAC2, String MAC3){
		AP_Matrix = new ArrayList<>();
		
		for (int i = 1; i < Matrix.size(); i++) {
			if(algo_B_Tools_Obj.isContainMACs(Matrix.get(i), MAC1, MAC2, MAC3)){
				temp_Row = new ArrayList<>();
				temp_Row.addAll(algo_B_Tools_Obj.LLA_Row(Matrix.get(i))); //Added Lat Lon and Alt
				addDetails(Matrix.get(i), temp_Row, MAC1, MAC2, MAC3);
				AP_Matrix.add(temp_Row);
			}
		}
		return AP_Matrix;
	}
	
	private void addDetails(List<String> Row, List<String> temp_Row, String MAC1, String MAC2, String MAC3){
		String flag = "-120";
		All_WiFi_Obj.All_WiFi_Row(Row);
		if(algo_B_Tools_Obj.isContainMAC(Row, MAC1)) temp_Row.add(All_WiFi_Obj.getSignal(MAC1));
		else temp_Row.add(flag);
		if(algo_B_Tools_Obj.isContainMAC(Row, MAC2)) temp_Row.add(All_WiFi_Obj.getSignal(MAC2));
		else temp_Row.add(flag);
		if(algo_B_Tools_Obj.isContainMAC(Row, MAC3)) temp_Row.add(All_WiFi_Obj.getSignal(MAC3));
		else temp_Row.add(flag);

	}
}
