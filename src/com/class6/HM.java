package com.class6;

import java.util.Scanner;

public class HM {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Is it  weekend?");
		
		String answer=scan.nextLine();
		
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Today you will be learning java");
		}else {
			System.out.println("Today you will be learning Manual testing");
		}
			
		
		
		
		
		
	}
	
}
