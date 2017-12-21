package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class SetListToFinal {

	public ArrayList<String> Set(Algorithm_A Algo_Obj, ArrayList<List<String>> AP_Matrix, String Signal, String Channel){
		ArrayList<String> Temp = new ArrayList<>();
		int index = AP_Matrix.get(0).size();
		Temp.add(AP_Matrix.get(0).get(index - 1));
		Temp.add(String.valueOf(Algo_Obj.Lat));
		Temp.add(String.valueOf(Algo_Obj.Lon));
		Temp.add(String.valueOf(Algo_Obj.Alt));
		
		Temp.add((AP_Matrix.get(0).get(0)));
		Temp.add((AP_Matrix.get(0).get(1)));

		Temp.add(Channel);
		Temp.add(Signal);

		return Temp;
	}
}
