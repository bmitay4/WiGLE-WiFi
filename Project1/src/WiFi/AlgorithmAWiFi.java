package WiFi;

import java.util.List;

public class WiFi_Algorithm_A {

	double Signal;
	double Lat;
	double Lon;
	double Alt;
	List<String> WiFi_Row;

	public WiFi_Algorithm_A(List<String> WiFi_Row){
		this.WiFi_Row = WiFi_Row;
		this.Signal = getSignal();
		this.Lat = getLat();
		this.Lon = getLon();
		this.Alt = getAlt();
	}

	public double getLat(){
		return Double.parseDouble(this.WiFi_Row.get(2));
	}
	public double getLon(){
		return Double.parseDouble(this.WiFi_Row.get(3));
	}
	public double getAlt(){
		return Double.parseDouble(this.WiFi_Row.get(4));
	}
	public double getSignal(){
		return Double.parseDouble(this.WiFi_Row.get(6));
	}
}
