package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.All_WiFi;
import WiFi.WiFi_Algorithm_B;

public class Algo_B_Tools {
	
	All_WiFi All_WiFi_Obj = new All_WiFi();
	WiFi_Algorithm_B WiFi_Algorithm_B_Obj;
	
	boolean isContainMACs(List<String> AP_Row, String MAC1, String MAC2, String MAC3){ //If one of the MAC is listed
		All_WiFi_Obj.All_WiFi_Row(AP_Row);
		return (AP_Row.contains(MAC1) || AP_Row.contains(MAC2) || AP_Row.contains(MAC3));
	}
	
	boolean isContainMAC(List<String> AP_Row, String MAC){ //If a specific MAC is listed
		All_WiFi_Obj.All_WiFi_Row(AP_Row);
		return (AP_Row.contains(MAC));
	}
	
	public ArrayList<String> LLA_Row(List<String> AP_Row){ //Row with Lat Lon and Alt
		ArrayList<String> ans = new ArrayList<>();
		WiFi_Algorithm_B_Obj = new WiFi_Algorithm_B(AP_Row);
		ans.add(WiFi_Algorithm_B_Obj.getLat());
		ans.add(WiFi_Algorithm_B_Obj.getLon());
		ans.add(WiFi_Algorithm_B_Obj.getAlt());
		return ans;
	}
}
