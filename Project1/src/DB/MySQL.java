package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MySQL {

	//	Returned matrix
	public static ArrayList<List<String>> ansMatrix = new ArrayList<>();

	public static void main(String ip, String port, String username, String password) throws SQLException {
		ArrayList<List<String>> Matrix = new ArrayList<>();
		String url = "jdbc:mysql://"+ip+":"+port;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{

			System.out.println("Connecting to database...");

			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT UPDATE_TIME FROM information_schema.tables WHERE TABLE_SCHEMA = 'oop_course_ariel' AND TABLE_NAME = 'ex4_db'");
			System.out.println("Login successful");
			if (rs.next()) {
				System.out.println("**** Update: "+rs.getString(1));
			}
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM ex4_db");
			rs = pst.executeQuery();

			while(rs.next()){
				int index = 0;
				int SQLIndex = 2;
				int numOfWiFi = rs.getInt(7);	

				List<String> Temp = new ArrayList<>();
				Temp.add(index++, rs.getString(SQLIndex++));
				Temp.add(index++, rs.getString(SQLIndex++));
				Temp.add(index++, rs.getString(SQLIndex++));
				Temp.add(index++, rs.getString(SQLIndex++));
				Temp.add(index++, rs.getString(SQLIndex++));
				Temp.add(index++, rs.getString(SQLIndex++));

				if(numOfWiFi == 1){
					Temp.add(index++, "SSID");
					Temp.add(index++, rs.getString(SQLIndex++));
					Temp.add(index++, "Channel");
					Temp.add(index++, rs.getString(SQLIndex++));
				}
				else{
					for (int j = 0; j < numOfWiFi; j++) {
						Temp.add(index++, "SSID");
						Temp.add(index++, rs.getString(SQLIndex++));
						Temp.add(index++, "Channel");
						Temp.add(index++, rs.getString(SQLIndex++));
					}
				}
				Matrix.add(Temp);

			}
			updateMatrix(Matrix);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "An error occurred\nPlease check your login information");
		}
		System.out.println(ansMatrix.size());
		conn.close();
		stmt.close();
		rs.close();
	}

	private static void updateMatrix(ArrayList<List<String>> tempMatrix){
		for (int i = 0; i < tempMatrix.size(); i++) {
			ansMatrix.add(tempMatrix.get(i));
		}
	}
}
