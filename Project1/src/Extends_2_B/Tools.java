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
	public void swap(ArrayList<List<String>> a , int ind1, int ind2){
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(a.get(ind1));
		a.remove(ind1);
		a.add(ind1,a.get(ind2));
		a.add(ind2,temp);
//		System.out.println("swap");
	}
	
	public void SortByPi(ArrayList<List<String>> table){
		for(int i=0; i<table.size(); i++){
			for(int j=0; i<table.size()-i-1; j++){
//				System.out.println(j);
				if (Double.parseDouble(table.get(j).get(18))>Double.parseDouble(table.get(j+1).get(18))) {
					swap(table,j,j+1);	
				}
			}
		}
		System.out.println("end sort");
//		return table;
	}
}
