package Extends_2_B;

import java.util.List;

import WiFi.WiFi_Algorithm_Bplus;

public class Weight {

	protected double wLat;
	protected double wLon;
	protected double wAlt;
	protected double pi;

	public Weight(List<String> completeFileRow, double pi){
		WiFi_Algorithm_Bplus WiFi_Algo_Bplus = new WiFi_Algorithm_Bplus(completeFileRow);

		this.wLat = WiFi_Algo_Bplus.getLat() * pi;
		this.wLon = WiFi_Algo_Bplus.getLon() * pi;
		this.wAlt = WiFi_Algo_Bplus.getAlt() * pi;
		this.pi = pi;
	}

	@Override
	public String toString() {
		return "pi=" + pi + "]";
	}
	
}
