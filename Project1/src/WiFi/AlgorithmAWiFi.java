package WiFi;

import java.util.List;

public class AlgorithmAWiFi {

	private int Signal;
	private double Lat;
	private double Lon;
	private double Alt;
	List<String> WiFi_Row;

	public AlgorithmAWiFi(List<String> WiFi_Row){
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
	public int getSignal(){
		return Integer.parseInt((this.WiFi_Row.get(6)));
	}
}
