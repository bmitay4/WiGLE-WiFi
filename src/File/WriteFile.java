package File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
	
	/**
	 * Write a matrix to the disk
	 * @param userDestination
	 * @param Matrix
	 */
	
	public void writeFiles(String userDestination, ArrayList<List<String>> Matrix){
		try {
			FileWriter fw = new FileWriter(userDestination);
			PrintWriter outs = new PrintWriter(fw);

			for (int i = 0; i < Matrix.size(); i++) {
				for (int j = 0; j < Matrix.get(i).size(); j++) {
					outs.print(Matrix.get(i).get(j)+", ");
				}
				outs.println();
			}
			outs.close();
			fw.close();
		}
		catch(IOException ex) {
			System.out.print("Error writing file\n" + ex);
		}
	}
}
