package ExportKML;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import Row.Single_Row_After_Merge;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Folder;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

public class WriteKML {

	Single_Row_After_Merge Single_Row_After_Merge_Object;
	public void exportKml(String userDestination, ArrayList<List<String>> Matrix){
		final Kml kml = new Kml();
		Document doc = kml.createAndSetDocument().withName("Wigle KML File").withOpen(true);

		// create a Folder
		Folder folder = doc.createAndAddFolder();
		folder.withName("Wireless access point").withOpen(true);

		// create Place mark elements
		for (int i = 1; i < Matrix.size(); i++) {
			Single_Row_After_Merge_Object = new Single_Row_After_Merge(Matrix.get(i));

			double longitude = Double.parseDouble(Single_Row_After_Merge_Object.getLon());
			double latitude = Double.parseDouble(Single_Row_After_Merge_Object.getLat());

			String time = Single_Row_After_Merge_Object.getTime();
			String SSID = Single_Row_After_Merge_Object.getSSID();
			String MAC = Single_Row_After_Merge_Object.getMAC();
			String Channel = Single_Row_After_Merge_Object.getChannel();
			String Signal = Single_Row_After_Merge_Object.getSignal();
			String TimeStamp = Single_Row_After_Merge_Object.getTimeStamp();

			createPlacemarkWithChart(doc, folder, longitude, latitude, SSID, MAC, Channel, Signal, time, TimeStamp);

			if(Single_Row_After_Merge_Object.getNum_Of_WiFi_As_Integer() > 1){ //If there is more than 1 AP in a single row
				for (int j = 6; j < Single_Row_After_Merge_Object.getRow_Size(); j = j + 4) {
					SSID = Matrix.get(i).get(j);
					MAC = Matrix.get(i).get(j + 1);
					Channel = Matrix.get(i).get(j + 2);
					Signal = Matrix.get(i).get(j + 3);
					createPlacemarkWithChart(doc, folder, longitude, latitude, SSID, MAC, Channel, Signal, time, TimeStamp);

				}
			}
		} 

		// Print and save
		try {
			kml.marshal(new File(userDestination+".kml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static void createPlacemarkWithChart(Document document, Folder folder,double longitude ,double latitude ,String SSID, String MAC, String Channel, String Signal, String Time, String TimeStamp) {
		Placemark placemark = folder.createAndAddPlacemark();
		placemark.withName(SSID).withDescription("MAC Address :"+MAC+"</b><br/>Signal: <b>"+Signal+"</b><br/>Frequency: <b>"+Channel+"</b><br/>Time: <b>"+Time+"</b>");
		placemark.createAndSetPoint().addToCoordinates(longitude, latitude);
		placemark.createAndSetTimeStamp().withWhen(TimeStamp);
	}
}
