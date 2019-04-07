package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//prompt the user to enter person heights in inches 
		//person should be classified as one of the following:
		//short(under 5 feet)
		//midium (5 to 6 feet)
		// tall (6 feet and over
		
	    
	    
	    int heigt;
	    
		Scanner inc=new Scanner(System.in);
		
		System.out.println("please enter your heights in inches (forex6");
		
		double height = inc.nextDouble();
		
		if (height<5)  {
			System.out.println("short");
		}else if (height==5 || height<6) {
			System.out.println("midium");
		}else if (height>=6){
			System.out.println("Tall");
		}else {
			System.out.println("Please enter valid height");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
