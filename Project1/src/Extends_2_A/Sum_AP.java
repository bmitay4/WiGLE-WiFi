package Extends_2_A;

import java.util.ArrayList;

public class Sum_AP {

	double Lat, tempLat;
	double Lon, tempLon;
	double Alt, tempAlt;
	double weight;
	
	public Sum_AP(ArrayList<AP_Properties> APList){
		for (int i = 0; i < APList.size(); i++) {
			tempLat = tempLat + APList.get(i).wLat;
			tempLon = tempLon + APList.get(i).wLon;
			tempAlt = tempAlt + APList.get(i).wAlt;
			this.weight = this.weight + APList.get(i).weight;
		}

		this.Lat = tempLat/this.weight;
		this.Lon = tempLon/this.weight;
		this.Alt = tempAlt/this.weight;

	}
}
