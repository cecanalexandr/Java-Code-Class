package ScannerClass;

import java.util.Scanner;

public class ScannerAndIf {

	public static void main(String[] args) {
		// take 2 number from a user and campare those number 
		
		int num1, num2;
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		System.out.println(num1);
		
		System.out.println("Enter second number");
		num2 = scan.nextInt();
		System.out.println(num2);
		
		if (num1>num2) {
		System.out.println(num1+"is larger than " +num2);
		}else if(num1==num2){
		System.out.println(num1+"is smaller than "+num2);
		
		} else {
			System.out.println(num1+"is equal"+num2);
		}
			
		
		

	}

}
