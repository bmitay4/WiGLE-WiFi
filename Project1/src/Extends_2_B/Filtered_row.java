package Extends_2_B;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Templates;

public class Filtered_row {

	private String mac1;
	private String mac2;
	private String mac3;
	private String lat;
	private String lon;
	private String alt;
	private String sig1;
	private String sig2;
	private String sig3;
	private String input_sig1;
	private String input_sig2;
	private String input_sig3;
	private ArrayList<String> row=new ArrayList<String>() ;
	
	public Filtered_row(String input_mac1, String input_mac2, String input_mac3, String input_sig1,String input_sig2,String input_sig3, List<String> temp){
		String no_sig="-120";
		this.mac1=input_mac1;
		this.mac2=input_mac2;
		this.mac3=input_mac3;
		this.lat=temp.get(2);
		this.lon=temp.get(3);
		this.alt=temp.get(4);
		this.input_sig1=input_sig1;
		this.input_sig2=input_sig2;
		this.input_sig3=input_sig3;

		for(int i=7; i<temp.size(); i=i+4){
			if(temp.get(i).equals(this.mac1))this.sig1=temp.get(i+2);
			else this.sig1=no_sig;
		}
		for(int i=7; i<temp.size(); i=i+4){
		if(temp.get(i).equals(this.mac2))this.sig2=temp.get(i+2);
			else this.sig2=no_sig;
		System.out.println(this.sig2);
		}
		for(int i=7; i<temp.size(); i=i+4){
		if(temp.get(i).equals(this.mac3))this.sig3=temp.get(i+2);
			else this.sig3=no_sig;
		System.out.println(this.sig3);
		}
		this.row.add(lat);
		this.row.add(lon);
		this.row.add(alt);
		this.row.add(mac1);
		this.row.add(this.input_sig1);
		this.row.add(sig1);
		this.row.add(mac2);
		this.row.add(this.input_sig2);
		this.row.add(sig2);
		this.row.add(mac3);
		this.row.add(this.input_sig3);
		this.row.add(sig3);
		
		
	}

	public String getMac1() {
		return mac1;
	}

	public String getMac2() {
		return mac2;
	}

	public String getMac3() {
		return mac3;
	}

	public String getLat() {
		return lat;
	}

	public String getLon() {
		return lon;
	}

	public String getAlt() {
		return alt;
	}

	public String getSig1() {
		return sig1;
	}

	public String getSig2() {
		return sig2;
	}

	public String getSig3() {
		return sig3;
	}

	public String getInput_sig1() {
		return input_sig1;
	}

	public String getInput_sig2() {
		return input_sig2;
	}

	public String getInput_sig3() {
		return input_sig3;
	}

	public ArrayList<String> getRow() {
		return row;
	}
}
