package WiFi;

import java.util.ArrayList;
import java.util.List;

public class MultiWiFi extends GeneralWiFi {

	private List<String> WiFi;
	
	public MultiWiFi(List<String> WiFi){
		super(WiFi);
		this.WiFi = WiFi;
	}
	public ArrayList<String> MultiWiFiToArray(){
		ArrayList<String> Temp = new ArrayList<>();
		GeneralWiFi GeneralObj = new GeneralWiFi(WiFi);
		Temp.addAll(GeneralObj.GeneralWiFiToArray());	//Adding the general info of the row(Date, ID, Lat..)
		Temp.add(getNumOfWiFi());	//Adding the number of WiFi value
		for (int i = 6; i < this.WiFi.size(); i = i + 4) {
			Temp.addAll(Multi(i));
		}
		return Temp;
	}
	private List<String> Multi(int i){
		List<String> Temp = new ArrayList<>();
		if(this.WiFi.get(i).equals("")) Temp.add("UnKnown");
		else Temp.add(this.WiFi.get(i));
		Temp.add(this.WiFi.get(i + 1));
		Temp.add(this.WiFi.get(i + 2));
		Temp.add(this.WiFi.get(i + 3));
		return Temp;
	}
	
	public String getSSID(int i) {
		return this.WiFi.get(i);
	}
	public String getMAC(int i) {
		return this.WiFi.get(i + 1);
	}
	public String getChannel(int i) {
		return this.WiFi.get(i + 2);
	}
	public String getSignal(int i) {
		return this.WiFi.get(i + 3);
	}
	public String getNumOfWiFi() {
		return this.WiFi.get(5);
	}

} 
