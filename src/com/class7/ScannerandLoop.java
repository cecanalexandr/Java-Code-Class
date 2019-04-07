package com.class7;
import java.util.Scanner;
public class ScannerandLoop {

	public static void main(String[] args) {
		
	
		/*Promt user to ask nam 3 times and print "You are doing great__"*/

	
   Scanner scan;
   String name;
   
   
   scan =new Scanner(System.in);
   int a=1;
   
   while(a<=11) {
	   System.out.println("Please enter your name");
	   name = scan.nextLine();
	   System.out.println("Your are doing great " + name);
	   a++;
   }
   
   
   
   
   
   
   
   
   
   
   
   
  }
  }
