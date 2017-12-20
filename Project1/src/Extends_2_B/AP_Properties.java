package Extends_2_B;

public class AP_Properties {
	
	protected int diff;
	protected double weight;
	protected int Signal;
	protected double pi;
	
	private Final_Parameters Finals_Obj = new Final_Parameters();

	public AP_Properties(String MacSignal, String Signal){
		this.Signal = Integer.parseInt(Signal);
		this.diff = Finals_Obj.diff(MacSignal, Signal);
		this.weight = Finals_Obj.weight(MacSignal, Signal);
		this.pi = 0;
	}

	public String toString(){
		if(pi == 0) return "Signal: "+this.Signal+" Diff: "+this.diff+" weight: "+this.weight;
		return "Signal: "+this.Signal+" Diff: "+this.diff+" weight: "+this.weight+" |pi: "+this.pi;
		
	}
	
	public double getWeight(){
		return this.weight;
	}
}
