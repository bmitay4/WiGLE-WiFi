package WiFi;

import java.util.ArrayList;
import java.util.List;

public class GeneralWiFi {	//Class for general AP details, no technical details include
	
	String Date;
	String ID;
	String Lat;
	String Lon;
	String Alt;
	List<String> WiFi;
	
	public GeneralWiFi(List<String> WiFi){
		this.WiFi = WiFi;
		this.Date = getDate();
		this.ID = getID();
		this.Lat = getLat();
		this.Lon = getLon();
		this.Alt = getAlt();
	}
	public List<String> GeneralWiFiToArray(){
		List<String> Temp = new ArrayList<>();
		Temp.add(getDate());
		Temp.add(getID());
		Temp.add(getLat());
		Temp.add(getLon());
		Temp.add(getAlt());
		return Temp;
	}

	public String getDate() {
		return this.WiFi.get(0);
	}

	public String getID() {
		return this.WiFi.get(1);
	}

	public String getLat() {
		return this.WiFi.get(2);
	}

	public String getLon() {
		return this.WiFi.get(3);
	}

	public String getAlt() {
		return this.WiFi.get(4);
	}
}
