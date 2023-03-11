package oopsday2;

public class Carfactory {
	public static void main(String args[]) {
		Car car = new Car(5000,500,0,false);
		System.out.println(car);
		System.out.println("Car");
		
		car.start();
		car.move();
		car.honk();
		car.stop();
		System.out.println("Car");
System.out.println(car);
}
}
