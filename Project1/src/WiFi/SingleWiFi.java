package WiFi;

import java.util.ArrayList;
import java.util.List;

public class SingleWiFi {	//Parameters for a single AP
	
	protected String SSID;
	protected String MAC;
	protected String Channel;
	protected String Signal;
	List<String> WiFi;
	
	public SingleWiFi(List<String> WiFi){
		this.WiFi = WiFi;
		this.SSID = getSSID();
		this.MAC = getMAC();
		this.Channel = getChannel();
		this.Signal = getSignal();
	}
	public List<String> WiFiToArray(){
		List<String> Temp = new ArrayList<>();
		GeneralWiFi GeneralObj = new GeneralWiFi(WiFi);
		Temp.addAll(GeneralObj.GeneralWiFiToArray());	//Adding the general info of the row(Date, ID, Lat..)
		Temp.add(getSSID());
		Temp.add(getMAC());
		Temp.add(getChannel());
		Temp.add(getSignal());

		return Temp;
	}
	public List<String> byMac(int i){
		List<String> Temp = new ArrayList<>();
		GeneralWiFi GeneralObj = new GeneralWiFi(WiFi);
		Temp.addAll(GeneralObj.GeneralWiFiToArray());	//Adding the general info of the row(Date, ID, Lat..)
		if(this.WiFi.get(i).equals("")) Temp.add("UnKnown");
		else Temp.add(this.WiFi.get(i));
		Temp.add(this.WiFi.get(i + 1));
		Temp.add(this.WiFi.get(i + 2));
		Temp.add(this.WiFi.get(i + 3));
		return Temp;
	}
	public String getSSID() {
		return this.WiFi.get(6);
	}
	public String getMAC() {
		return this.WiFi.get(7);
	}
	public String getChannel() {
		return this.WiFi.get(8);
	}
	public String getSignal() {
		return this.WiFi.get(9);
	}
	

}
