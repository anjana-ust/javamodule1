package listdemo;
import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {
	public static void main(String[] args) {
		HashSet<String> bookset = new HashSet<String>();
		bookset.add("Java in nutshell");
		bookset.add("Java complete reference");
		bookset.add("Thinking in java");
		bookset.add("Java in 21 days");
		bookset.add("Java for dummys");
		bookset.add(null);
		bookset.add(null); // can take only one null
		System.out.println(bookset);
		System.out.println(bookset.size());
		System.out.println(bookset.contains("Java in nutshell"));
		bookset.add("Thinking in java");
		System.out.println(bookset.size());// will not allow duplicates
		for(String book :bookset) {
			System.out.println(book);
		}
		Iterator<String> iter = bookset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	
	
	}

}
