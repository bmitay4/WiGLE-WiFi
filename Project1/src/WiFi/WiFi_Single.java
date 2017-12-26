package WiFi;

import java.util.ArrayList;
import java.util.List;

public class WiFi_Single {	//Parameters for a single AP
	
	private String SSID;
	private String MAC;
	private String Channel;
	private String Signal;
	List<String> WiFi;
	
	public WiFi_Single(List<String> WiFi){
		this.WiFi = WiFi;
	}
	public List<String> WiFiToArray(){
		List<String> Temp = new ArrayList<>();
		Temp.add(getSSID());
		Temp.add(getMAC());
		Temp.add(getChannel());
		Temp.add(getSignal());

		return Temp;
	}
	public String getSSID() {
		return this.SSID;
	}
	public String getMAC() {
		return this.MAC;
	}
	public String getChannel() {
		return this.Channel;
	}
	public String getSignal() {
		return this.Signal;
	}
	

}
