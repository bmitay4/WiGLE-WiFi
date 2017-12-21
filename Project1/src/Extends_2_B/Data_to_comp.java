package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import de.micromata.opengis.kml.v_2_2_0.Data;

public class Data_to_comp {

	private List<String> Data_to_comp_row;

	public List<String> DataToComp(List<String> data_we_need){
//		String diff1="", diff2="", diff3="";
		int min_diff=3;
		int no_sig=-120;
		int diff_no_sig=100;
		double power=2;
		double norm= 1000;
		double sig_diff=0.4;
		Data_to_comp_row=new ArrayList<String>();
		Data_to_comp_row.add(0, data_we_need.get(0));
		Data_to_comp_row.add(1, data_we_need.get(1));
		Data_to_comp_row.add(2, data_we_need.get(2));
		
		Data_to_comp_row.add(3, data_we_need.get(3));//mac1
		Data_to_comp_row.add(4, data_we_need.get(4));//input sig1
		Data_to_comp_row.add(5, data_we_need.get(5));//sig1
		Data_to_comp_row.add(6,diff(min_diff, no_sig,diff_no_sig, Data_to_comp_row.get(4), Data_to_comp_row.get(5)));//diff1
		Data_to_comp_row.add(7,weight(power,norm, sig_diff,Data_to_comp_row.get(6),Data_to_comp_row.get(4))); //weight1
		
		Data_to_comp_row.add(8, data_we_need.get(6));//mac2
		Data_to_comp_row.add(9, data_we_need.get(7));//input sig2
		Data_to_comp_row.add(10, data_we_need.get(8));//sig2
		Data_to_comp_row.add(11,diff(min_diff, no_sig,diff_no_sig, Data_to_comp_row.get(9), Data_to_comp_row.get(10)));//diff2
		Data_to_comp_row.add(12,weight(power,norm, sig_diff,Data_to_comp_row.get(11),Data_to_comp_row.get(9)) ); //weight2
		
		Data_to_comp_row.add(13, data_we_need.get(9));//mac3
		Data_to_comp_row.add(14, data_we_need.get(10));//input sig3
		Data_to_comp_row.add(15, data_we_need.get(11));//sig3
		Data_to_comp_row.add(16,diff(min_diff, no_sig,diff_no_sig, Data_to_comp_row.get(14), Data_to_comp_row.get(15)));//diff3
		Data_to_comp_row.add(17,weight(power,norm, sig_diff,Data_to_comp_row.get(16),Data_to_comp_row.get(14))); //weight3
		
		Data_to_comp_row.add(18, DiffTotal(Data_to_comp_row.get(6), Data_to_comp_row.get(11),Data_to_comp_row.get(16)));
		return Data_to_comp_row;
	}

	private String diff(int min_diff, int no_sig, int diff_no_sig, String input_sig, String sig){
		String ans="";
		double input;
		double dsig;
		double temp;
		input= Double.parseDouble(input_sig);
		dsig= Double.parseDouble(sig);
		if (sig.equals("-120"))ans="100";
		else {
		temp=(Math.max(Math.abs(input-dsig),min_diff));
		ans=""+temp;
		}
		return ans;
	}
	private String weight(double power, double norm, double sig_diff,String diff, String input_sig){
		String ans="";
		double temp;
		
		temp= norm/((Math.pow(Double.parseDouble(diff), sig_diff))*(Math.pow(Double.parseDouble(input_sig), power)));
		ans= ans+temp;
		
		return ans;
	}
	
	private String DiffTotal(String d1, String d2, String d3){
		String ans="";
		double temp;
		temp=Double.parseDouble(d1)+Double.parseDouble(d2)+Double.parseDouble(d3);
		ans=""+temp;
		return ans;
	}
	
	//Gets:
	public String getLat(){
		return Data_to_comp_row.get(0);
	}
	public String getLon(){
		return Data_to_comp_row.get(1);
	}
	public String getAlt(){
		return Data_to_comp_row.get(2);
	}
	
}
