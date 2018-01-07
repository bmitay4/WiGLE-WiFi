package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import Extends_2_A.APSumDetalis;

public class CombineAlgoA {	//Combine Algo1 in Algo2

	List<String> TotalGDetails; 
	ArrayList<List<String>> APMatrix;
	List<String> AP_Row;

	int numOfSamples;
	double lat, lon, alt;

	public void AlgoACompare(List<String> AP_Row, ArrayList<List<String>> APMatrix, int numOfSamples){
		this.APMatrix = APMatrix;
		this.AP_Row = AP_Row;
		this.numOfSamples = numOfSamples;
		this.TotalGDetails = new ArrayList<>();

		resetAPMatrix();

		APSumDetalis AlgoA = new APSumDetalis(APMatrix);

		//Changing the geographic details
		if(AP_Row.size() == 0) setNewGD2(AlgoA);
		else{
			removeOldGD(AP_Row);	//Remove old GD
			setNewGD(AP_Row, AlgoA);	//Set new GD
		}
		
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
	private void setNewGD2(APSumDetalis AlgoA){
		this.AP_Row.add(String.valueOf(AlgoA.getAlt()));
		this.AP_Row.add(String.valueOf(AlgoA.getLat()));
		this.AP_Row.add(String.valueOf(AlgoA.getLon()));

	}
}
