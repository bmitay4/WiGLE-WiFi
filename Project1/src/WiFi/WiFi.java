package WiFi;


import Row.Single_Row;

public class WiFi {
	String SSID;
	String MAC;
	int Channel;
	int Signal;
	Single_Row Single_Row_Object;
	
	
	public WiFi(String SSID, String MAC, int Channel, int Signal){
		this.SSID = SSID;
		this.MAC = MAC;
		this.Channel = Channel;
		this.Signal = Signal;
	}

	public String getSSID() {
		return SSID;
	}

	public void setSSID(String sSID) {
		SSID = sSID;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	public int getChannel() {
		return Channel;
	}

	public void setChannel(int channel) {
		Channel = channel;
	}

	public int getSignal() {
		return Signal;
	}

	public void setSignal(int signal) {
		Signal = signal;
	}
	

}
