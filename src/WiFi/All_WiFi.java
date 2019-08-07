package WiFi;

import java.util.ArrayList;
import java.util.List;

import Row.Single_Row_After_Merge;

public class All_WiFi {


	ArrayList<String> Single_Row, WiFi_Row;
	Single_Row_After_Merge Single_Row_After_Merge_Object;

	public List<String> All_WiFi_Row(List<String> Single_Row){
		Single_Row_After_Merge_Object = new Single_Row_After_Merge(Single_Row);
		WiFi_Row = new ArrayList<>();
		for (int i = 0; i < Single_Row.size(); i++) {
			WiFi_Row.add(Single_Row.get(i));
		}		
		return WiFi_Row;
	}
	public List<String> WiFi_Row_By_MAC(String MAC){
		ArrayList<String> Ans_Row = new ArrayList<>();
		Ans_Row.add(getSSID(MAC));
		Ans_Row.add(getMAC(MAC));
		Ans_Row.add(getLat(MAC));
		Ans_Row.add(getLon(MAC));
		Ans_Row.add(getAlt(MAC));
		Ans_Row.add(getChannel(MAC));
		Ans_Row.add(getSignal(MAC));
		return Ans_Row;
	}


	public String getLat(String MAC){
		return this.WiFi_Row.get(2);
	}
	public String getLon(String MAC){
		return this.WiFi_Row.get(3);
	}
	public String getAlt(String MAC){
		return this.WiFi_Row.get(4);
	}
	public String getMAC(String MAC){
		int index = this.WiFi_Row.indexOf(MAC);
		if(index == -1) return null;
		return this.WiFi_Row.get(index);
	}
	public String getSSID(String MAC){
		int index = this.WiFi_Row.indexOf(MAC);
		if(index == -1) return null;
		return this.WiFi_Row.get(index - 1);
	}
	public String getChannel(String MAC){
		int index = this.WiFi_Row.indexOf(MAC);
		if(index == -1) return null;
		return this.WiFi_Row.get(index + 1);
	}
	public String getSignal(String MAC){
		int index = this.WiFi_Row.indexOf(MAC);
		if(index == -1) return null;
		return this.WiFi_Row.get(index + 2);
	}
}
