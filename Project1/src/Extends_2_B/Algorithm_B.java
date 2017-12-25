package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.WriteFile;

public class Algorithm_B {

	private ArrayList<List<String>> Matrix;
	private WriteFile Write_OBJ = new WriteFile();
	private Matrix_Scan ScanObj = new Matrix_Scan();

	public Algorithm_B(ArrayList<List<String>> missingFileMatrix, ArrayList<List<String>> completeFileMatrix, int numOfSamples){
		this.Matrix = ScanObj.Scan(missingFileMatrix, completeFileMatrix, numOfSamples);
		Write_OBJ.writeFiles(missingFileMatrix+" - Out", Matrix); 
	}
}
