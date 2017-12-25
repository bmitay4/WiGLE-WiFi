package Extends_2_B;

public class AlgoB_Main {
	/**
	 * This is a main class for Algorithm B, Matala Part 2 
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	public static void main(String[] args) {

		String missingFile = "C:/OOPGit/testing/_comb_no_gps_ts2.csv";
		String completeFile = "C:/OOPGit/testing/_comb_all_BM3_.csv";
		int numOfSamples = 3;

		FindUserLocation2 Go2 = new FindUserLocation2();
		
		Go2.Program(missingFile, completeFile, numOfSamples);
	}

}
