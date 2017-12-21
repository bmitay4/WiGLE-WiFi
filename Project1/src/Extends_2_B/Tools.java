package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class Tools {
	
	public ArrayList<List<String>> isContain(ArrayList<List<String>> matrix, String mac1, String mac2, String mac3){
		ArrayList<List<String>> data_with_mac = new ArrayList<List<String>> ();
		for(int i=1; i<matrix.size(); i++){
			for(int j=7; j<(matrix.get(i).size()); j=j+4){
				String test = matrix.get(i).get(j);
				if((matrix.get(i).get(j).equals(mac1))||(matrix.get(i).get(j).equals(mac2)) || (matrix.get(i).get(j).equals(mac3))){
					data_with_mac.add(matrix.get(i));
				}
			}
		}
		return data_with_mac;
	}
}
