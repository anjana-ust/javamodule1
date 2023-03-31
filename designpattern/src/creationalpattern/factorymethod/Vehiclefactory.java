package creationalpattern.factorymethod;

public class Vehiclefactory {

	public static  vehicle newInstance(String car) {
		
		vehicle v = null;
		
		if(car == null)
			return null;
		else if(car.equals("sltos"))
			v=new Seltos();
		else if(car.equals("xcross"))
			v = new xcross();
		 
		
		return v;

	}

}
