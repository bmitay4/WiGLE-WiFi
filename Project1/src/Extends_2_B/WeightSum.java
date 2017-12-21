package Extends_2_B;

import java.util.ArrayList;

public class WeightSum {
	ArrayList<Weight> Weights;
	public WeightSum(ArrayList<Weight> Weights, Weight w){
		this.Weights = Weights;
		boolean flag = false;
		for (int i = 0; i < Weights.size() && !flag; i++) {
			if(w.pi > Weights.get(i).pi){
				flag = true;
				Weights.add(i, w);
			}
		}
		if(flag == false) Weights.add(w);
		sort();
	}
	private void sort(){
		for (int i = 0; i < Weights.size() - 1; i++) {
			if(Weights.get(i).pi < Weights.get(i+1).pi) switchVal(i, i+1);
		}
	}
	private void switchVal(int i, int j) {
		Weight w1 = this.Weights.get(i);
		Weight w2 = this.Weights.get(j);
		this.Weights.add(i, w2);
		this.Weights.remove(j);
		this.Weights.add(i+1, w1);

		

	}
}
