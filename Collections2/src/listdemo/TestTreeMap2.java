package listdemo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TestTreeMap2 {
	public static void main(String[] args) {
		TreeMap<String,String> countrycurr = new TreeMap<>();
		countrycurr.put("IND","Rupe");
		countrycurr.put("USA","$");
		countrycurr.put("UK","Pound");
		//countrycurr.put(null, null); Treeset dosn't allows null elements.
		System.out.println(countrycurr);
		System.out.println(countrycurr.get("IND"));
		countrycurr.put("IND","Rupee");
		System.out.println(countrycurr); // Accenting order
		System.out.println(countrycurr.size());
		System.out.println(countrycurr.containsKey("UK"));
		System.out.println(countrycurr.containsValue("$"));
		
		
		//HASHMAP HAS 3 VIEWS
		// 1. key view
		Set<String> keys = countrycurr.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		// 2. value view
		Collection<String> values = countrycurr.values();
		for(String value :values) {
			System.out.println(value);
		}
		// 3. key value together - EntrySet
		Set<java.util.Map.Entry<String, String>> entries = countrycurr.entrySet();
		for(java.util.Map.Entry<String, String> entry :entries)
		{
			System.out.println(entry);
		}
	
	
	
	}

}
