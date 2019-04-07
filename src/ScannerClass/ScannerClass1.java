package ScannerClass;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		
	//take a number from auser and print that number 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter any number ");
		int myNumber=scanner.nextInt();
		System.out.println("The number you enterd is " +myNumber);

	}

}
