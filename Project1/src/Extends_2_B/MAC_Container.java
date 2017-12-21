package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class MAC_Container {
	ArrayList<Weight> Weights = new ArrayList<>();
	private AP_Properties AP_Properties_Obj;
	private ArrayList<List<AP_Properties>> MAC_B_Container = new ArrayList<>();
	
	public ArrayList<List<AP_Properties>> MAC_Con(ArrayList<List<String>> Matrix, ArrayList<String> AP_Row, ArrayList<List<String>> completeFileMatrix,ArrayList<Weight> Weights){	
		this.Weights = Weights;
		double pi = 1;
		for (int j = 1; j < Matrix.size(); j++) {
			pi = 1;
			ArrayList<AP_Properties> Temp = new ArrayList<>();
			for (int i = 1; i < AP_Row.size(); i = i + 2) {
				AP_Properties_Obj = new AP_Properties(AP_Row.get(i), Matrix.get(j).get(i));
				Temp.add(AP_Properties_Obj);
				pi = pi * AP_Properties_Obj.getWeight();
			}
			MAC_B_Container.add(Temp);
			String num = Matrix.get(j).get(Matrix.get(j).size() -1);
			int index = Integer.valueOf(num);
			List<String> Temp2 = completeFileMatrix.get(index);
			Weight w = new Weight(Temp2, pi);
			WeightSum WeightsSum = new WeightSum(this.Weights, w);
		}
		return MAC_B_Container;
	}
}
