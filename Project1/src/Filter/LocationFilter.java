package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ExportKML.WriteKML;
import File.WriteFile;
import Row.Single_Row_After_Merge;
import WiFi.GeneralWiFi;

public class LocationFilter {

	/**
	 * Filter By Location, set a point(Lat,Lon) and the radius by meters.
	 * @param userDestination
	 * @param Matrix
	 */

	Single_Row_After_Merge Single_Row_After_Merge_Object;
	WriteKML WriteKML_Object;
	WriteFile Write_File_Object = new WriteFile();
	GeneralWiFi GeneralWiFiObj;

	public void Location(String userDestination, ArrayList<List<String>> Matrix){

		Scanner flag1 = new Scanner(System.in);
		Scanner flag2 = new Scanner(System.in);
		Scanner flag3 = new Scanner(System.in);

		System.out.println("Type the Latitude requested point");
		String Lat = flag1.next();

		System.out.println("Type the Longitude requested point");
		String Lon = flag2.next();

		System.out.println("Type the requested radius (Meters)");
		String Radius = flag3.next();
		Locationfilter(Matrix, Lat, Lon, Radius);

		flag1.close();
		flag2.close();
		flag3.close();

		WriteKML_Object  = new WriteKML();
		Write_File_Object.writeFiles(userDestination+"LocationSort.csv", Matrix);
		WriteKML_Object.exportKml(userDestination, Matrix);
	}

	private void Locationfilter(ArrayList<List<String>> Matrix, String Lat, String Lon, String Radius){
		double radius = Double.parseDouble(Radius);
		double Distance = 0;
		for (int i = 1; i < Matrix.size(); i++) {
			Single_Row_After_Merge_Object = new Single_Row_After_Merge(Matrix.get(i));
			Distance = distance2Points(Lat, Lon, Single_Row_After_Merge_Object.getLat(), Single_Row_After_Merge_Object.getLon());
			if (Distance > radius){
				Matrix.remove(i);
				i--;
			}

		}
	}

	private double distance2Points(String Lat, String Lon, String resLat, String ResLon){
		double userLat = Math.toRadians(Double.parseDouble(Lat));
		double userLot = Math.toRadians(Double.parseDouble(Lon));
		double computerLat = Math.toRadians(Double.parseDouble(resLat));
		double computerLot = Math.toRadians(Double.parseDouble(ResLon));

		double dLat = userLat - computerLat;
		double dLon = userLot - computerLot;

		double a = Math.pow(Math.sin(dLat/2), 2) + Math.cos(userLat)*Math.cos(computerLat)*Math.pow(Math.sin(dLon/2), 2);
		double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double earthRadius = 6373000;
		return c * earthRadius;
	}

	/**
	 * Second filter version
	 */
	public void Locationfilter2(ArrayList<List<String>> Matrix, String minLat, String maxLat, String minLon, String maxLon, String minAlt, String maxAlt){
		for (int i = 1; i < Matrix.size(); i++) {
			GeneralWiFiObj = new GeneralWiFi(Matrix.get(i));
			if(!verifyLocation(minLat, maxLat, minLon, maxLon, minAlt, maxAlt, GeneralWiFiObj.getLat(), GeneralWiFiObj.getLon(), GeneralWiFiObj.getAlt())){
				Matrix.remove(i);
				i--;
			}
		}
	}

	private boolean verifyLocation(String minLat, String maxLat, String minLon, String maxLon, String minAlt, String maxAlt, String Lat, String Lon, String Alt){
		return (Double.parseDouble(Lat) <= Double.parseDouble(maxLat) && Double.parseDouble(Lat) >= Double.parseDouble(minLat)
				&& Double.parseDouble(Lon) <= Double.parseDouble(maxLon) && Double.parseDouble(Lon) >= Double.parseDouble(minLon)
				&& Double.parseDouble(Alt) <= Double.parseDouble(maxAlt) && Double.parseDouble(Alt) >= Double.parseDouble(minAlt)); 
	}

}
