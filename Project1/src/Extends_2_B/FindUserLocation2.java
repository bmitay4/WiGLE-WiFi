package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;

public class FindUserLocation2 {

	private ArrayList<List<String>> missingMatrix, completeMatrix, FinalMatrix;

	private OpenFile OpenFile_Obj = new OpenFile();
	private WriteFile WriteFile_Obj = new WriteFile();
	private MatrixScan ScanObj = new MatrixScan();

	public void Program(String missingFile, String completeFile, int numOfSamples){
		this.missingMatrix = OpenFile_Obj.openFiles(missingFile);	//Generates matrix of the missing file
		this.completeMatrix = OpenFile_Obj.openFiles(completeFile);	//Generates matrix of the complete file
		this.FinalMatrix = ScanObj.Scan(missingMatrix, completeMatrix, numOfSamples); //Generate the full and final matrix
		
		//Do checks
		WriteFile_Obj.writeFiles(missingFile+" - Out.csv", FinalMatrix);	//Writing the full matrix to disk

	}

}