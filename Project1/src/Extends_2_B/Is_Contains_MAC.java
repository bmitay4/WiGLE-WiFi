package Extends_2_B;

import java.util.List;

import WiFi.All_WiFi;

public class Is_Contains_MAC {
	
	private All_WiFi All_WiFi_Obj = new All_WiFi();
	
	boolean isContainMACs(List<String> AP_Row, String MAC1, String MAC2, String MAC3){ //If one of the MAC is listed
		All_WiFi_Obj.All_WiFi_Row(AP_Row);
		return (AP_Row.contains(MAC1) || AP_Row.contains(MAC2) || AP_Row.contains(MAC3));
	}
	
	boolean isContainMAC(List<String> AP_Row, String MAC){ //If a specific MAC is listed
		All_WiFi_Obj.All_WiFi_Row(AP_Row);
		return (AP_Row.contains(MAC));
	}
	
}
