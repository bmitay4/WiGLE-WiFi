package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.AlgoAWiFi;

public class AlgorithmA1 {

	private double Lat = 0;
	private double Lon = 0;
	private double Alt = 0;
	private double WeightPi = 0;

	public AlgorithmA1(ArrayList<List<String>> APMatrix){
		for (int i = 0; i < APMatrix.size(); i++) {
			AlgoAWiFi AWiFi = new AlgoAWiFi(APMatrix.get(i));
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
