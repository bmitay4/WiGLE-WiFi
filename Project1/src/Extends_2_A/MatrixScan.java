package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import WiFi.All_WiFi;
import WiFi.WiFi_Algorithm_B;

public class MatrixScan {

	private String MAC;
	private All_WiFi All_WiFi_Obj = new All_WiFi();
	private WiFi_Algorithm_B WiFi_Algo_B;
	private CompareAndOut CompareAndOut_Obj = new CompareAndOut();
	private ArrayList<List<String>> FinalMatrix = new ArrayList<>();

	public ArrayList<List<String>> Scan(ArrayList<List<String>> Matrix, int numOfSamples){
		for (int i = 0; i < Matrix.size(); i++) {
			WiFi_Algo_B = new WiFi_Algorithm_B();
			ArrayList<String> Temp = WiFi_Algo_B.WiFis_B_Row(Matrix.get(i));
			if(!isContain(Temp, FinalMatrix)){
				this.FinalMatrix.add(CompareAndOut_Obj.GenerateMatrix(Matrix, MAC, numOfSamples, Matrix.get(i)));

			}

		}

		return Matrix;
	}
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
			if(FinalMatrix.get(i).contains(MAC)) return true;
		}
		return false;
	}
	private boolean isContain(ArrayList<String> Temp, ArrayList<List<String>> FinalMatrix){ //Checks if the matrix contain one of the input mac
		for (int i = 0; i < Temp.size(); i = i + 2) {
			for (int j = 0; j < FinalMatrix.size(); j++) {
				if(FinalMatrix.get(j).contains((Temp.get(i)))) return true;
			}
		}
		return false;
	}
}
