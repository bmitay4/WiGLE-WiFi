package Extends_2_B;

import java.util.ArrayList;

public class CompareToA {
	
	double Lat = 0;
	double Lon = 0;
	double Alt = 0;
	double pi = 0;
	
	ArrayList<Weight> Weights = new ArrayList<>();

	public CompareToA(ArrayList<Weight> Weights){
		
		this.Weights = Weights;
		for (int i = 0; i < 3; i++) {
			this.pi = this.pi + Weights.get(i).pi;
			this.Lat = this.Lat + Weights.get(i).wLat;
			this.Lon = this.Lon + Weights.get(i).wLon;
			this.Alt = this.Alt + Weights.get(i).wAlt;
		}
		
		this.Alt = this.Alt/this.pi;
		this.Lon = this.Lon/this.pi;
		this.Lat = this.Lat/this.pi;
		
	}
	public ArrayList<String> newDetails(){
		ArrayList<String> ans = new ArrayList<>();
		ans.add(String.valueOf(this.Lat));
		ans.add(String.valueOf(this.Lon));
		ans.add(String.valueOf(this.Alt));
	
		return ans;
	}

}
