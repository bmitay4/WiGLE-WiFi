package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi_Algorithm_B;

public class Matrix_Scan {

	protected ArrayList<List<String>> APMatrix = new ArrayList<>();
	protected ArrayList<List<String>> Matrix = new ArrayList<>();
	private LookForAPs LookForObj = new LookForAPs();
	CombineAlgoA AlgoA = new CombineAlgoA();

	public ArrayList<List<String>> Scan(ArrayList<List<String>> missingMatrix, ArrayList<List<String>> completeMatrix, int numOfSamples){
		for (int i = 0; i < missingMatrix.size(); i++) {
			WiFi_Algorithm_B WiFi_B_Obj = new WiFi_Algorithm_B();	//New WiFi object
			ArrayList<String> AP_Row = WiFi_B_Obj.WiFis_B_Row(missingMatrix.get(i));	//Contains all the MACs and theirs signals in a row
			LookForObj.setAPMatrix(APMatrix, AP_Row, completeMatrix);	////Generate a matrix, of all existence of MAC's input and theirs signals in a row, including GDetails and pi's
			AlgoA.findLocation(APMatrix, numOfSamples);
			System.out.println(2);
		}
		return Matrix;
	}
}
