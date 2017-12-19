package OtherTools;

import java.util.ArrayList;
import java.util.List;

import File.OpenFile;

public class Tools {
	
	ArrayList<List<String>> Matrix = new ArrayList<>();
	private OpenFile OpenFile_Obj = new OpenFile();
	
	public List<String> toRow(String userLocation){
		this.Matrix = OpenFile_Obj.openFiles(userLocation);
		return Matrix.get(12);
	}

}
