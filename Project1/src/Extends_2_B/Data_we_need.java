package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

public class Data_we_need {

	private List<String> data=new ArrayList<String>();
	
	
	public List<String> DataWeNeed(String input_mac1, String input_mac2, String input_mac3, String input_sig1,String input_sig2,String input_sig3, List<String> row){
		String[]temp=new String[6];
//		int k=0;
		//point
		data.add(0,row.get(2));
		data.add(1,row.get(3));
		data.add(2,row.get(4));
		
		//MAC and..
		for(int i=7; i< row.size(); i=i+4){
//			System.out.println("i="+ i);
			if (input_mac1.equals(row.get(i))) {
//				data.add(3,row.get(i));//mac1
//				data.add(4,row.get(i+1));//sig1
//				System.out.println(k);
				temp[0]=input_mac1;
				temp[1]=row.get(i+2);
//				k++;
			}
			else {
//				data.add(3,input_mac1);
//				data.add(4,"-120");
//				System.out.println(k);
				temp[0]=input_mac1;
				temp[1]="-120";
//				k++;
			}
		}
		for(int i=7; i< row.size(); i=i+4){
			if (input_mac2.equals(row.get(i))) {
//				data.add(5,row.get(i));
//				data.add(6,row.get(i+1));
//				System.out.println(k);
				temp[2]=input_mac2;
				temp[3]=row.get(i+2);
//				k++;
			}
			else {
//				data.add(5,input_mac2);
//				data.add(6,"-120");
//				System.out.println(k);
				temp[2]=input_mac2;
				temp[3]="-120";
//				k++;
			}
		}
		for(int i=7; i< row.size(); i=i+4){
			if (input_mac3.equals(row.get(i))) {
//				data.add(7,row.get(i));
//				data.add(8,row.get(i+1));
				temp[4]=input_mac3;
				temp[5]=row.get(i+2);
//				k++;
			}
			else {
//				data.add(7,input_mac3);
//				data.add(8,"-120");
				temp[4]=input_mac3;
				temp[5]="-120";
			}
		}
		for(int j=0; j<6; j++){
			data.add(temp[j]);
		}
		data.add(9,input_sig1);
		data.add(10,input_sig2);
		data.add(11,input_sig3);
		
		return data;
	}
	
	public String getLat(){
		return this.data.get(0);
	}
	public String getLon(){
		return this.data.get(1);
	}
	public String getAlt(){
		return this.data.get(2);
	}
	public String getMac1(){
		return this.data.get(3);
	}
	public String getInputSig1(){
		return this.data.get(9);
	}
	public String getSig1(){
		return this.data.get(4);
	}
	public String getMac2(){
		return this.data.get(5);
	}
	public String getInputSig2(){
		return this.data.get(10);
	}
	public String getSig2(){
		return this.data.get(6);
	}
	public String getMac3(){
		return this.data.get(7);
	}
	public String getInputSig3(){
		return this.data.get(11);
	}
	public String getSig3(){
		return this.data.get(8);
	}
}

