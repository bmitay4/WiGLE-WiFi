package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.AlgorithmAWiFi;

public class AP_Samples_Set {

	protected ArrayList<AP_Properties> APList;
	protected AP_Properties AP;
	protected AP_Sum Sum_AP_Obj;

	public AP_Samples_Set(ArrayList<List<String>> AP_Matrix){
		
		this.APList = new ArrayList<>(AP_Matrix.size());
		for (int i = 0; i < AP_Matrix.size(); i++) {
			AlgorithmAWiFi WiFi_Algo_A_Obj = new AlgorithmAWiFi(AP_Matrix.get(i));
			AP = new AP_Properties(WiFi_Algo_A_Obj);
			APList.add(AP);
		}

		Sum_AP_Obj = new AP_Sum(APList);

	}
}
