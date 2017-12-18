package Extends_2_A;

import WiFi.WiFi_Algorithm_A;

public class AP_Properties {

	double wLat;
	double wLon;
	double wAlt;
	double weight;

	public AP_Properties(WiFi_Algorithm_A WiFi_Algo_A_Obj){
		try {
			this.weight = 1.0/(Math.pow(WiFi_Algo_A_Obj.getSignal(), 2));
			this.wLat = WiFi_Algo_A_Obj.getLat()*this.weight;
			this.wLon = WiFi_Algo_A_Obj.getLon()*this.weight;
			this.wAlt = WiFi_Algo_A_Obj.getAlt()*this.weight;
		} 
		catch (Exception e) {
			System.out.println("Not enough AP points (less than 3)");
		}

	}


}
