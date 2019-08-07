package GUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import DB.MySQL;
import Extends_2_A.MatrixScan;

import File.OpenFile;
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
	private OpenFile OpenFileObj = new OpenFile();
	private Extends_2_B.MatrixScan MatrixScanObj1 = new Extends_2_B.MatrixScan();

	ArrayList<List<String>> Matrix = new ArrayList<>();

	List<String> TempGD = new ArrayList<>();	

	public void OpenFiles(DefaultListModel<Object> DLM){
		updateMatrix(MySQL.ansMatrix);
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
	public void AlgorithmB1(ArrayList<List<String>> Matrix, String MacString){
		List<String> listMac = OpenFileObj.CSVtoArrayList(MacString);
		TempGD = MatrixScanObj1.byString(listMac, Matrix);
		JOptionPane.showMessageDialog(null, "Your Location:\nLatitude:   "+TempGD.get(1)+"\nLongitude:   "+TempGD.get(2)+"\nAltitude:   "+TempGD.get(3));
	}
	public void AlgorithmB2(ArrayList<List<String>> Matrix, String Mac1, String Mac2, String Mac3, String Sig1, String Sig2, String Sig3){
		TempGD = MatrixScanObj1.byValues(Matrix, Mac1, Mac2, Mac3, Sig1, Sig2, Sig3);
		JOptionPane.showMessageDialog(null, "Your Location:\nLatitude:   "+TempGD.get(2)+"\nLongitude:   "+TempGD.get(3)+"\nAltitude:   "+TempGD.get(4));
	}

	public ArrayList<List<String>> Filters(Filters FilterObj){
		if(FilterObj.checkBox[0]) DateFilterObj.dateFilter(this.Matrix, FilterObj.initTime, FilterObj.FinalTime); //Time Filter
		if(FilterObj.checkBox[1]) LocationFilterObj.Locationfilter2(this.Matrix, FilterObj.minLat, FilterObj.maxLat, FilterObj.minLon, FilterObj.maxLon, FilterObj.minAlt, FilterObj.maxAlt); //Location Filter
		if(FilterObj.checkBox[2]) IDFilterObj.IDfilter(this.Matrix,  FilterObj.ID); //ID Filter
		return this.Matrix;
	}
	public void DB(){
		updateMatrix(MySQL.ansMatrix);

	}
	public void updateMatrix(ArrayList<List<String>> tempMatrix){
		for (int i = 0; i < tempMatrix.size(); i++) {
			this.Matrix.add(tempMatrix.get(i));
		}
	}

}
