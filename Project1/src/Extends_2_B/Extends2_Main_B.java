package Extends_2_B;

public class Extends2_Main_B {

	public static void main(String[] args) {

		String userLocation = "";
		
		Find_User_Location_1 Go1 = new Find_User_Location_1();
		Find_User_Location_2 Go2 = new Find_User_Location_2();
		
		String MAC1 = "HANI";
		String MAC2 = "iTAY";
		String MAC3 = "AVITAL";
				
		Go1.Program(userLocation, MAC1, Singal1, MAC2, Singal2, MAC3, Singal3);
		Go2.Program(userLocation, MAC1, MAC2, MAC3);
	}

}
