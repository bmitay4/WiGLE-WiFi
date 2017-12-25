package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class PiTools {

	ArrayList<List<String>> APMatrix;
	
	public void sortPi2(ArrayList<List<String>> APMatrix){	//Sort the matrix according to pi strength
		this.APMatrix = APMatrix;
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
	public void sortPi(ArrayList<List<String>> APMatrix){	//Not in use
		this.APMatrix = APMatrix;
		
		for (int i = 0; i < APMatrix.size(); i++) {
			int indexPiI = APMatrix.get(i).size() - 1;
			double Ipi = Double.valueOf(APMatrix.get(i).get(indexPiI));
			for (int j = 0; j < APMatrix.size(); j++) {
				int indexPiJ = APMatrix.get(j).size() - 1;
				double Jpi = Double.valueOf(APMatrix.get(j).get(indexPiJ));
				if(Ipi < Jpi){
					switchRows(i, j);
				}
			}
		}
	}
	private void switchRows(int i, int j){	//Switch between rows
		List<String> TempI = this.APMatrix.get(i);
		List<String> TempJ = this.APMatrix.get(j);

		this.APMatrix.remove(i);
		this.APMatrix.add(i, TempJ);
		
		this.APMatrix.remove(j);
		this.APMatrix.add(j, TempI);
	}
}
