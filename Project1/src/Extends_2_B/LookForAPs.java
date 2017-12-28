package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class LookForAPs {

	private ArrayList<List<String>> completeMatrix;
	private RowToAP RowToAPObj = new RowToAP();
	PiTools PiToolsObj = new PiTools();

	public void setAPMatrix(ArrayList<List<String>> APMatrix, List<String> AP, ArrayList<List<String>> completeMatrix){ //If contain, add the row to the matrix		
		this.completeMatrix = completeMatrix;
		for (int i = 0; i < completeMatrix.size(); i++) {
			if(isContain(AP, i)){
				APMatrix.add(RowToAPObj.RowToAPrray(AP, completeMatrix.get(i)));
				PiToolsObj.sortPi2(APMatrix);
			}
		}
	}

	private boolean isContain(List<String> AP, int i){ //Checks if a row contain one of the input mac
		for (int j = 7; j < AP.size(); j = j + 4) {
			if(this.completeMatrix.get(i).contains((AP.get(j)))) 
				return true;
		}
		return false;
	}
}
