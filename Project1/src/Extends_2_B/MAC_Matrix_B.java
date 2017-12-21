package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import WiFi.All_WiFi;

public class MAC_Matrix_B {

	ArrayList<List<String>> AP_Matrix, Matrix = new ArrayList<>();
	ArrayList<String> AP_Row;

	All_WiFi All_WiFi_Obj = new All_WiFi();
	MAC_Array_Tools MAC_Tools_Obj = new MAC_Array_Tools();

	public ArrayList<List<String>> setMacMatrix(ArrayList<List<String>> Matrix, ArrayList<String> AP_Row){
		this.Matrix = Matrix;
		this.AP_Row = AP_Row;

		this.AP_Matrix = SetMatrix();
		addMacHead();
		return this.AP_Matrix;
	}

	private ArrayList<List<String>> SetMatrix(){
		ArrayList<List<String>> Ans_Mat = new ArrayList<>();
		for (int j = 0; j < Matrix.size(); j++) {
			boolean ans = false;
			for (int i = 0; i < AP_Row.size() && !ans; i = i + 2) {
				if(MAC_Tools_Obj.isContainMACs(Matrix.get(j), AP_Row)){
					Ans_Mat.add(setRow(Matrix.get(j), j));
					ans = true;
				}
			}
		}
		return Ans_Mat;
	}
	private ArrayList<String> setRow(List<String> Row, int j){
		ArrayList<String> Ans_Row = new ArrayList<>();
		for (int i = 0; i < AP_Row.size(); i = i + 2) {
			String Mac = AP_Row.get(i);
			All_WiFi_Obj.All_WiFi_Row(Row);
			All_WiFi_Obj.WiFi_Row_By_MAC(Mac);
			if(All_WiFi_Obj.getMAC(Mac) != null){
				Ans_Row.add(All_WiFi_Obj.getMAC(Mac));
				Ans_Row.add(All_WiFi_Obj.getSignal(Mac));
			}
			else {
				Ans_Row.add(Mac);
				Ans_Row.add(("-120"));
			}

		}
		Ans_Row.add(Integer.toString(j));
		return Ans_Row;
	}
	private void addMacHead(){
		ArrayList<String> Temp_Signal = new ArrayList<>();
		for (int i = 1; i < AP_Row.size(); i = i + 2) {
			Temp_Signal.add(AP_Row.get(i));
		}
		AP_Matrix.add(0, Temp_Signal);
	}
}
