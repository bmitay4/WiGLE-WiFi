package Extends_2_A;

public class Sum_AP {

	double Lat, tempLat;
	double Lon, tempLon;
	double Alt, tempAlt;
	double weight;
	
	public Sum_AP(AP_Properties AP1, AP_Properties AP2, AP_Properties AP3){
		tempLat = AP1.wLat + AP2.wLat + AP3.wLat;
		tempLon = AP1.wLon + AP2.wLon + AP3.wLon;
		tempAlt = AP1.wAlt + AP2.wAlt + AP3.wAlt;
		
		this.weight = AP1.weight + AP2.weight + AP3.weight;
		this.Lat = tempLat/this.weight;
		this.Lon = tempLon/this.weight;
		this.Alt = tempAlt/this.weight;

	}
}
