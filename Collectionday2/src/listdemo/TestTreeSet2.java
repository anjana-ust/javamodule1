package listdemo;
import java.util.TreeSet;
import java.util.Iterator;
public class TestTreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> bookset = new TreeSet<String>();
		bookset.add("Java in nutshell");
		bookset.add("Java complete reference");
		bookset.add("Thinking in java");
		bookset.add("Java in 21 days");
		bookset.add("Java for dummys");
		System.out.println(bookset);
		System.out.println(bookset.size());
		System.out.println(bookset.contains("Java in nutshell"));
		bookset.add("Thinking in java");
		System.out.println(bookset.size());
		for(String book :bookset) {
			System.out.println(book);
		}
		Iterator<String> iter = bookset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	
	
	}

}
