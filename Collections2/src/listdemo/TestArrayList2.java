package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {
	public static void main(String[] args) {
		
	
	ArrayList<String> colors = new ArrayList<String>();
	//colors.add(new Object());
	//colors.add(new Double(10.10));
	colors.add("Blue");
	colors.add("Black");
	colors.add("Green");
	colors.add(null);
	System.out.println(colors.size());
	System.out.println(colors);
}
}