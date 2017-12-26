package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_GDetails;

public class APDetalis {

	private double Lat = 0;
	private double Lon = 0;
	private double Alt = 0;
	private double WeightPi = 0;

	public APDetalis(ArrayList<List<String>> APMatrix){
		for (int i = 0; i < APMatrix.size(); i++) {
			WiFi_GDetails AWiFi = new WiFi_GDetails(APMatrix.get(i));
			this.Lat = this.Lat + AWiFi.getLat();
			this.Lon = this.Lon + AWiFi.getLon();
			this.Alt = this.Alt + AWiFi.getAlt();
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
