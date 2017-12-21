package Extends_2_A;

import java.util.ArrayList;

public class Sum_AP {

	double Lat, tempLat;
	double Lon, tempLon;
	double Alt, tempAlt;
	double weight;

	public Sum_AP(ArrayList<AP_Properties> AP){
		for (int i = 0; i < AP.size(); i++) {
			tempLat = tempLat + AP.get(i).wLat;
			tempLon = tempLon + AP.get(i).wLon;
			tempAlt = tempAlt + AP.get(i).wAlt;
			this.weight = this.weight + AP.get(i).weight;

		}

		this.Lat = tempLat/this.weight;
		this.Lon = tempLon/this.weight;
		this.Alt = tempAlt/this.weight;

	}
}
