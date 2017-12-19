package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_B;

/**
 *	This class determines if the returned row has 1 or more AP within
 */

public class AP_Counts {
	
	WiFi_Algorithm_B WiFi_B_Obj;
	ArrayList<String> AP_Row = new ArrayList<>();
	
	public ArrayList<String> AP(List<String> MAC){
		WiFi_B_Obj = new WiFi_Algorithm_B(MAC);
		if(WiFi_B_Obj.getNumOfWiFi() == 1) this.AP_Row = WiFi_B_Obj.WiFi_B_Row(MAC);
		else this.AP_Row = WiFi_B_Obj.WiFis_B_Row(MAC);
		return AP_Row;
	}
}
