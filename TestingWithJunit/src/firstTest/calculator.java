package firstTest;
import java.math.*;

public class calculator {
	
	public double power(int b,int e) {
		//return b*e;
		int p =1;
		int i =1;
		
		if(b==0|| e==0) 
			return 0;
		else {
			while(i <=e) {
				p*=b;
			}
		}
		return p;
	}
		 public int factoraial(int n) {
			 int fact=1;
			 for(int i=1;i<=n;i++) {
				 fact*=i;
			 }
			 return fact;
			
		}
	public boolean oddoreven(int n) {
		if(n%2==0)
			return true;
		else
		   return false;
		
			
	}
	

}
