package Extends_2_A;

public class Extends2_Main_A {
	/**
	 * This is a main class for Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	
	public static void main(String[] args) {
		
		String userLocation = "C:/OOPGit/_comb_all_.csv";
		String MAC = "1c:b9:c4:15:ed:b8";
		
		Find_AP_Location Go = new Find_AP_Location();
		Go.Program(userLocation, MAC);
	}
}
