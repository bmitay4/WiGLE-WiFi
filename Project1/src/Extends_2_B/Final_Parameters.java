package Extends_2_B;

public class Final_Parameters {
	
	int power = 2;
	int normal = 10000;
	double signal_diff = 0.4;
	int min_diff = 3;
	int no_signal = -120;
	int no_signal_diff = 100;
	
	public int diff(int MacSignal, int Signal){
		int ans;
		if(Signal == no_signal) ans = no_signal_diff;
		else ans = Math.max(Math.abs(MacSignal - Signal), min_diff);
		return ans;
	}
	public double weight(int MacSignal, int diff){
		return (normal/(Math.pow(diff, signal_diff)*Math.pow(MacSignal, power)));
	}

}
