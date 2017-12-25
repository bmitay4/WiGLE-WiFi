package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_B;

public class MatrixScan {
	
	ArrayList<List<String>> FinalMatrix = new ArrayList<>();
	private ArrayList<List<String>> APMatrix;
	private LookForAPs LookForObj = new LookForAPs();
	private CombineAlgoA CombAlgoA = new CombineAlgoA();

	public ArrayList<List<String>> Scan(ArrayList<List<String>> missingMatrix, ArrayList<List<String>> completeMatrix, int numOfSamples){
		for (int i = 0; i < missingMatrix.size(); i++) {
			APMatrix = new ArrayList<>();
			WiFi_Algorithm_B WiFi_B_Obj = new WiFi_Algorithm_B();	//New WiFi object
			ArrayList<String> AP_Row = WiFi_B_Obj.WiFis_B_Row(missingMatrix.get(i));	//Contains all the MACs and theirs signals in a row
			LookForObj.setAPMatrix(this.APMatrix, AP_Row, completeMatrix);	//Generate a matrix, of all existence of MAC's input and theirs signals in a row, including GDetails and pi's
			CombAlgoA.AlgoACompare(AP_Row, this.APMatrix, numOfSamples);
			//Add the final row with the totalGD to the final matrix
			if(CombAlgoA.TotalGDetails.size() > 1) FinalMatrix.add(CombAlgoA.TotalGDetails);
		}
		return FinalMatrix;
	}
}
