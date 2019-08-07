package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class RowToAP {

	private GeographicDetails GDetalis;

	public List<String> RowToAPrray(List<String> AP, List<String> Row){	//Generate an array list with GDetalis and Mac's properties
		List<String> Temp = new ArrayList<>();
		GDetalis = new GeographicDetails(Row);
		Temp.addAll(GDetalis.GDetailsToArray());

		for (int i = 7; i < AP.size(); i = i + 4) {
			Temp.add(AP.get(i - 1)); //Adding the SSID 
			Temp.add(AP.get(i)); //Adding the MAC 
			Temp.add(AP.get(i + 1)); //Adding the Channel 

			if(Row.indexOf(AP.get(i)) != -1) {
				double tempSignal = Double.valueOf(Row.get(Row.indexOf(AP.get(i)) + 2));
				int intTempSignal = (int) tempSignal;
				Temp.add(String.valueOf(intTempSignal)); //If the MAC is listed, add her signal
			}
			else Temp.add("-120") ;	//Otherwise, add -120
		}
		piCalculate piObj = new piCalculate();	//Calculate and add to to the end oft he row PI value
		piObj.addPi(Temp, AP);
		return Temp;
	}
}
