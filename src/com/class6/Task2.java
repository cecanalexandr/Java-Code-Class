package com.class6;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		
		
		char grade ='S';
		String S;
		Scanner scan1= new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		S = scan1.nextLine();
		
		switch (S) {
		
		case "A":
			S="Excellent";
			break;
		case "B":
			S="Good";
			break;
		case "C":
			S="Average";
			break;
		case"D":
			S="Bad";
			break;
		case "F":
			S="Not Acceptable";
			break;
			default:
				S="Invalid";
				
		}
		System.out.println("Your gradeis "+S);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
