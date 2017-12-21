package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_A;

public class AP_Set {

	protected ArrayList<AP_Properties> AP_Array = new ArrayList<>();
	protected AP_Properties AP;
	protected Sum_AP Sum_AP_Obj;

	public AP_Set(ArrayList<List<String>> AP_Matrix){
		
		WiFi_Algorithm_A WiFi_Algo_A_Obj;
		
		for (int i = 0; i < AP_Matrix.size(); i++) {
			 WiFi_Algo_A_Obj = new WiFi_Algorithm_A(AP_Matrix.get(i));
			 AP = new AP_Properties(WiFi_Algo_A_Obj);
			 AP_Array.add(AP);
		}
		
		Sum_AP_Obj = new Sum_AP(AP_Array);

	}
}
