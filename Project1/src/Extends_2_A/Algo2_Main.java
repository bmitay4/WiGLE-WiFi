package Extends_2_A;

public class Algo2_Main {
	/**
	 * This is a main class for Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	
	public static void main(String[] args) {
		
		String userLocation = "C:/OOPGit/_comb_all_.csv";
		int numOfSamples = 3;
		
		Find_AP_Location Go = new Find_AP_Location();
		Go.Program(userLocation, numOfSamples);
	}
}
