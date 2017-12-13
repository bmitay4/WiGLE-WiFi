package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenFile{

	String csvFile;
	ArrayList<List<String>> File_Matrix;
	ArrayList<String> Single_Row;
	
	//Generates a matrix of a single CSV file
	public ArrayList<List<String>> openFiles(String location){
		BufferedReader br = null;
		this.File_Matrix = new ArrayList<>();
		int index = 0;
		try {
			br = new BufferedReader(new FileReader(location));
			while ((csvFile = br.readLine()) != null) {
				File_Matrix.add(index++, CSVtoArrayList(csvFile));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException Exception) {
				Exception.printStackTrace();
			}
		}
		return File_Matrix;
	}
	
	//Creates and return a single row
	public ArrayList<String> CSVtoArrayList(String csvFile) {
		this.Single_Row = new ArrayList<String>();
		if (csvFile != null) {
			String[] splitData = csvFile.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					Single_Row.add(splitData[i].trim());
				}
			}
		}
		return Single_Row;
	}

}
