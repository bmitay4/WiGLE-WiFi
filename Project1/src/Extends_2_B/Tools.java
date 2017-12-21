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
	public ArrayList<String> hani(String input_mac1, String input_mac2, String input_mac3, String input_sig1,String input_sig2,String input_sig3, List<String> row){
		ArrayList<String> data= new ArrayList<String>();
		
		for(int i=7; i<row.size(); i=i+4){
			if (row.get(i).equals(input_mac1)){
				
				
			}
		}
		
		
		return data;
	}
}
