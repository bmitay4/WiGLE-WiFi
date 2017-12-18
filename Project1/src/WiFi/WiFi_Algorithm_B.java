package WiFi;

import java.util.ArrayList;
import java.util.List;

public class WiFi_Algorithm_B {
	
	String Lat;
	String Lon;
	String Alt;
	ArrayList<String> WiFi_Row_B;
	List<String> WiFi_Row;
	
	public WiFi_Algorithm_B(List<String> WiFi_Row){
		this.WiFi_Row = WiFi_Row;
		this.Lat = getLat();
		this.Lon = getLon();
		this.Alt = getAlt();
	}
	
	public String getLat(){
		return this.WiFi_Row.get(2);
	}
	public String getLon(){
		return this.WiFi_Row.get(3);
	}
	public String getAlt(){
		return this.WiFi_Row.get(4);
	}

}
