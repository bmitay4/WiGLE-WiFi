package Run;

public class Main {
	/**
	 * Ariel University, OOP Course 
	 * Course's Mission
	 * @author Hani Bakbani, Avital Israeli, Itay Ben Moshe
	 */
	public static void main(String[] args) {

		String userLocation = "C:/OOP/CSV/";
		String userDestination = "C:/OOP/CSV/OUT/";

		Run Go = new Run();
		Go.Program(userLocation, userDestination);
	}

}
