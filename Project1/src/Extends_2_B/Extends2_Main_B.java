package Extends_2_B;

import Row.Single_Row_After_Merge;

public class Extends2_Main_B {

	public static void main(String[] args) {
//		Parameters para=new Parameters(2, 10000, 0.4, 3, -120, 100);
//		String[] input=new String[6];
		String userLocation = "C:/DEV/mergeCSV.csv";
		String userDestination="C:/DEV/OutIn/";
		String mac1=" b4:ee:b4:36:d2:b0", mac2="3c:1e:04:03:7f:17", mac3="98:e7:f4:c6:4b:37";
		String sig1="-50", sig2="-70", sig3="-90";
		Algorithm_B algoB=new Algorithm_B();
		algoB.program(userLocation, userDestination,mac1,mac2,mac3,sig1,sig2,sig3);
			
		

	}

}
