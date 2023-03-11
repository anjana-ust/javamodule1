package day2.shapes;

public class ShareFactory {
	public static void main(String args[]) {
		ShapesIface circle = new Circle(2);
		circle.area();
	}

}
