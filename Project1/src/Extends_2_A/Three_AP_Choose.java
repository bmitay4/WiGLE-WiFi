package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_A;

public class Three_AP_Choose {

	WiFi_Algorithm_A WiFi_Algo_A_Obj1, WiFi_Algo_A_Obj2, WiFi_Algo_A_Obj3;
	AP_Properties AP1, AP2, AP3;
	Sum_AP Sum_AP_Obj;

	public Three_AP_Choose(ArrayList<List<String>> AP_Matrix){
		
		this.WiFi_Algo_A_Obj1 = new WiFi_Algorithm_A(AP_Matrix.get(0));
		this.WiFi_Algo_A_Obj2 = new WiFi_Algorithm_A(AP_Matrix.get(1));
		this.WiFi_Algo_A_Obj3 = new WiFi_Algorithm_A(AP_Matrix.get(2));
		
		AP1 = new AP_Properties(WiFi_Algo_A_Obj1);
		AP2 = new AP_Properties(WiFi_Algo_A_Obj2);
		AP3 = new AP_Properties(WiFi_Algo_A_Obj3);

		Sum_AP_Obj = new Sum_AP(AP1, AP2, AP3);

	}
}
