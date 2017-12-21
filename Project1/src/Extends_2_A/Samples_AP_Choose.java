package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_A;

public class Samples_AP_Choose {

	ArrayList<WiFi_Algorithm_A> SamplesSize;
	ArrayList<AP_Properties> APList;
	AP_Properties AP;
	Sum_AP Sum_AP_Obj;

	public Samples_AP_Choose(ArrayList<List<String>> AP_Matrix){
		this.SamplesSize = new ArrayList<>(AP_Matrix.size());
		this.APList = new ArrayList<>(AP_Matrix.size());
		for (int i = 0; i < AP_Matrix.size(); i++) {
			WiFi_Algorithm_A WiFi_Algo_A_Obj = new WiFi_Algorithm_A(AP_Matrix.get(i));
			SamplesSize.add(WiFi_Algo_A_Obj);
		}
		for (int i = 0; i < SamplesSize.size(); i++) {
			AP = new AP_Properties(SamplesSize.get(i));
			APList.add(AP);
		}

		Sum_AP_Obj = new Sum_AP(APList);

	}
}
