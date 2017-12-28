package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.SingleWiFi;

public class RowToAp {

	private SingleWiFi SWiFi;
	
	public List<String> RowToAPrray(String Mac, List<String> Row){
		
		boolean flag = false;
		SWiFi = new SingleWiFi(Row);
		List<String> Temp = new ArrayList<>();
		for (int i = 6; i < Row.size() && !flag; i = i + 4){	//Flag here for time saving, there can't be 2 same MAC at the same row
			if(Mac.equals(Row.get(i + 1))){
				flag = true;
				Temp = SWiFi.byMac(i);
				weightCalculate(Temp, SWiFi.getSignal());
			}
		}
		return Temp;	
	}
	private void weightCalculate(List<String> Temp, String Signal){	//Calculate and the weight on the row
		double weightDouble = 1.0/(Math.pow(Double.valueOf(Signal), 2));
		String weightString = String.valueOf(weightDouble);
		Temp.add(weightString);
		}
}
