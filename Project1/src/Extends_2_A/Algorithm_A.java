package Extends_2_A;

import java.util.ArrayList;
import java.util.List;


public class Algorithm_A {
	double Lat, Lon, Alt;

	Three_AP_Choose Three_AP_Choose; 

	public Algorithm_A(ArrayList<List<String>> AP_Matrix){
		this.Three_AP_Choose = new Three_AP_Choose(AP_Matrix);

		this.Lat = Three_AP_Choose.Sum_AP_Obj.Lat;
		this.Lon = Three_AP_Choose.Sum_AP_Obj.Lon;
		this.Alt = Three_AP_Choose.Sum_AP_Obj.Alt;
	}




}
