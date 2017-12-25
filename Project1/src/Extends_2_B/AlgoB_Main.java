package Extends_2_B;

public class AlgoB_Main {
	/**
	 * This is a main class for Algorithm B, Matala Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	public static void main(String[] args) {

		String missingFile = "C:/OOPGit/_comb_no_gps_ts1.csv";
		String completeFile = "C:/OOPGit/_comb_all_BM2_.csv";
		int numOfSamples = 3;
 
		Find_User_Location_2 Go2 = new Find_User_Location_2();
		
		Go2.Program(missingFile, completeFile, numOfSamples);
	}

}
