package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class LookForAPs {

	private RowToAP RowToAPObj = new RowToAP();
	PiTools PiToolsObj = new PiTools();

	public void setAPMatrix(ArrayList<List<String>> APMatrix, List<String> AP, ArrayList<List<String>> completeMatrix){ //If contain, add the row to the matrix		
		for (int i = 0; i < completeMatrix.size(); i++) {
			if(isContain(AP, completeMatrix.get(i))){
				APMatrix.add(RowToAPObj.RowToAPrray(AP, completeMatrix.get(i)));
				PiToolsObj.sortPi2(APMatrix);
			}
		}
	}

	private boolean isContain(List<String> AP, List<String> Row){ //Checks if a row contain one of the input mac
		for (int i = 7; i < AP.size(); i = i + 4) {
			if(Row.contains((AP.get(i)))) 
				return true;
		}
		return false;
	}
}
