package WiFi;


import java.util.ArrayList;
import java.util.List;

import Row.Single_Row;

/**
 * Representing an object, that contain the 4 parameters for AP
 */
public class WiFi {
	String SSID;
	String MAC;
	String Channel;
	String Signal;
	List<String> Single_Row;
	Single_Row Single_Row_Object;


	public ArrayList<String> WiFi_Row(List<String> Single_Row){
		this.Single_Row = Single_Row;

		Single_Row_Object = new Single_Row(Single_Row);

		ArrayList<String> Ans_Row = new ArrayList<>();
		Ans_Row.add(getSSID());
		Ans_Row.add(getMAC());
		Ans_Row.add(getChannel());
		Ans_Row.add(getSignal());

		return Ans_Row;
	}


	public String getSSID() {
		return Single_Row.get(6);
	}

	public String getMAC() {
		return Single_Row.get(7);
	}

	public String getChannel() {
		return Single_Row.get(8);
	}

	public String getSignal() {
		return Single_Row.get(9);
	}
}