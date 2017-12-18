package Extends_2_A;

public class Extends2_Main_A {
	/**
	 * This is a main class for Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	
	public static void main(String[] args) {
		
		String userLocation = "C:/Users/איתי בן משה/ArielGit/Project1/Source_Files/Out/mergeCSV.csv";
		String MAC = "00:0c:42:51:cf:e8";
		
		Find_AP_Location Go = new Find_AP_Location();
		Go.Program(userLocation, MAC);
	}
}
