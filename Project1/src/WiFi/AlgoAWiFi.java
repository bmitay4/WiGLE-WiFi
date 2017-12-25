package WiFi;

import java.util.List;

public class AlgoAWiFi {

	private double wLat;
	private double wLon;
	private double wAlt;
	private double WeightPi;
	private int weightIndex;
	
	public AlgoAWiFi(List<String> APRow){
		this.weightIndex = APRow.size() - 1;
		this.WeightPi = Double.valueOf(APRow.get(this.weightIndex));
		this.wLat = Double.valueOf(APRow.get(0)) * this.WeightPi;
		this.wLon = Double.valueOf(APRow.get(1)) * this.WeightPi;
		this.wAlt = Double.valueOf(APRow.get(2)) * this.WeightPi;
	}

	public double getLat() {
		return this.wLat;
	}

	public double getLon() {
		return this.wLon;
	}

	public double getAlt() {
		return this.wAlt;
	}

	public double getWeightPi() {
		return this.WeightPi;
	}
	

	
}
