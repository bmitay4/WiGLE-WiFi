package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import Extends_2_A.Algorithm_A;

public class CombineAlgoA {	//Combine Algo1 in Algo2
	
	ArrayList<List<String>> FinalMatrix = new ArrayList<>();
	ArrayList<List<String>> APMatrix;
	int numOfSamples;
	
	public void AlgoACompare(ArrayList<List<String>> APMatrix, int numOfSamples){
		this.APMatrix = APMatrix;
		this.numOfSamples = numOfSamples;
		
		resetAPMatrix();
		Algorithm_A AlgoA = new Algorithm_A(APMatrix, numOfSamples);
		//Should find a way to combine AlgoA here
		System.out.println(1);

		
	}
	private void resetAPMatrix(){	//Set the samples value according to numOfSamples input
		for (int i = this.APMatrix.size() - 1; i >= this.numOfSamples; i--) {
			this.APMatrix.remove(i);
		}
	}
}
