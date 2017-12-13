package Run;

import java.util.ArrayList;
import java.util.List;

import Folder.OpenFolder;
import Row.Sort_Rows;

public class Run {
	String userLocation;
	String userDestination;
	ArrayList<List<String>> Matrix;

	OpenFolder Open_Folder_Object = new OpenFolder();
	Sort_Rows Sort_Rows_Object = new Sort_Rows();
	
	public void Program(String userLocation, String userDestination){
		this.userLocation = userLocation;
		this.userDestination = userDestination;

		Matrix = Open_Folder_Object.openFolder(userLocation, userDestination);
		Sort_Rows_Object.sortBySignal(Matrix);
		System.out.println("hi");
	}


}
