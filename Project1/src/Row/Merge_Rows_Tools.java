package Row;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi;

public class Merge_Rows_Tools {

	ArrayList<String> Ans_Row;
	WiFi WiFi_Object;
	Single_Row Single_Row_Object1, Single_Row_Object2;
	Sort_Rows_Tools Sort_Rows_Tools_Object;

	void uniteRows(ArrayList<List<String>> Rows_Matrix, int i, int j){
		WiFi_Object = new WiFi();
		Ans_Row = WiFi_Object.WiFi_Row(Rows_Matrix.get(j));
		Single_Row_Object1 = new Single_Row(Rows_Matrix.get(i));
		if(Single_Row_Object1.getNum_Of_WiFi_As_Integer() < 10){
			int Row_Size = Rows_Matrix.get(i).size();
			Rows_Matrix.get(i).addAll(Row_Size, Ans_Row);
			
			int Num_Of_WiFi = Single_Row_Object1.getNum_Of_WiFi_As_Integer();
			Single_Row_Object1.setNum_Of_WiFi(String.valueOf(++Num_Of_WiFi));

		}
		Rows_Matrix.remove(j);
	}

	boolean isDateEqual(ArrayList<List<String>> Rows_Matrix, int i, int j){
		Single_Row_Object1 = new Single_Row(Rows_Matrix.get(i));
		Single_Row_Object2 = new Single_Row(Rows_Matrix.get(j));

		return (Single_Row_Object1.getTime().equals(Single_Row_Object2.getTime()));
	}
}
