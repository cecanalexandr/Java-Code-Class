package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i==2 || i==3) {
				continue;
			}
			System.out.println(i);
			System.out.println("Hi");
		}
		
		System.out.println("Hello");
		
		/*I want to print numbers from 1 to 20 but skip those divisible by3*/
		
		for (int a=1; a<=20;a++) {
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
		}
		
		
		
		
	}

}
