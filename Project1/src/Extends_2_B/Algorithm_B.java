package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;
import File.WriteFile;

public class Algorithm_B {
	
	private ArrayList<List<String>> Matrix, Data_with_mac,Data_to_comp_table ;
//	private Data_we_need Data_we_need_row;
//	private ArrayList<Data_we_need> Data_we_need_table;
//	private ArrayList<Data_to_comp> Data_to_comp_table;
	List<String> Data_we_need;
	List<String> Data_to_comp_row;
	
	
	
	public void program(String userLocation,String userDestination, String input_mac1,String input_mac2,String input_mac3,String input_sig1,String input_sig2,String input_sig3 ){
		Data_to_comp DTC=new Data_to_comp();
//		String dest="C:/DEV";
		WriteFile WF = new WriteFile();
		Data_we_need DWN= new Data_we_need();
		Create_Matrix CM=new Create_Matrix();

		Matrix=CM.CreateMatrix(userLocation);	
		
		Data_with_mac=CM.CreateMatrix(Matrix, input_mac1, input_mac2, input_mac3);
		Data_to_comp_table = new ArrayList<>();
		
		for(int i=0; i<Data_with_mac.size();i++){

			Data_we_need=DWN.DataWeNeed(input_mac1, input_mac2, input_mac3, input_sig1, input_sig2, input_sig3, Data_with_mac.get(i));

			Data_to_comp_row=DTC.DataToComp(Data_we_need);

			Data_to_comp_table.add(Data_to_comp_row);
		}
		WF.writeFiles(userDestination+"test.csv" ,Data_to_comp_table);
			
			
		}
		
	}
	

