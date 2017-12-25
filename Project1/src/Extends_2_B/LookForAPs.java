package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class LookForAPs {

	private RowToAP RowToAPObj = new RowToAP();
	PiTools PiToolsObj = new PiTools();

	public void setAPMatrix(ArrayList<List<String>> APMatrix, ArrayList<String> AP, ArrayList<List<String>> completeMatrix){		
		for (int i = 0; i < completeMatrix.size(); i++) {
			if(isContain(AP, completeMatrix.get(i))){
				APMatrix.add(RowToAPObj.RowToAPrray(AP, completeMatrix.get(i)));
				PiToolsObj.sortPi2(APMatrix);
			}
		}
	}

	private boolean isContain(ArrayList<String> AP, List<String> Row){
		for (int i = 0; i < AP.size(); i = i + 2) {
			if(Row.contains((AP.get(i)))) return true;
		}
		return false;
	}
}
