package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.WriteFile;
import WiFi.WiFi_Algorithm_B;

public class Algorithm_B {
	private ArrayList<Weight> Weights;
	private ArrayList<List<AP_Properties>> MAC_Container = new ArrayList<>();
	private ArrayList<List<String>> AP_Matrix;
	private ArrayList<String> AP_Row = new ArrayList<>();
	private ArrayList<String> newDetails = new ArrayList<>();
	private ArrayList<List<String>> BIGDATA = new ArrayList<>();
	private WiFi_Algorithm_B WiFi_Algorithm_B_Obj = new WiFi_Algorithm_B();
	private MAC_Matrix_B MAC_Matrix_B_Obj = new MAC_Matrix_B();
	private MAC_Container MAC_Con_Obj = new MAC_Container();
	private CompareToA Comp_A;
	private WriteFile Write_OBJ = new WriteFile();
	
	public Algorithm_B(ArrayList<List<String>> missingFileMatrix, ArrayList<List<String>> completeFileMatrix){
		for (int i = 0; i < missingFileMatrix.size(); i++) {
			this.Weights = new ArrayList<>();
			this.AP_Row = WiFi_Algorithm_B_Obj.WiFis_B_Row(missingFileMatrix.get(i));
			this.AP_Matrix = MAC_Matrix_B_Obj.setMacMatrix(completeFileMatrix, AP_Row);
			this.MAC_Container = MAC_Con_Obj.MAC_Con(AP_Matrix, AP_Row, completeFileMatrix, this.Weights);
			CompareToA Comp_A = new CompareToA(this.Weights);
			newDetails = Comp_A.newDetails();
			BIGDATA.add(newDetails);
		}
		Write_OBJ.writeFiles("C:/OOPGit/new.csv", BIGDATA);
	}
}
