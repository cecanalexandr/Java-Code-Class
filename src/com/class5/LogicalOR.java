package com.class5;

public class LogicalOR {

	public static void main(String[] args) {
	
		/*we have 7 days week
		 * if days are from1-5-->weekday
		 * if days are from6-7-->weekend
		 * otherwise "not a valid day"
		 */
		
		int day=8;
		// false OR false OR false OR false OR True-->true
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
			// false OR false-->false
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
			
		}else {
			System.out.println("Not a valid day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
