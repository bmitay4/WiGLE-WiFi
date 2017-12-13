package Row;

import java.util.ArrayList;
import java.util.List;

public class Merge_Rows_Tools {
	
	Single_Row Single_Row_Object1, Single_Row_Object2;
	Sort_Rows_Tools Sort_Rows_Tools_Object;
	
	boolean isDateEqual(ArrayList<List<String>> Rows_Matrix, int i, int j){
		Single_Row_Object1 = new Single_Row(Rows_Matrix.get(i));
		Single_Row_Object2 = new Single_Row(Rows_Matrix.get(j));

		return (Single_Row_Object1.getTime().equals(Single_Row_Object2.getTime()));
	}
}
