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
		for (int i = 6; i < Row.size() && !flag; i = i + 4){
			if(Mac.equals(Row.get(i + 1))){
				flag = true;
				Temp = SWiFi.byMac(i);
				weightCalculate(Temp, SWiFi.getSignal());
			}
		}
		return Temp;	
	}
	private void weightCalculate(List<String> Temp, String Signal){
		double weightDouble = 1.0/(Math.pow(Double.valueOf(Signal), 2));
		String weightString = String.valueOf(weightDouble);
		Temp.add(weightString);
		}
}
