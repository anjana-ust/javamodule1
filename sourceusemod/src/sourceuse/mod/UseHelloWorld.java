package sourceuse.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {

	public static void main(String[] args) {
		
		
		try {
			HelloWorld world = new HelloWorld();
			world.message();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		     
		var x ="anjana";
		var y=23.75;
		var z ='c';
		//x=20 assign and initialize in one line
		System.out.println(x.length());
		
	}
	

}
