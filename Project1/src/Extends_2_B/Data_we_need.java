package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class Data_we_need {

	private List<String> data=new ArrayList<String>();
	
	public List<String> DataWeNeed(String input_mac1, String input_mac2, String input_mac3, String input_sig1,String input_sig2,String input_sig3, List<String> row){
		
		data.add(row.get(2));
		data.add(row.get(3));
		data.add(row.get(4));
		for(int i=7; i< row.size(); i=i+4){
			if (input_mac1.equals(row.get(i))) {
				data.add(row.get(i));
				data.add(row.get(i+1));
			}
			else {
				data.add(null);
				data.add("-120");
			}
			if (input_mac2.equals(row.get(i))) {
				data.add(row.get(i));
				data.add(row.get(i+1));
			}
			else {
				data.add(null);
				data.add("-120");
			}
			if (input_mac3.equals(row.get(i))) {
				data.add(row.get(i));
				data.add(row.get(i+1));
			}
			else {
				data.add(null);
				data.add("-120");
			}
		}
		data.add(4, input_sig1);
		data.add(7, input_sig2);
		data.add(10, input_sig3);
		
		return data;
	}
	
//	public String getLat(){
//		return this.data.get(0);
//	}
//	public String getLon(){
//		return this.data.get(1);
//	}
//	public String getAlt(){
//		return this.data.get(2);
//	}
//	public String getMac1(){
//		return this.data.get(3);
//	}
//	public String getInputSig1(){
//		return this.data.get(4);
//	}
//	public String getSig(){
//		return this.data.get(5);
//	}
//	public String getMac2(){
//		return this.data.get(6);
//	}
//	public String getInputSig2(){
//		return this.data.get(7);
//	}
//	public String getSig2(){
//		return this.data.get(8);
//	}
//	public String getMac3(){
//		return this.data.get(9);
//	}
//	public String getInputSig3(){
//		return this.data.get(10);
//	}
//	public String geSig3(){
//		return this.data.get(11);
//	}
}

