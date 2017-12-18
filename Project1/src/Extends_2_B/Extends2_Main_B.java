package Extends_2_B;

import java.util.ArrayList;

public class Extends2_Main_B {

	public static void main(String[] args) {

		String userLocation = "Test";
		
		Find_User_Location_2 Go2 = new Find_User_Location_2();
		
		ArrayList<String> MAC1 = new ArrayList<>();
		ArrayList<String> MAC2 = new ArrayList<>();
		ArrayList<String> MAC3 = new ArrayList<>();
		
		Go2.Program(userLocation, MAC1, MAC2, MAC3);
	}

}
