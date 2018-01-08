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
			FinalMatrix.add(CombAlgoA.TotalGDetails);
		}
		return FinalMatrix;
	}
	public List<String> byString(List<String> Row, ArrayList<List<String>> Matrix){
		APMatrix = new ArrayList<>();
		LookForObj.setAPMatrix(this.APMatrix, Row , Matrix);
		CombAlgoA.AlgoACompare(Row, this.APMatrix, 4);
		return CombAlgoA.TotalGDetails;
	}
	public List<String> byValues(ArrayList<List<String>> Matrix, String Mac1, String Mac2, String Mac3, String Sig1, String Sig2, String Sig3){
		List<String> Row = valuesToList(Mac1, Mac2, Mac3, Sig1, Sig2, Sig3);
		APMatrix = new ArrayList<>();
		LookForObj.setAPMatrix(this.APMatrix, Row , Matrix);
		CombAlgoA.AlgoACompare(Row, this.APMatrix, 4);
		return CombAlgoA.TotalGDetails;
	}
	private List<String> valuesToList(String Mac1, String Mac2, String Mac3, String Sig1, String Sig2, String Sig3){
		List<String> Temp = new ArrayList<>();
		Temp.add("Date");
		Temp.add("ID");
		Temp.add("?");
		Temp.add("?");
		Temp.add("?");
		Temp.add("numOfWiFi");
		if(Mac1 != null && Sig1 != null){
			Temp.add("SSID");
			Temp.add(Mac1);
			Temp.add("Channel");
			Temp.add(Sig1);
		}
		if(Mac2 != null && Sig2 != null){
			Temp.add("SSID");
			Temp.add(Mac2);
			Temp.add("Channel");
			Temp.add(Sig2);
		}
		if(Mac3 != null && Sig3 != null){
			Temp.add("SSID");
			Temp.add(Mac3);
			Temp.add("Channel");
			Temp.add(Sig3);
		}
		return Temp;
	}
}
