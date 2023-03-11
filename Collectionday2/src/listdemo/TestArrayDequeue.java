package listdemo;
import java.util.*;

public class TestArrayDequeue {
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element = queue.peek();  //queue.getFirst(); similar to get 
		System.out.println(element);
		System.out.println(queue);
		queue.poll(); // remove first element
		System.out.println(queue);
		 Iterator<String> iter =queue.iterator();
		 while(iter.hasNext())
		 System.out.println(iter.next());
		
	}

}
