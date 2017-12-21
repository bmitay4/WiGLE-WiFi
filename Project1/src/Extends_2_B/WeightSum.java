package Extends_2_B;

import java.util.ArrayList;

public class WeightSum {

	public WeightSum(ArrayList<Weight> Weights, Weight w){
		boolean flag = false;
		for (int i = 0; i < Weights.size() && !flag; i++) {
			if(w.pi > Weights.get(i).pi){
				flag = true;
				Weights.add(i, w);
			}
		}
		if(flag == false) Weights.add(w);
	}
}
