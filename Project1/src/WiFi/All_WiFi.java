package WiFi;

import java.util.List;

import Row.Single_Row_After_Merge;

public class All_WiFi {

	List<String> Single_Row, WiFi_Row;
	Single_Row_After_Merge Single_Row_After_Merge_Object;

	public List<String> All_WiFi_Row(List<String> Single_Row){
		Single_Row_After_Merge_Object = new Single_Row_After_Merge(Single_Row);
		WiFi_Row.addAll(6, Single_Row);
		return WiFi_Row;
	}

}
