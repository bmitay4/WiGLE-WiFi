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
		Data_we_need DWN= new Data_we_need();
		Create_Matrix CM=new Create_Matrix();
		Data_to_comp_table = new ArrayList<>();
		Filtered_row f_row;
		ArrayList<List<String>> f_table;
		Matrix=CM.CreateMatrix(userLocation);	
		Data_with_mac=CM.CreateMatrix(Matrix, input_mac1, input_mac2, input_mac3);
		
		WF.writeFiles(userDestination+"test.csv" ,Data_with_mac);//check
//		System.out.println("data with MAC size"+Data_with_mac.size());
		for(int i=0; i<Data_with_mac.size();i++){
//			System.out.println(i);
//			Data_we_need=DWN.DataWeNeed(input_mac1, input_mac2, input_mac3, input_sig1, input_sig2, input_sig3, Data_with_mac.get(i));
//			System.out.println(DWN.getSig1());
			
			f_row=new Filtered_row(input_mac1, input_mac2, input_mac3, input_sig1, input_sig2, input_sig3, Data_with_mac.get(i));
			System.out.println("hani");
			Data_to_comp_row=DTC.DataToComp(f_row);
			//Data_to_comp_row=DTC.DataToComp(Data_we_need);
//	//		Data_to_comp_row=DTC.DataToComp(Data_with_mac.get(i));
			Data_to_comp_table.add(Data_to_comp_row);
			
		}
//		WF.writeFiles(userDestination+"test.csv" ,Data_to_comp_table);
		t.SortByPi(Data_to_comp_table);	
		WF.writeFiles(userDestination+"test.csv" ,Data_to_comp_table);
		ArrayList<List<String>> pl_table=new ArrayList<List<String>>();
		double sLat=0;
		double sLon=0;
		double sAlt=0;
		double sPi=0;
		double final_lat;
		double final_lon;
		double final_alt;
		for(int i=0; i<NumOfRows; i++){
			
			Place pl = new Place(Data_to_comp_table.get(i));
			sLat=sLat+pl.getLat();
			sLon=sLon+pl.getLon();
			sAlt=sAlt+pl.getAlt();
			sPi=sPi+pl.getPi();
		}
		final_lat=sLat/sPi;
		final_lon=sLon/sPi;
		final_alt=sAlt/sPi;
		System.out.println("your position is:"+ final_lat+","+final_lon+","+final_alt);
	}
		
	}
	

