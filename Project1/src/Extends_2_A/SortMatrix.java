package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.AlgorithmAWiFi;

public class SortMatrix {

	private int numOfSamples;
	private ArrayList<List<String>> Matrix;
	private AlgorithmAWiFi AWiFiObj1, AWiFiObj2;

	public void Sort(ArrayList<List<String>> Matrix, int numOfSamples){	//Sort Matrix by Signal
		this.Matrix = Matrix;
		this.numOfSamples = numOfSamples;

		for (int j = 0; j < Matrix.size() - 1; j++) {
			if(isGreaterSignal(j, j + 1)){
				switchRows(j, j + 1);
				j--;
			}
		}
		resetAPMatrix();
	}

	private void switchRows(int i, int j){	//Switch between rows
		List<String> TempI = this.Matrix.get(i);
		List<String> TempJ = this.Matrix.get(j);

		this.Matrix.remove(i);
		this.Matrix.add(i, TempJ);

		this.Matrix.remove(j);
		this.Matrix.add(j, TempI);
	}
	private boolean isGreaterSignal(int i, int j){	//Return true if I signal is stronger than J signal
		AWiFiObj1 = new AlgorithmAWiFi(this.Matrix.get(i));
		AWiFiObj2 = new AlgorithmAWiFi(this.Matrix.get(j));

		int iSignal = AWiFiObj1.getSignal();
		int jSignal = AWiFiObj2.getSignal();
		return (iSignal < jSignal);
	}
	private void resetAPMatrix(){	//Set the samples value according to numOfSamples input
		for (int i = Matrix.size() - 1; i > numOfSamples; i--) {
			Matrix.remove(i);
		}
	}
}
