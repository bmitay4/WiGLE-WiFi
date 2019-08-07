package WiFi;

import java.util.List;

public class GDetailsWiFi extends GeneralWiFi{


	private double wLat;
	private double wLon;
	private double wAlt;
	private double WeightPi;
	private int weightIndex;

	public GDetailsWiFi(List<String> APRow){
		super(APRow);
		GeneralWiFi GeneralObj = new GeneralWiFi(APRow);
		
		this.weightIndex = APRow.size() - 1;
		this.WeightPi = Double.valueOf(APRow.get(this.weightIndex));
		this.wLat = Double.valueOf(GeneralObj.getLat()) * this.WeightPi;
		this.wLon = Double.valueOf(GeneralObj.getLon()) * this.WeightPi;
		this.wAlt = Double.valueOf(GeneralObj.getAlt()) * this.WeightPi;
	}
	
	public double getwLat() {
		return this.wLat;
	}

	public double getwLon() {
		return this.wLon;
	}

	public double getwAlt() {
		return this.wAlt;
	}

	public double getWeightPi() {
		return this.WeightPi;
	}
}
