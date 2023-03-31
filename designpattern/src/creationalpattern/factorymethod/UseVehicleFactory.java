package creationalpattern.factorymethod;

public class UseVehicleFactory {
	public static void main(String[] args) {
		
	
	vehicle seltos = Vehiclefactory.newInstance("Seltos");
	seltos.start();

	vehicle suzuki = Vehiclefactory.newInstance("xcross");
	suzuki.move();


}
}