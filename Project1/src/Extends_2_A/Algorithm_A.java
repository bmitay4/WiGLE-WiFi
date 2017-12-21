package Extends_2_A;

import java.util.ArrayList;
import java.util.List;


public class Algorithm_A {
	double Lat, Lon, Alt;

	Samples_AP_Choose AP_Choose; 

	public Algorithm_A(ArrayList<List<String>> AP_Matrix, int numOfSamples){
		this.AP_Choose = new Samples_AP_Choose(AP_Matrix);

		this.Lat = AP_Choose.Sum_AP_Obj.Lat;
		this.Lon = AP_Choose.Sum_AP_Obj.Lon;
		this.Alt = AP_Choose.Sum_AP_Obj.Alt;
	}




}
