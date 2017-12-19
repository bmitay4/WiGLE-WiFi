package Extends_2_B;

import java.util.ArrayList;

import OtherTools.Tools;

public class Extends2_Main_B {

	public static void main(String[] args) {

		String userLocation = "C:/Users/איתי בן משה/git/ArielOOP/Project1/Source_Files/TestForAlgoB/mergeCSV.csv";
		
		Find_User_Location_2 Go2 = new Find_User_Location_2();
		Tools Tools_Obj = new Tools();
		
		ArrayList<String> MAC = (ArrayList<String>) Tools_Obj.toRow(userLocation);
		
		Go2.Program(userLocation, MAC);
	}

}
