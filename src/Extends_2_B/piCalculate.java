package Extends_2_B;

import java.util.List;

public class piCalculate {

	double pi;
	double weight = 1;
	Constants Const = new Constants();

	public void addPi(List<String> MatrixRow, List<String> AP){	//Adding PI to the end of each row
		MatrixRow.add(String.valueOf(weightCalculate(MatrixRow, AP)));	
	}

	private double weightCalculate(List<String> MatrixRow, List<String> AP){	//Weight calculate
		for (int j = 7; j < AP.size(); j = j + 4) {
				String APSignal = AP.get(j + 2);
				String currentSignal = MatrixRow.get(j + 2);

				String diff = Const.diff(APSignal, currentSignal);
				double weight = Const.weight(APSignal, diff);
				this.weight = this.weight * weight;		//Calculate the PI of each row
		}
		return this.weight;
	}

}
