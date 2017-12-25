package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import Extends_2_A.AlgorithmA;

public class CombineAlgoA {	//Combine Algo1 in Algo2

	List<String> TotalGDetails; 
	ArrayList<List<String>> APMatrix;
	int numOfSamples;
	double lat, lon, alt;

	public void AlgoACompare(ArrayList<String> AP_Row, ArrayList<List<String>> APMatrix, int numOfSamples){
		this.APMatrix = APMatrix;
		this.numOfSamples = numOfSamples;
		this.TotalGDetails = new ArrayList<>();

		resetAPMatrix();
		AlgorithmA AlgoA = new AlgorithmA(APMatrix);

		//Create a list, with the total geographic details
		if(APMatrix.size() != 0){	//In case the input was'nt at matrix at all
			TotalGDetails.add(String.valueOf(AlgoA.getLat()));
			TotalGDetails.add(String.valueOf(AlgoA.getLon()));
			TotalGDetails.add(String.valueOf(AlgoA.getAlt()));

			APMatrix.get(0).remove(0);
			APMatrix.get(0).remove(0);
			APMatrix.get(0).remove(0);
			APMatrix.get(0).remove(APMatrix.get(0).size() - 1);
			APMatrix.get(0).addAll(0, TotalGDetails);
			this.TotalGDetails = APMatrix.get(0);
		}
	}
	private void resetAPMatrix(){	//Set the samples value according to numOfSamples input
		for (int i = this.APMatrix.size() - 1; i >= this.numOfSamples; i--) {
			this.APMatrix.remove(i);
		}
	}
}
