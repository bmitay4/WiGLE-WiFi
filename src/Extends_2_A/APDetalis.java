package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.GDetailsWiFi;

public class APDetalis {

	private double Lat = 0;
	private double Lon = 0;
	private double Alt = 0;
	private double WeightPi = 0;

	public APDetalis(ArrayList<List<String>> APMatrix){
		for (int i = 0; i < APMatrix.size(); i++) {
			GDetailsWiFi AWiFi = new GDetailsWiFi(APMatrix.get(i));
			this.Lat = this.Lat + AWiFi.getwLat();
			this.Lon = this.Lon + AWiFi.getwLon();
			this.Alt = this.Alt + AWiFi.getwAlt();
			this.WeightPi = this.WeightPi + AWiFi.getWeightPi();
		}
	}

	public double getLat() {
		return this.Lat;
	}

	public double getLon() {
		return this.Lon;
	}

	public double getAlt() {
		return this.Alt;
	}
	public double getWeightPi() {
		return this.WeightPi;
	}
}
