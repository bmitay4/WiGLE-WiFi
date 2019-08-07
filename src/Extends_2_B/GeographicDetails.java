package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.GeneralWiFi;
import WiFi.MultiWiFi;

/**
 *	This class makes the geographic details available
 */

public class GeographicDetails {
	
	private String Date;
	private String ID;
	public String Lat;
	public String Lon;
	public String Alt;
	private String numOfWiFi;

	public GeographicDetails(List<String> Row){	//Geographic Details Class
		MultiWiFi MultiObj = new MultiWiFi(Row);
		GeneralWiFi GeneralObj = new GeneralWiFi(Row);
		
		this.Date = GeneralObj.getDate();
		this.ID = GeneralObj.getID();
		this.Lat = GeneralObj.getLat();
		this.Lon = GeneralObj.getLon();
		this.Alt = GeneralObj.getAlt();
		this.numOfWiFi = MultiObj.getNumOfWiFi();
	}
	
	protected List<String> GDetailsToArray(){	//Return list of GDetalis
		
		List<String> Temp = new ArrayList<>();
		Temp.add(this.Date);
		Temp.add(this.ID);
		Temp.add(this.Lat);
		Temp.add(this.Lon);
		Temp.add(this.Alt);
		Temp.add(this.numOfWiFi);
		
		return Temp;

	}

}
