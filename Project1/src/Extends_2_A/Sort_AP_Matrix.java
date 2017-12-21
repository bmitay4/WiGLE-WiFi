package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

import Row.Sort_Rows_Tools;
import WiFi.WiFi_Algorithm_A;

public class Sort_AP_Matrix {
	WiFi_Algorithm_A WiFi_Algo_A_Obj1, WiFi_Algo_A_Obj2;
	Sort_Rows_Tools Sort_Rows_Tools_Obj = new Sort_Rows_Tools();

	public void Sort_AP(ArrayList<List<String>> Matrix, int numOfSamples){
		for (int j = 0; j < Matrix.size(); j++) {
			for (int i = 0; i!=j && i < Matrix.size(); i++) {
				if(isGreaterSignal(Matrix, i, j)){
					Sort_Rows_Tools_Obj.swapRows(Matrix, i, j);
					i--;
				}
			}
		}
		bySamples(Matrix, numOfSamples);
	}
	boolean isGreaterSignal(ArrayList<List<String>> Rows_Matrix, int i, int j){
		WiFi_Algo_A_Obj1 = new WiFi_Algorithm_A(Rows_Matrix.get(i));
		WiFi_Algo_A_Obj2 = new WiFi_Algorithm_A(Rows_Matrix.get(j));
		return (WiFi_Algo_A_Obj1.getSignal() < WiFi_Algo_A_Obj2.getSignal());
	}
	private void bySamples(ArrayList<List<String>> Matrix, int numOfSamples){
		for (int i = Matrix.size() - 1; i > numOfSamples; i--) {
			Matrix.remove(i);
		}
	}
}
