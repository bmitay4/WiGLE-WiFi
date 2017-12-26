package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class MatrixScan {
	
	ArrayList<List<String>> FinalMatrix = new ArrayList<>();
	private ArrayList<List<String>> APMatrix;
	private LookForAPs LookForObj = new LookForAPs();
	private CombineAlgoA CombAlgoA = new CombineAlgoA();
	
	public ArrayList<List<String>> Scan(ArrayList<List<String>> missingMatrix, ArrayList<List<String>> completeMatrix, int numOfSamples){
		for (int i = 0; i < missingMatrix.size(); i++) {
			APMatrix = new ArrayList<>();
			List<String> APRow = missingMatrix.get(i);
			
			LookForObj.setAPMatrix(this.APMatrix, APRow , completeMatrix);	//Generate a matrix, of all existence of MAC's input and theirs signals in a row, including GDetails and pi's
			CombAlgoA.AlgoACompare(APRow, this.APMatrix, numOfSamples);
			
			//Add the final row with the totalGD to the final matrix
			if(CombAlgoA.TotalGDetails.size() > 1) FinalMatrix.add(CombAlgoA.TotalGDetails);
		}
		return FinalMatrix;
	}
}
