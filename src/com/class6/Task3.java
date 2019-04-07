package com.class6;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
	
		double a;
		double b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		a=sc.nextDouble();       
		
		System.out.println("Please enter a number");
		b=sc.nextDouble();   
		
		double add=(a+b);
		double subs=(a-b);
		double mult=(a*b);
		double div=(a/b);
		double result=0;
		
		System.out.println("Please enter your operator");
		char operator;
		operator=sc.next().charAt(0);
		
		switch (operator) {
		
		case '+':
			result=add;
			break;
		case '-':
			result=subs;
			break;
		case'*':
			result=mult;
			break;
		case '/':
			result=div;
			break;
			default:
				System.out.println("There is no any result for this operation");
			
		}
		System.out.println("Result of the operation is " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
