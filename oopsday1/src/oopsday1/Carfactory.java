package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		Car jack= new  Car();
		jack.brand = "audi";
		jack.colour = "black";
		jack.model = "q5";
		jack.price = 500000;
	
         System.out.println(jack.brand);
         System.out.println(jack.model);
         System.out.println(jack.colour);
         System.out.println(jack.price);
         Car bmw = new Car();
         bmw.brand ="BMW";
         bmw.model ="x3";
         bmw.colour ="white";
         bmw.price =6000000;
         //System.out.println(bmw.brand);
         System.out.println(bmw.model);
         System.out.println(bmw.colour);
         System.out.println(bmw.price);
         
         
         //jack = "hello"; type mismatch
         
         bmw = jack;
         
	}

}
