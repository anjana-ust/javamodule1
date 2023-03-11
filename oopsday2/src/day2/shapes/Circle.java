package day2.shapes;

public class Circle implements ShapesIface {
	private double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius =radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
		
	}
	public void area() {
		System.out.println("Area of circle is  "+(2*3.14*radius));
	}
	

}
