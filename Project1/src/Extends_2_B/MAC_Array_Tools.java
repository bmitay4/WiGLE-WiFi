package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class MAC_Array_Tools {

	boolean isContainMACs(List<String> Matrix_Row, ArrayList<String> AP_Row){
		for (int i = 0; i < AP_Row.size(); i = i + 2) {
			String Mac = AP_Row.get(i);
			if(Matrix_Row.contains(Mac)) return true;
		}
		return false;
	}
}
