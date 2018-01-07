package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmA {

	protected List<String> TotalGDetails; 
	protected double lat, lon, alt;
	private ArrayList<List<String>> APMatrix;
	private int numOfSamples;
	List<String> AP_Row;

	public void AlgoA(List<String> AP_Row, ArrayList<List<String>> APMatrix, int numOfSamples){
		this.APMatrix = APMatrix;
		this.numOfSamples = numOfSamples;
		this.TotalGDetails = new ArrayList<>();
		this.AP_Row = AP_Row;

		resetAPMatrix();

		APSumDetalis AlgoA = new APSumDetalis(APMatrix);

		//Changing the geographic details
		if(AP_Row.size() == 0) setNewGD2(AlgoA);
		else{
			removeOldGD();	//Remove old GD
			setNewGD(AlgoA);	//Set new GD
		}
		this.TotalGDetails = AP_Row;
	}

	private void resetAPMatrix(){	//Set the samples value according to numOfSamples input
		for (int i = this.APMatrix.size() - 1; i >= this.numOfSamples; i--) {
			this.APMatrix.remove(i);
		}
	}
	private void removeOldGD(){
		for (int i = 0; i < 3; i++) {
			this.AP_Row.remove(2);
		}
	}
	private void setNewGD (APSumDetalis AlgoA){
		this.AP_Row.add(2, String.valueOf(AlgoA.getAlt()));
		this.AP_Row.add(2, String.valueOf(AlgoA.getLon()));
		this.AP_Row.add(2, String.valueOf(AlgoA.getLat()));
	}
	private void setNewGD2(APSumDetalis AlgoA){
		this.AP_Row.add(String.valueOf(AlgoA.getAlt()));
		this.AP_Row.add(String.valueOf(AlgoA.getLat()));
		this.AP_Row.add(String.valueOf(AlgoA.getLon()));

	}
}
