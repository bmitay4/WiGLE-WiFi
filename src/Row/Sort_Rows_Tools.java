package Row;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides tools for sorting an array list
 */

public class Sort_Rows_Tools {
	
	ArrayList<String> tempRow;
	Single_Row Single_Row_Object1, Single_Row_Object2;

	public void swapRows(ArrayList<List<String>> Rows_Matrix, int i, int j){
		tempRow = new ArrayList<>();
		tempRow.addAll(Rows_Matrix.get(i));
		
		Rows_Matrix.remove(i);
//		Rows_Matrix.add(i, Rows_Matrix.get(j-1));
		
//		Rows_Matrix.remove(j);
		Rows_Matrix.add(j, tempRow);
	}
	boolean isGreaterSignal(ArrayList<List<String>> Rows_Matrix, int i, int j){
		Single_Row_Object1 = new Single_Row(Rows_Matrix.get(i));
		Single_Row_Object2 = new Single_Row(Rows_Matrix.get(j));

		return (Single_Row_Object1.getIntegerSignal() < Single_Row_Object2.getIntegerSignal());
	}
	boolean isDateEqual(ArrayList<List<String>> Rows_Matrix, int i, int j){
		Single_Row_Object1 = new Single_Row(Rows_Matrix.get(i));
		Single_Row_Object2 = new Single_Row(Rows_Matrix.get(j));

		return (Single_Row_Object1.getTime().equals(Single_Row_Object2.getTime()));
	}
}
