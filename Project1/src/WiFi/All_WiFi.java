package WiFi;

import Row.Single_Row_After_Merge;

public class All_WiFi {

	String SSID;
	String MAC;
	String Channel;
	String Signal;
	int Row_Size;
	Single_Row_After_Merge Single_Row_After_Merge_Object;
	
	public All_WiFi(Single_Row_After_Merge Single_Row){
		this.Single_Row_After_Merge_Object = Single_Row;
	}

	public int getRow_Size() {
		return Single_Row_After_Merge_Object.getRow_Size();
	}

	public String getSSID() {
		return Single_Row_After_Merge_Object.getSSID();
	}

	public String getMAC() {
		return Single_Row_After_Merge_Object.getMAC();
	}

	public String getChannel() {
		return Single_Row_After_Merge_Object.getChannel();
	}

	public String getSignal() {
		return Single_Row_After_Merge_Object.getSignal();
	}
	
	
}
