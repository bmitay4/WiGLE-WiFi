package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class LookForAPs {

	private String Mac;
	private ArrayList<List<String>> Matrix;
	private RowToAp RowToAPObj = new RowToAp();
	WeightTools WeightToolsObj = new WeightTools();

	public void setAPMatrix(String Mac, ArrayList<List<String>> FullMatrix, ArrayList<List<String>> APMatrix){
		this.Mac = Mac;
		this.Matrix = FullMatrix;
		for (int i = 0; i < FullMatrix.size(); i++) {
			if(isContain(i)){
				APMatrix.add(RowToAPObj.RowToAPrray(Mac, Matrix.get(i)));
				WeightToolsObj.sortWeight(APMatrix);	//Sort the matrix, by weight strength
			}
		}
	}

	private boolean isContain(int i){ //Checks if a row contain the Mac
		return this.Matrix.get(i).contains(this.Mac);
	}
}
