package Row;

import java.util.ArrayList;
import java.util.List;

import WiFi.WiFi;

public class All_Rows {

	String Time;
	String ID;
	String Lat;
	String Lon;
	String Alt;
	String WiFi_Counts;
	WiFi Single_WiFi_Object;
	Single_Row Single_Row_Object;
	First_Row First_Row_Object;
	ArrayList<List<String>> Rows_Matrix;
	List<String> Single_Row;

	
	public void getDetails(ArrayList<List<String>> Rows_Matrix) {
		for (int i = 0; i < Rows_Matrix.size(); i++) {
			if(Rows_Matrix.get(i).contains("WigleWifi-1.4")){ //If it's the first row of the file, keep the ID
				First_Row_Object = new First_Row(Rows_Matrix.get(i));
				this.ID = First_Row_Object.getID();
				Rows_Matrix.remove(i);
				i--;
			}
			else if(Rows_Matrix.get(i).contains("AuthMode")){ //If it's the second row of the file, remove it
				Rows_Matrix.remove(i);
				i--;
			}
			else if(Rows_Matrix.get(i).contains("01/01/1970  02:00:00") || Rows_Matrix.get(i).contains(null)){ //If the row contain bad and unknown details, remove it
				Rows_Matrix.remove(i);
				i--;
			}
			else{
				Single_Row_Object = new Single_Row(Rows_Matrix.get(i));
				Single_Row = Single_Row_Object.Single_Row_As_List(Rows_Matrix.get(i), ID);
				Rows_Matrix.remove(i);
				Rows_Matrix.add(i, Single_Row);
			}
		}
	}
	
}
