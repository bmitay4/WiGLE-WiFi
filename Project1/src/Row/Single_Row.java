package Row;

import java.util.ArrayList;
import java.util.List;

public class Single_Row{
	
	String Time;
	String ID;
	String Lat;
	String Lon;
	String Alt;
	String SSID;
	String MAC;
	String Signal;
	String Channel;
	int Signal_As_Integer;
	List<String> Single_Row, Ans_Row;
	
	public Single_Row(List<String> Single_Row){
		this.Single_Row = Single_Row;
	}
	public List<String> Single_Row_As_List(List<String> Single_Row, String ID){
		ArrayList<String> Ans_Row = new ArrayList<>(); 
		Ans_Row.add(getTime());
		Ans_Row.add(ID);
		Ans_Row.add(getLat());
		Ans_Row.add(getLon());
		Ans_Row.add(getAlt());
		Ans_Row.add("1");
		Ans_Row.add(getSSID());
		Ans_Row.add(getMAC());
		Ans_Row.add(getChannel());
		Ans_Row.add(getSignal());

		return Ans_Row;
	}

	public String getTime() {
		return this.Single_Row.get(3);
	}

	public String getLat() {
		return this.Single_Row.get(6);
	}

	public String getLon() {
		return this.Single_Row.get(7);
	}

	public String getAlt() {
		return this.Single_Row.get(8);
	}	
	public String getSSID() {
		return this.Single_Row.get(1);
	}
	public String getMAC() {
		return this.Single_Row.get(0);
	}
	public String getSignal() {
		return this.Single_Row.get(5);
	}
	public int getIntegerSignal() {
		return Integer.parseInt(this.Single_Row.get(5));
	}
	public String getChannel() {
		return this.Single_Row.get(4);
	}

}
