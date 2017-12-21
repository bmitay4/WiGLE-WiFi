package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ExportKML.WriteKML;

public class FilterChoose {

	String userChoice;
	IDFilter IDFilter_Object = new IDFilter();
	DateFilter DateFilter_Object = new DateFilter();
	LocationFilter LocationFilter_Object = new LocationFilter();
	WriteKML WriteKML_Object = new WriteKML();

	/**
	 * The user choose one of the following filters options
	 * @param userDestination
	 * @param Matrix
	 */
	public void Filter(String userDestination, ArrayList<List<String>> Matrix) {
		System.out.println("Choose a filter:\nID, Date, Location\nFor none filter, press 0");

		Scanner flag = new Scanner(System.in);
		this.userChoice = flag.next();

		if(userChoice.equals("ID")) IDFilter_Object.ID(userDestination, Matrix);
		else if(userChoice.equals("Date")) DateFilter_Object.Date(userDestination, Matrix);
		else if(userChoice.equals("Location")) LocationFilter_Object.Location(userDestination ,Matrix);
		else if(userChoice.equals("0")) WriteKML_Object.exportKml(userDestination, Matrix);
		else System.out.println("Wrong Input");
		flag.close();		
	}

}
