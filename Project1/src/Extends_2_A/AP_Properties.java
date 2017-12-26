package Extends_2_A;

import WiFi.AlgorithmAWiFi;

public class AP_Properties {

	double wLat;
	double wLon;
	double wAlt;
	double weight;

	public AP_Properties(AlgorithmAWiFi WiFi_Algo_A_Obj){
		
			this.weight = 1.0/(Math.pow(WiFi_Algo_A_Obj.getSignal(), 2));
			this.wLat = WiFi_Algo_A_Obj.getLat()*this.weight;
			this.wLon = WiFi_Algo_A_Obj.getLon()*this.weight;
			this.wAlt = WiFi_Algo_A_Obj.getAlt()*this.weight;
			
	}
}
