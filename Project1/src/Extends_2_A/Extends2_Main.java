package Extends_2_A;

public class Extends2_Main {
	/**
	 * This is a main class for Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	
	public static void main(String[] args) {
		
		String userLocation = "C:/Users/USER/git/ArielOOP/Project1/Source_Files/Out/mergeCSV.csv";
		String MAC = "f8:ab:05:44:ef:d3";
		
		Find_AP_Location Go = new Find_AP_Location();
		Go.Program(userLocation, MAC);
	}
}
