package oopsday3.drawline;
import java.util.*;
public class DrawMain {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		p1.drawLine(p1,p2);
	
		
		
		
	}

}
