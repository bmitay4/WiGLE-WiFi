package Row;

import java.util.ArrayList;
import java.util.List;

public class Merge_Rows {

	Merge_Rows_Tools Merge_Rows_Tools_Object;
	Single_Row Single_Row_Object;
	int Num_Of_WiFi = 1;
	
	public void Merge(ArrayList<List<String>> Rows_Matrix){
		Merge_Rows_Tools_Object = new Merge_Rows_Tools();

		for (int i = 0; i < Rows_Matrix.size() - 1; i++) {
			if(Merge_Rows_Tools_Object.isDateEqual(Rows_Matrix, i, i + 1)){
				Merge_Rows_Tools_Object.uniteRows(Rows_Matrix, i, i + 1);
				i--;
			}
			else Num_Of_WiFi = 1;
		}
		Titles(Rows_Matrix);
	}
	public void Titles(ArrayList<List<String>> Rows_Matrix){
		ArrayList<String> temp = new ArrayList<>();
		temp.add("Time");
		temp.add("ID");
		temp.add("Lat");
		temp.add("Lon");
		temp.add("Alt");
		temp.add("#WiFi networks");
		for (int i = 1; i < 11; i++) {
			temp.add("SSID"+i);
			temp.add("MAC"+i);
			temp.add("Frequncy"+i);
			temp.add("Signal"+i);
		}
		Rows_Matrix.add(0, temp);
	}
}
