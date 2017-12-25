package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmA {
	
	private double Lat = 0;
	private double Lon = 0;
	private double Alt = 0;
	private double WeightPi;
	
	public AlgorithmA(ArrayList<List<String>> APMatrix){
		AlgorithmA1 Algo1 = new AlgorithmA1(APMatrix);
		this.WeightPi = Algo1.getWeightPi();
		this.Lat = Algo1.getLat() / this.WeightPi;
		this.Lon = Algo1.getLon() / this.WeightPi;
		this.Alt = Algo1.getAlt() / this.WeightPi;
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
	public double WeightPi() {
		return this.WeightPi;
	}
	
}
