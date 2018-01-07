package Filter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ExportKML.WriteKML;
import File.WriteFile;
import Row.Single_Row_After_Merge;
import WiFi.GeneralWiFi;

public class DateFilter {

	/**
	 * Filter By Date
	 * @param userDestination
	 * @param Matrix
	 */

	Single_Row_After_Merge Single_Row_After_Merge_Object;
	GeneralWiFi GeneralWiFiObj;
	WriteKML WriteKML_Object;
	WriteFile Write_File_Object = new WriteFile();

	public void Date(String userDestination, ArrayList<List<String>> Matrix){
		Scanner flag1 = new Scanner(System.in);
		Scanner flag2 = new Scanner(System.in);

		System.out.println("Type the requested Date range");
		System.out.println("An examples of proper date and time: 2017-02-18 18:21:22");

		System.out.println("from ");
		String userStartDate = flag1.nextLine();
		System.out.println("to ");
		String userEndDate = flag2.nextLine();

		dateFilter(Matrix, userStartDate, userEndDate);

		flag1.close();
		flag2.close();

		WriteKML_Object  = new WriteKML();
		Write_File_Object.writeFiles(userDestination+"DateSort.csv", Matrix);
		WriteKML_Object.exportKml(userDestination, Matrix);
	}

	public void dateFilter(ArrayList<List<String>> Matrix, String userStartDate, String userEndDate) {
		for (int i = 1; i < Matrix.size(); i++) {
			GeneralWiFiObj = new GeneralWiFi(Matrix.get(i));
			String currentlyTime = GeneralWiFiObj.getDate();
			if(!compareDate(userStartDate, userEndDate, currentlyTime)){
				Matrix.remove(i);
				i--;
			}
		}
	}

	private boolean compareDate(String userStartDate, String userEndDate, String currentlyDate){
		Date startDate = StringToDate(userStartDate);
		Date endDate = StringToDate(userEndDate);
		Date pcDate = StringToDate(currentlyDate);
		return (pcDate.before(endDate) && pcDate.after(startDate));		
	}

	private Date StringToDate(String Date){
		DateFormat tempDate = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss"); 
		Date temp;
		try {
			temp = tempDate.parse(Date);
			return temp;

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
