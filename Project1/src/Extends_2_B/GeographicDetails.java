package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_Bplus;

/**
 *	This class makes the geographic details available
 */

public class GeographicDetails {
	
	public String lat, lon, alt;
	
	public GeographicDetails(List<String> Row){
		WiFi_Algorithm_Bplus WiFiB = new WiFi_Algorithm_Bplus(Row);
		this.lat = String.valueOf((WiFiB.getLat()));
		this.lon = String.valueOf(WiFiB.getLon());
		this.alt = String.valueOf(WiFiB.getAlt());
	}
	
	protected List<String> GDetailsToArray(){
		List<String> Temp = new ArrayList<>();
		Temp.add(this.lat);
		Temp.add(this.lon);
		Temp.add(this.alt);
		
		return Temp;

	}

}
