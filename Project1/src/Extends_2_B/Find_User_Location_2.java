package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Find_User_Location_2 {

	private ArrayList<List<String>> missingFileMatrix, completeFileMatrix;

	private OpenFile OpenFile_Obj1 = new OpenFile();
	private OpenFile OpenFile_Obj2 = new OpenFile();

	public void Program(String missingFile, String completeFile){

		missingFileMatrix = OpenFile_Obj1.openFiles(missingFile);
		completeFileMatrix = OpenFile_Obj2.openFiles(completeFile);

		Algorithm_B AlgoB = new Algorithm_B(missingFileMatrix, completeFileMatrix);

	}

}
