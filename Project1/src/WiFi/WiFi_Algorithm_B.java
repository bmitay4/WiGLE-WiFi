package WiFi;

import java.util.ArrayList;
import java.util.List;

public class WiFi_Algorithm_B {
	
	int NumOfWiFi;

	ArrayList<String> Ans_Row = new ArrayList<>();
	List<String> WiFi_Row;
	
	public WiFi_Algorithm_B(List<String> WiFi_Row){	//Constructor
		this.WiFi_Row = WiFi_Row;
		this.NumOfWiFi = getNumOfWiFi();
	}
	public ArrayList<String> WiFi_B_Row(List<String> WiFi_Row){ //For a row with 1 MAC
		this.WiFi_Row = WiFi_Row;
		Ans_Row.add(getMAC());
		Ans_Row.add(getSignal());
		return Ans_Row;
	}
	public ArrayList<String> WiFis_B_Row(List<String> WiFi_Row){ //For a row with multiplication MAC
		this.WiFi_Row = WiFi_Row;
		for (int i = 0; i < NumOfWiFi; i++) {
			Ans_Row.add(getMultiMAC(7 + NumOfWiFi*4));
			Ans_Row.add(getMultiSignal(9 + NumOfWiFi*4));
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
