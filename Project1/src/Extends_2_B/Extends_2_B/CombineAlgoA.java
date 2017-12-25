package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import Extends_2_A.Algorithm_A;

public class CombineAlgoA {
	
	ArrayList<List<String>> FinalMatrix = new ArrayList<>();
	ArrayList<List<String>> APMatrix;
	int numOfSamples;
	
	public void findLocation(ArrayList<List<String>> APMatrix, int numOfSamples){
		this.APMatrix = APMatrix;
		this.numOfSamples = numOfSamples;
		resetAPMatrix();
		Algorithm_A AlgoA = new Algorithm_A(APMatrix, numOfSamples);
		System.out.println(1);

		
	}
	private void resetAPMatrix(){
		for (int i = this.APMatrix.size() - 1; i >= this.numOfSamples; i--) {
			this.APMatrix.remove(i);
		}
	}
}
