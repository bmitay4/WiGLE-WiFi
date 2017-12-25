package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;
import WiFi.WiFi_Algorithm_A;

public class Algorithm_B {
	
	private ArrayList<List<String>> Matrix, Data_with_mac,Data_to_comp_table ;

	//	private Data_we_need Data_we_need_row;
//	private ArrayList<Data_we_need> Data_we_need_table;
//	private ArrayList<Data_to_comp> Data_to_comp_table;
	List<String> Data_we_need;
	List<String> Data_to_comp_row;
	
	public void program(String userLocation,String userDestination, String input_mac1,String input_mac2,String input_mac3,String input_sig1,String input_sig2,String input_sig3 ){
		
		int NumOfRows=3; //number of rows we want to compare with
		Tools t=new Tools();
		Data_to_comp DTC=new Data_to_comp();
		WriteFile WF = new WriteFile();
//		Data_we_need DWN= new Data_we_need();
		Create_Matrix CM=new Create_Matrix();
		Data_to_comp_table = new ArrayList<List<String>>();
		Filtered_row f_row;
//		ArrayList<List<String>> f_table;
		
		Matrix=CM.CreateMatrix(userLocation);	
		Data_with_mac=CM.CreateMatrix(Matrix, input_mac1, input_mac2, input_mac3);
		
		for(int i=0; i<Data_with_mac.size();i++){
//			Data_we_need=DWN.DataWeNeed(input_mac1, input_mac2, input_mac3, input_sig1, input_sig2, input_sig3, Data_with_mac.get(i));
			
			f_row=new Filtered_row(input_mac1, input_mac2, input_mac3, input_sig1, input_sig2, input_sig3, Data_with_mac.get(i));
			Data_to_comp_row=DTC.DataToComp(f_row);
			
//   		Data_to_comp_row=DTC.DataToComp(Data_we_need);
//			Data_to_comp_row=DTC.DataToComp(Data_with_mac.get(i));
			Data_to_comp_table.add(Data_to_comp_row);
		}
		
//		WF.writeFiles(userDestination+"test.csv" ,Data_to_comp_table);
		t.SortByPi(Data_to_comp_table);	
		System.out.println("hani");

		WF.writeFiles(userDestination+"test.csv" ,Data_to_comp_table);
		ArrayList<List<String>> pl_table=new ArrayList<List<String>>();
		
		
		double sWLat=0;
		double sWLon=0;
		double sWAlt=0;
		double sPi=0;
		double final_lat;
		double final_lon;
		double final_alt;
		
		for(int i=0; i<NumOfRows; i++){
			System.out.println(i);
			Place pl = new Place(Data_to_comp_table.get(i));
			sWLat=sWLat+pl.getwLat();
			System.out.println("sLat:"+sWLat);
			sWLon=sWLon+pl.getwLon();
			System.out.println("sLon:"+sWLon);
			sWAlt=sWAlt+pl.getwAlt();
			System.out.println("sAlt:"+sWAlt);
			sPi=sPi+pl.getPi();
			System.out.println("sPi:"+sPi);
		}
		
		final_lat=sWLat/sPi;
		final_lon=sWLon/sPi;
		final_alt=sWAlt/sPi;
		System.out.println("your position is:"+ final_lat+","+final_lon+","+final_alt);
	}
		
	}
	

