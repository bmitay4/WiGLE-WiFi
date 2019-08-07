package WiFi;

import java.util.ArrayList;
import java.util.List;

public class WiFi_Full {

	String Date;
	String ID;
	String Lat;
	String Lon;
	String Alt;
	List<String> WiFi;
	SingleWiFi WiFiSingle;
	public WiFi_Full(List<String> WiFi){
		this.WiFi = WiFi;
	}
	public List<String> WiFiGenerealArray(){
		List<String> Temp = new ArrayList<>();
		Temp.add(getDate());
		Temp.add(getID());
		Temp.add(getLat());
		Temp.add(getLon());
		Temp.add(getAlt());
		return Temp;
	}
	public List<String> WiFitoArray(){
		List<String> Temp = new ArrayList<>();
		WiFiSingle = new SingleWiFi(this.WiFi);
		Temp.addAll(WiFiGenerealArray());
		Temp.addAll(WiFiSingle.WiFiToArray());
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
