package WiFi;


import java.util.ArrayList;
import java.util.List;

import Row.Single_Row;

public class WiFi_After_Merge {
	String SSID;
	String MAC;
	String Channel;
	String Signal;
	String Lon;
	String Lat;
	String Alt;
	List<String> Single_Row;
	Single_Row Single_Row_Object;
	
	
	public ArrayList<String> WiFi_Row(List<String> Single_Row){
		this.Single_Row = Single_Row;
		
		Single_Row_Object = new Single_Row(Single_Row);
		
		ArrayList<String> Ans_Row = new ArrayList<>();
		Ans_Row.add(getSSID());
		Ans_Row.add(getMAC());
		Ans_Row.add(getLat());
		Ans_Row.add(getLon());
		Ans_Row.add(getAlt());	
		Ans_Row.add(getChannel());
		Ans_Row.add(getSignal());

		return Ans_Row;
	}
	
	public String getLat() {
		return this.Single_Row.get(2);
	}

	public String getLon() {
		return this.Single_Row.get(3);
	}
	public String getAlt() {
		return this.Single_Row.get(4);
	}	
	public String getSSID() {
		return this.Single_Row.get(6);
	}

	public String getMAC() {
		return this.Single_Row.get(7);
	}

	public String getChannel() {
		return this.Single_Row.get(8);
	}

	public String getSignal() {
		return this.Single_Row.get(9);
	}
}