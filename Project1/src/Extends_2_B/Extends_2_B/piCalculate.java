package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class piCalculate {

	double pi;
	double weight = 1;
	Constants Const = new Constants();

	public void addPi(List<String> MatrixRow, ArrayList<String> AP){
		MatrixRow.add(String.valueOf(weightCalculate(MatrixRow, AP)));	//Adding PI to the end of each row
	}

	private double weightCalculate(List<String> MatrixRow, ArrayList<String> AP){
		for (int j = 0; j < AP.size(); j = j + 2) {
			String APSignal = AP.get(j + 1);
			String currentSignal = MatrixRow.get(j + 4);

			String diff = Const.diff(APSignal, currentSignal);
			double weight = Const.weight(APSignal, diff);
			this.weight = this.weight * weight;		//Calculate the PI of each row
		}
		return this.weight;
	}

}
