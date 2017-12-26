package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class PiTools {

	ArrayList<List<String>> Matrix;
	
	public void sortPi(ArrayList<List<String>> APMatrix){	//Not in use
		this.Matrix = APMatrix;
		for (int i = 0; i < APMatrix.size() - 1; i++) {
			int indexPi = APMatrix.get(i).size() - 1;

			double Ipi = Double.valueOf(APMatrix.get(i).get(indexPi));
			double Jpi = Double.valueOf(APMatrix.get(i + 1).get(indexPi));
			
			if(Ipi < Jpi){
				switchRows(i, i + 1);
				i--;
			}
		}
	}
	public void sortPi2(ArrayList<List<String>> APMatrix){	//Sort the matrix according to pi strength
		this.Matrix = APMatrix;
		
		for (int i = 0; i < Matrix.size(); i++) {
			int indexPiI = Matrix.get(i).size() - 1;
			double Ipi = Double.valueOf(Matrix.get(i).get(indexPiI));
			for (int j = 0; j < Matrix.size(); j++) {
				int indexPiJ = Matrix.get(j).size() - 1;
				double Jpi = Double.valueOf(Matrix.get(j).get(indexPiJ));
				if(Ipi > Jpi){
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
