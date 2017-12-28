package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmA {

	protected List<String> TotalGDetails; 
	protected double lat, lon, alt;
	private ArrayList<List<String>> APMatrix;
	private int numOfSamples;

	public void AlgoA(List<String> AP_Row, ArrayList<List<String>> APMatrix, int numOfSamples){
		this.APMatrix = APMatrix;
		this.numOfSamples = numOfSamples;
		this.TotalGDetails = new ArrayList<>();

		resetAPMatrix();

		APSumDetalis AlgoA = new APSumDetalis(APMatrix);

		//Changing the geographic details
		removeOldGD(AP_Row);	//Remove old GD
		setNewGD(AP_Row, AlgoA);	//Set new GD
		this.TotalGDetails = AP_Row;
	}

	private void resetAPMatrix(){	//Set the samples value according to numOfSamples input
		for (int i = this.APMatrix.size() - 1; i >= this.numOfSamples; i--) {
			this.APMatrix.remove(i);
		}
	}
	private void removeOldGD(List<String> APRow){
		APRow.remove(0);	//Remove date and time
		for (int i = 0; i < 3; i++) {
			APRow.remove(1);
		}
	}
	private void setNewGD(List<String> APRow, APSumDetalis AlgoA){
		for (int i = 0; i < 3; i++) {
			APRow.add(1, String.valueOf(AlgoA.getAlt()));
			APRow.add(1, String.valueOf(AlgoA.getLon()));
			APRow.add(1, String.valueOf(AlgoA.getLat()));
		}
	}
}
