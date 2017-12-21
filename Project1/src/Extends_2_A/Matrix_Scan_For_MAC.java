package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.All_WiFi;
import WiFi.WiFi_Algorithm_B;

public class Matrix_Scan_For_MAC {

	String MAC;
	All_WiFi All_WiFi_Obj = new All_WiFi();
	WiFi_Algorithm_B WiFi_Algo_B;
	CompareAndOut CompareAndOut_Obj = new CompareAndOut();
	ArrayList<List<String>> FinalMatrix = new ArrayList<>();

	public ArrayList<List<String>> Matrix_Scan(ArrayList<List<String>> Matrix, int numOfSamples){
		for (int i = 0; i < Matrix.size(); i++) {
			if(Matrix.get(i).size() > 1){
				WiFi_Algo_B = new WiFi_Algorithm_B();
				ArrayList<String> Temp = WiFi_Algo_B.WiFis_B_Row(Matrix.get(i));
				for (int j = 0; j < Temp.size(); j = j + 2) {
					this.MAC = Temp.get(j);
					if(!isContains(FinalMatrix, MAC)){
						this.FinalMatrix.add(CompareAndOut_Obj.GenerateMatrix(Matrix, MAC, numOfSamples, Matrix.get(i)));
					}
				}
			}
		}
		return FinalMatrix;
	}
	private boolean isContains(ArrayList<List<String>> FinalMatrix, String MAC){
		for (int i = 0; i < FinalMatrix.size() ; i++) {
			if(FinalMatrix.get(i).contains(MAC))
				return true;
		}
		return false;
	}
}
