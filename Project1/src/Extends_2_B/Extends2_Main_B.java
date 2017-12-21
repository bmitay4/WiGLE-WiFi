package Extends_2_B;

public class Extends2_Main_B {

	public static void main(String[] args) {

		String missingFile = "C:/OOPGit/_comb_no_gps_ts1.csv";
		String completeFile = "C:/OOPGit/_comb_all_.csv";

		Find_User_Location_2 Go2 = new Find_User_Location_2();
		
		Go2.Program(missingFile, completeFile);
	}

}
