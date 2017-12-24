package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;

public class Find_User_Location_2 {

	private ArrayList<List<String>> missingFileMatrix, completeFileMatrix, FinalMatrix;

	private OpenFile OpenFile_Obj = new OpenFile();
	private WriteFile WriteFile_Obj = new WriteFile();
	private Algorithm_B AlgoB = new Algorithm_B();
	public void Program(String missingFile, String completeFile, int numOfSamples){

		this.missingFileMatrix = OpenFile_Obj.openFiles(missingFile);	//Generates matrix of the missing file
		this.completeFileMatrix = OpenFile_Obj.openFiles(completeFile);	//Generates matrix of the complete file
		this.FinalMatrix = AlgoB.Algorithm_B(missingFileMatrix, completeFileMatrix, numOfSamples);	//Generate the full and final matrix
		
		WriteFile_Obj.writeFiles(missingFile+" - Out.csv", FinalMatrix);	//Writing the full matrix to disk

	}

}
