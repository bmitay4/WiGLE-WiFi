package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ExportKML.WriteKML;
import Row.Single_Row;

public class IDFilter {

	String userID;
	Single_Row Single_Row_Object;
	WriteKML WriteKML_Object;
	
	public void ID(String userDestination, ArrayList<List<String>> Matrix){
		System.out.println("Type the requested phone ID");
		Scanner flag = new Scanner(System.in);
		this.userID = flag.next();
		IDfilter(Matrix, userID);
		flag.close();
		
		WriteKML_Object  = new WriteKML();
		WriteKML_Object.exportKml(userDestination, Matrix);
	}
	
	private void IDfilter(ArrayList<List<String>> Matrix, String ID){
		if(!isIDExist(Matrix, ID)) System.out.println("ID not exist!");
		else{
			for (int i = 1; i < Matrix.size(); i++) {
				Single_Row_Object = new Single_Row(Matrix.get(i));
				if(!Single_Row_Object.getID().equals(ID)){
					Matrix.remove(i);
					i--;
				}
			}
		}
	}
	private boolean isIDExist(ArrayList<List<String>> Matrix, String ID){
		for (int i = 1; i < Matrix.size(); i++) {
			Single_Row_Object = new Single_Row(Matrix.get(i));
			if(Single_Row_Object.getID().equals(ID)) return true;
		}
		return false;
	}
}
