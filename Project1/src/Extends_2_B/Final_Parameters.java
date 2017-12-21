package Extends_2_B;

public class Final_Parameters {
	
	private int power = 2;
	private int normal = 10000;
	private double signal_diff = 0.4;
	private int min_diff = 3;
	private String no_signal = "-120";
	private int no_signal_diff = 100;
	
	public int diff(String MacSignal, String Signal){
		int ans;
		if(Signal.equals(no_signal)) ans = no_signal_diff;
		else ans = Math.max(Math.abs(Integer.parseInt(MacSignal) - Integer.parseInt(Signal)), min_diff);
		return ans;
	}
	public double weight(String MacSignal, String diff){
		int diffInt = Math.abs(Integer.parseInt(diff));
		int macInt = Math.abs(Integer.parseInt(MacSignal));

		return (normal/(Math.pow(diffInt, signal_diff)*Math.pow(macInt, power)));
	}

}
