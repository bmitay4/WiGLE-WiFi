package Extends_2_A;

public class AlgoA_Main {
	/**
	 * This is a main class for Algorithm A, Matala Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	
	public static void main(String[] args) {
		
		String userLocation = "C:/Users/איתי בן משה/git/ArielOOP/Project1/docs/Algo 1/_comb_all_BM1_.csv";
		int numOfSamples = 3;
		 
		
		Find_AP_Location Go = new Find_AP_Location();
		Go.Program(userLocation , numOfSamples);
	}
}
