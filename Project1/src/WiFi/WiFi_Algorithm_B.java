package WiFi;

import java.util.ArrayList;
import java.util.List;

public class WiFi_Algorithm_B {
	
	int NumOfWiFi;
	List<String> WiFi_Row;
	ArrayList<String> Ans_Row = new ArrayList<>();

	public ArrayList<String> WiFis_B_Row(List<String> WiFi_Row){ //For a row with multiplication MAC

		this.WiFi_Row = WiFi_Row;
		this.NumOfWiFi = getNumOfWiFi();

		for (int i = 0; i < NumOfWiFi; i++) {
			Ans_Row.add(getMultiMAC(7 + i*4));
			Ans_Row.add(getMultiSignal(9 + i*4));
		}
		return Ans_Row;
	}
	
	public int getNumOfWiFi(){
		return Integer.parseInt(this.WiFi_Row.get(5));
	}
	public String getMAC(){
		return this.WiFi_Row.get(7);
	}
	public String getSignal(){
		return this.WiFi_Row.get(9);
	}
	public String getMultiMAC(int index){
		return this.WiFi_Row.get(index);
	}
	public String getMultiSignal(int index){
		return this.WiFi_Row.get(index);
	}
	
}
