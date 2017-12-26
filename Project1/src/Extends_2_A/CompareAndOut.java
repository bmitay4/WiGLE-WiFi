package Extends_2_A;

import java.util.ArrayList;
import java.util.List;

public class CompareAndOut {

	String MAC;
	String Signal;
	String Channel;
	private ArrayList<List<String>>Matrix, AP_Matrix;
	private MAC_Matrix_A MAC_Matrix_Obj = new MAC_Matrix_A();
	private SortMatrix Sort_AP_Matrix_Obj = new SortMatrix();
	private Algorithm_A Algo_Obj;
	SetListToFinal setList = new SetListToFinal();

	public List<String> GenerateMatrix(ArrayList<List<String>> Matrix, String Mac, int numOfSamples, List<String> Row){
		this.Matrix = Matrix;
		this.MAC = Mac;
		this.AP_Matrix = MAC_Matrix_Obj.isContainsMAC(this.Matrix, MAC);
		Sort_AP_Matrix_Obj.Sort(AP_Matrix, numOfSamples);				
		int SignalIndex = AP_Matrix.get(0).size();
		this.Signal = AP_Matrix.get(0).get(SignalIndex-2);
		this.Channel = AP_Matrix.get(0).get(SignalIndex-3);
		Algo_Obj = new Algorithm_A(AP_Matrix, numOfSamples);
		ArrayList<String> Temp = setList.Set(Algo_Obj, AP_Matrix, Signal, Channel);

		return Temp;
	}
}
