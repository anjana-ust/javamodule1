package javaenums;

public class Testenums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is "+today.getName());
		
		switch(today) {
		case MONDAY :
					System.out.println("Work hard");
					break;
		case TUESDAY : 
					System.out.println("Work little more");
					break;
		case WEDNESDAY :
					System.out.println("Work work more");
					break;
		case THURSDAY :
					System.out.println("Work more weekend is around soon");
					break;
		case FRIDAY :
					System.out.println("Weekend has arrived , party hard");
					break;
		case SATURDAY :
					System.out.println("ENJOYYYYY");
					break;
		case SUNDAY :
					System.out.println("do all cleaning works,snoooozzzz");
					break;
		}

	}

}
