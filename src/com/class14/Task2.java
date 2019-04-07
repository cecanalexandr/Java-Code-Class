package com.class14;

public class Task2 {

	public static void main(String[] args) {
		/* Create a String that should be combination of letters, numbers and special characters. 
		*Find out how many alpha characters are there in the String.
        */
		  String str1="439 && hello %^&";  
		  String replacedNoNumbers=str1.replaceAll("[A-Za-z]", "");  
		  System.out.println(replacedNoNumbers);
		
		/*You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
		*How would you find out how many sentences are in that String?
		*/
		//String array="Is it saturday! Is it raining! Do we have a Java Class today?";
	}
}
