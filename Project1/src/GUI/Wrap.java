package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

import Filter.DateFilter;
import Filter.IDFilter;
import Filter.LocationFilter;
import Folder.OpenFolder;

public class Wrap{

	private OpenFolder OpenFolderObj = new OpenFolder();
	private DateFilter DateFilterObj = new DateFilter();
	private IDFilter IDFilterObj = new IDFilter();
	private LocationFilter LocationFilterObj = new LocationFilter();
	
	ArrayList<List<String>> Matrix = new ArrayList<>();

	public void OpenFiles(DefaultListModel<Object> DLM){
		for (int i = 0; i < DLM.size(); i++) {
			String filename = (String)DLM.get(i);
			if(filename.endsWith(".csv")) OpenFolderObj.addSingleMatrix(this.Matrix, filename);
			else{
				OpenFolderObj.addFolderMatrix(this.Matrix, filename);
			}
		}
	}
	
	public ArrayList<List<String>> Filters(Filters FilterObj){
		if(FilterObj.checkBox[0]) DateFilterObj.dateFilter(this.Matrix, FilterObj.initTime, FilterObj.FinalTime); //Time Filter
		if(FilterObj.checkBox[1]) LocationFilterObj.Locationfilter2(this.Matrix, FilterObj.minLat, FilterObj.maxLat, FilterObj.minLon, FilterObj.maxLon, FilterObj.minAlt, FilterObj.maxAlt); //Location Filter
		if(FilterObj.checkBox[2]) IDFilterObj.IDfilter(this.Matrix,  FilterObj.ID); //ID Filter
		return this.Matrix;
	}
}
