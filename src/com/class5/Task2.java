package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	Scanner name;
	int quiz;
	int midTerm;
	int finalGrade;
		
		
	name= new Scanner(System.in);
		
	System.out.println("Please enter quiz score ");
	quiz= name.nextInt();
	
	System.out.println("Please enter the midTerm score");
	midTerm =name.nextInt();
	
	System.out.println("Please enter final score");
	finalGrade= name.nextInt();
	
	int average=(quiz+midTerm+finalGrade)/3;
	System.out.println("-----------------------");
	System.out.println(average);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
