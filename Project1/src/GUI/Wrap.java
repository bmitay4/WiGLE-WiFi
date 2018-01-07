package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import Extends_2_A.MatrixScan;
import Filter.DateFilter;
import Filter.IDFilter;
import Filter.LocationFilter;
import Folder.OpenFolder;

public class Wrap{

	private OpenFolder OpenFolderObj = new OpenFolder();
	private DateFilter DateFilterObj = new DateFilter();
	private IDFilter IDFilterObj = new IDFilter();
	private LocationFilter LocationFilterObj = new LocationFilter();
	private MatrixScan MatrixScanObj = new MatrixScan();
	ArrayList<List<String>> Matrix = new ArrayList<>();
	List<String> TempGD = new ArrayList<>();
	public void setMatrix(ArrayList<List<String>> Matrix){
		this.Matrix = Matrix;
	}
	public void OpenFiles(DefaultListModel<Object> DLM){
		for (int i = 0; i < DLM.size(); i++) {
			String filename = (String)DLM.get(i);
			if(filename.endsWith(".csv")) OpenFolderObj.addSingleMatrix(this.Matrix, filename);
			else{
				OpenFolderObj.addFolderMatrix(this.Matrix, filename);
			}
		}
	}
	public void AlgorithmA(ArrayList<List<String>> Matrix, String Mac){
		TempGD = MatrixScanObj.MacLocation(Matrix, Mac);
		JOptionPane.showMessageDialog(null, "Location Of Mac: "+Mac+"\nLatitude:   "+TempGD.get(1)+"\nLongitude:   "+TempGD.get(2)+"\nAltitude:   "+TempGD.get(0));

	}
	public ArrayList<List<String>> Filters(Filters FilterObj){
		if(FilterObj.checkBox[0]) DateFilterObj.dateFilter(this.Matrix, FilterObj.initTime, FilterObj.FinalTime); //Time Filter
		if(FilterObj.checkBox[1]) LocationFilterObj.Locationfilter2(this.Matrix, FilterObj.minLat, FilterObj.maxLat, FilterObj.minLon, FilterObj.maxLon, FilterObj.minAlt, FilterObj.maxAlt); //Location Filter
		if(FilterObj.checkBox[2]) IDFilterObj.IDfilter(this.Matrix,  FilterObj.ID); //ID Filter
		return this.Matrix;
	}
}
