package com.class7;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		
		/*ask user to pay for a soda 
		 * keep asking user to pay for soda until entered price is not equel to 1.99
		 * after user got a rigth amount print "Please enjoy your soda"*/
		
		
	Scanner	scan=new Scanner(System.in);
	double a;
	System.out.println("Insert money");
	a=scan.nextDouble();
while (a!=1.99) {
	System.out.println(" enter corect price");
	a=scan.nextDouble();
	}
	System.out.println("enjoy yor soda");
}
	}


