package Extends_2_B;

public class Constants {

	private final int power = 2;
	private final int normal = 10000;
	private final double signal_diff = 0.4;
	private final int min_diff = 3;
	private final String no_signal = "-120";
	private final String no_signal_diff = "100";

	public String diff(String MacSignal, String Signal){
		if(Signal.equals(no_signal)) return no_signal_diff;
		else return String.valueOf(Math.max(Math.abs(Integer.parseInt(MacSignal) - Integer.parseInt(Signal)), min_diff));
	}

	public double weight(String MacSignal, String diff){
		int diffInt = Math.abs(Integer.parseInt(diff));
		int macInt = Math.abs(Integer.parseInt(MacSignal));

		return (normal/(Math.pow(diffInt, signal_diff)*Math.pow(macInt, power)));
	}

}
