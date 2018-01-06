package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ExportKML.WriteKML;
import File.WriteFile;
import Row.Single_Row_After_Merge;

public class IDFilter {

	/**
	 * Filter By ID number
	 * @param userDestination
	 * @param Matrix
	 */
	
	String userID;
	Single_Row_After_Merge Single_Row_After_Merge_Object;
	WriteKML WriteKML_Object;
	WriteFile Write_File_Object = new WriteFile();

	public void ID(String userDestination, ArrayList<List<String>> Matrix){
		System.out.println("Type the requested phone ID");
		Scanner flag = new Scanner(System.in);
		this.userID = flag.next();
		IDfilter(Matrix, userID);
		flag.close();

		WriteKML_Object  = new WriteKML();
		Write_File_Object.writeFiles(userDestination+"IDSort.csv", Matrix);
		WriteKML_Object.exportKml(userDestination, Matrix);
	}

	public void IDfilter(ArrayList<List<String>> Matrix, String ID){
		if(!isIDExist(Matrix, ID)) System.out.println("ID not exist!");
		else{
			for (int i = 1; i < Matrix.size(); i++) {
				Single_Row_After_Merge_Object = new Single_Row_After_Merge(Matrix.get(i));
				if(!Single_Row_After_Merge_Object.getID().equals(ID)){
					Matrix.remove(i);
					i--;
				}
			}
		}
	}
	private boolean isIDExist(ArrayList<List<String>> Matrix, String ID){
		for (int i = 1; i < Matrix.size(); i++) {
			Single_Row_After_Merge_Object = new Single_Row_After_Merge(Matrix.get(i));
			if(Single_Row_After_Merge_Object.getID().equals(ID)) return true;
		}
		return false;
	}
}
