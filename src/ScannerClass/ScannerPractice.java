package ScannerClass;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner myselfInfo = new Scanner (System.in);
		
		
		myselfInfo.nextInt();
		System.out.println("Who you are?");
		String fname = myselfInfo.nextLine();
		
		System.out.println("Where are you from?");
		String countryName =myselfInfo.nextLine();
		
		System.out.println("Hello "+ fname + " from "+ countryName);
		
		System.out.println("How old are you?");
		String age=myselfInfo.nextLine();
		
		System.out.println("You like pizza?");
		String food=myselfInfo.nextLine();
		
		System.out.println("do you like to play soccer?");
		String sport=myselfInfo.nextLine();
		
		System.out.println("What is your favorite soccer team?");
		String club=myselfInfo.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
