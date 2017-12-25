package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class RowToAP {

	private GeographicDetails GDetalis;
	
	public List<String> RowToAPrray(ArrayList<String> AP, List<String> Row){
		List<String> Temp = new ArrayList<>();
		GDetalis = new GeographicDetails(Row);
		Temp.addAll(GDetalis.GDetailsToArray());
		
		for (int i = 0; i < AP.size(); i = i + 2) {
				Temp.add(AP.get(i)); //Adding the MAC 
				if(Row.indexOf(AP.get(i)) != -1) {
					Temp.add(Row.get(Row.indexOf(AP.get(i)) + 2)); //If the MAC is listed, add her signal
				}
				else Temp.add("-120") ;	//Otherwise, add -120
		}
		piCalculate piObj = new piCalculate();
		piObj.addPi(Temp, AP);
		return Temp;
	}
}
