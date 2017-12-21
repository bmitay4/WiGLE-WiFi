package Extends_2_B;

import Row.Single_Row_After_Merge;

public class Extends2_Main_B {

	public static void main(String[] args) {

		
		
		Parameters para=new Parameters(2, 10000, 0.4, 3, -120, 100);
//		String[] input=new String[6];
		String userLocation = "C:/DEV";
		String userDestination="C:/DEV/";
		String mac1="", mac2="", mac3="";
		String sig1="", sig2="", sig3="";
		Algorithm_B algoB=new Algorithm_B();
		algoB.program(userLocation, userDestination,mac1,mac2,mac3,sig1,sig2,sig3);
			
		

	}

}
