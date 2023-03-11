package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		Car jaq = new Car();

		jaq.setBrand("jaguar");
		jaq.setColour("black");
		jaq.setPrice(50000000);
		jaq.setModel("suv");
 		System.out.println(jaq.getBrand());
 		System.out.println(jaq.getColour());
 		System.out.println(jaq.getPrice());
 		System.out.println(jaq.getBrand());
		/*
		 * Car jack= new Car(); jack.brand = "audi"; jack.colour = "black"; jack.model =
		 * "q5"; jack.price = 500000;
		 * 
		 * System.out.println(jack.brand); System.out.println(jack.model);
		 * System.out.println(jack.colour); System.out.println(jack.price);
		 */
		/*
		 * Car bmw = new Car(); bmw.model ="x3"; bmw.colour ="white"; bmw.price
		 * =6000000; //System.out.println(bmw.brand); System.out.println(bmw.model);
		 * System.out.println(bmw.colour); System.out.println(bmw.price);
		 */
         
         //jack = "hello"; type mismatch
         
        
         
	}

}
