package Row;

import java.util.ArrayList;
import java.util.List;

public class Sort_Rows {

	Single_Row Single_Row_Object;
	Sort_Rows_Tools Sort_Rows_Tools_Object;

	public void sortBySignal(ArrayList<List<String>> Rows_Matrix){
		Sort_Rows_Tools_Object = new Sort_Rows_Tools();
		
		for (int i = 0; i < Rows_Matrix.size() - 1; i++) {
			if(Sort_Rows_Tools_Object.isDateEqual(Rows_Matrix, i, i+1)){
				if(Sort_Rows_Tools_Object.isGreaterSignal(Rows_Matrix, i, i + 1)){
					Sort_Rows_Tools_Object.swapRows(Rows_Matrix, i, i+1);
					i--;
				}
			}
		}
	}
}
