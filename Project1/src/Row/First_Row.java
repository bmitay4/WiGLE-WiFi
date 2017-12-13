package Row;

import java.util.List;

public class First_Row {
	List<String> First_Row;
	
	public First_Row(List<String> Single_Row){
		this.First_Row = Single_Row;
	}
	public String getID() {
		return this.First_Row.get(5).substring(8);
	}

}
