package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class WeightTools {
	
	ArrayList<List<String>> Matrix;

	public void sortWeight(ArrayList<List<String>> APMatrix){	//Sort the matrix according to pi strength
		this.Matrix = APMatrix;
		
		for (int i = 0; i < Matrix.size(); i++) {
			int indexIweight = Matrix.get(i).size() - 1;
			double Iweight = Double.valueOf(Matrix.get(i).get(indexIweight));
			for (int j = 0; j < Matrix.size(); j++) {
				int indexJweight = Matrix.get(j).size() - 1;
				double Jweight = Double.valueOf(Matrix.get(j).get(indexJweight));
				if(Iweight > Jweight){
					switchRows(i, j);
				}
			}
		}
	}
	private void switchRows(int i, int j){	//Switch between rows
		List<String> TempI = this.Matrix.get(i);
		List<String> TempJ = this.Matrix.get(j);		
		this.Matrix.set(i, TempJ);
		this.Matrix.set(j, TempI);

	}
}
