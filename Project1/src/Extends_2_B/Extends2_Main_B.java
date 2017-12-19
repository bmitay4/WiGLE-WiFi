package Extends_2_B;

import java.util.ArrayList;

public class Extends2_Main_B {

	public static void main(String[] args) {

		String userLocation = "C:/Users/איתי בן משה/git/ArielOOP/Project1/Source_Files/Out/mergeCSV.csv";
		
		Find_User_Location_2 Go2 = new Find_User_Location_2();
		
		ArrayList<String> MAC = new ArrayList<>();
		
		Go2.Program(userLocation, MAC);
	}

}
