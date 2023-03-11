package oopsday5.atm;
import java.util.*;

public class AtmImpl implements AtmIface {
	Scanner sc = new Scanner(System.in);
     AtmFunction a = new AtmFunction();
     int amt;
	@Override
	public void withdraw() {
		System.out.println("Enter the amount");
		 amt = sc.nextInt();
		//System.out.println(amt);
		 //a.check();
		   if(a.fhcount>a.ufh)
			{
			   System.out.println("Enter the 500 count : ");
			a.setUfh(sc.nextInt());}
			
		   else if(a.fhcount<a.ufh || a.hcount>a.ufh && a.getUfh()*500!=amt) {
			
			System.out.println("Enter the 100 count : ");
			a.setUh(sc.nextInt());
			}
		   else if(a.fhcount<a.ufh||a.hcount<a.uh||a.fycount >a.ufy && a.getUfh()*100!=amt) {
			   System.out.println("Enter the 50 count : ");
				a.setUfy(sc.nextInt());
			   
		   }
			
		   else if(a.fhcount<a.ufh||a.hcount<a.uh || a.fycount<a.ufh||a.tycount>a.uty && a.getUfy()*50!=amt)
				   //(a.getUfh()*500)+(a.getUh()*100)!=amt)
			{
			System.out.println("Enter the 20 count : ");
			a.setUfy(sc.nextInt());
			}
		   else {
			//if((a.getUfh()*500)+(a.getUh()*100)+(a.getUfy()*50)!=amt) {
			System.out.println("Enter the 10 count : ");
			a.setUty(sc.nextInt());}
			
//			if((a.getUfh()*500)+(a.getUh()*100)+(a.getUfy()*50)+(a.getTycount()*20)!=amt) {
//			System.out.println("Enter the 10 count : ");
//			a.setUt(sc.nextInt());}
			
			
			
		
			
			
			
			
			
			
		}
		
		

	@Override
	public void display() {
	 System.out.println("Amount dispensed 500 * "+a.getUfh()+ " "+ a.getUfh()*500);
	 System.out.println("Amount dispensed 100 * "+a.getUh()+" "+ a.getUh()*100);
	 System.out.println("Amount dispensed 50 * "+a.getUfy()+" "+ a.getUfy()*50);
	 System.out.println("Amount dispensed 20 * "+ a.getUty()+" "+a.getUty()*20);
	 System.out.println("Amount dispensed 10 * "+ a.getUt()+" "+a.getUt() *10);
		
	}
	

}
