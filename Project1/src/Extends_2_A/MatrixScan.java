package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.MultiWiFi;
import WiFi.SingleWiFi;

public class MatrixScan {


	private ArrayList<List<String>> FinalMatrix = new ArrayList<>();
	private MultiWiFi MultiObj;
	private LookForAPs LookForObj = new LookForAPs();
	private ArrayList<List<String>> APMatrix;
	AlgorithmA AlgoA = new AlgorithmA();
	List<String> APRow;


	public ArrayList<List<String>> Scan(ArrayList<List<String>> FullMatrix, int numOfSamples){
		for (int i = 0; i < FullMatrix.size(); i++) {
			if(FullMatrix.get(i).size() > 1){	//In case we got an empty row, do not enter it
				MultiObj = new MultiWiFi(FullMatrix.get(i));	//New MultiWiFi object
				List<String> Temp = MultiObj.MultiWiFiToArray();
				
				for (int j = 6; j < Temp.size(); j = j + 4) {
					this.APMatrix = new ArrayList<>();
					String Mac = MultiObj.getMAC(j);
					
					if(!isContains(FinalMatrix, Mac)){	//If we didn't saw that Mac before, enter the process
						LookForObj.setAPMatrix(Mac, this.APMatrix, FullMatrix);	//Generates a matrix with all the shows of the current mac
						SingleWiFi SWiFi = new SingleWiFi(Temp);	//New single WiFi object
						this.APRow = SWiFi.byMac(j);
						AlgoA.AlgoA(this.APRow, this.APMatrix, numOfSamples);	//Algo A, calculate the LLA
						FinalMatrix.add(AlgoA.TotalGDetails);	//Add the final row to the final matrix
					}
				}
			}
		}

		return FinalMatrix;
	}
	
	private boolean isContains(ArrayList<List<String>> FinalMatrix, String MAC){
		for (int i = 0; i < FinalMatrix.size() ; i++) {
			if(FinalMatrix.get(i).contains(MAC)) return true;
		}
		return false;
	}
}
