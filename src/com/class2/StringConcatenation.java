package com.class2;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "John";
//My name is John;
		System.out.println("My name is" + name);
		String day = "sunday";
		// Sunday is a coding day
		System.out.println(day + "is a coding day");
		//
		int num1 = 12;
		int num2 = 13;
		// The value of num1 is _and the value of num is _ .
		System.out.println("The value of num1 is " + num1 + " and value of num2 is " + num2 + ".");
		/*
		 * String name="John"; String lastName="Smith"; char grade='B'; String
		 * city="Fairfax"; String state="VA"; long phoneNumber=923456790l; Print: My
		 * name is Alexandru and my last name is Cecan I am student I live in city of
		 * Fairfax in a state of VA My phone number is 5712772325
		 */
		String name1 = "John";
		String lastName = "Cecan";
		char grade = 'A';
		String city = "Fairfax";
		String state = "VA";

		long phoneNumber = 5712772325l;

		System.out.println("My name is" + name + "and my last name is" + lastName);
		System.out.println("I am" + grade + " student");
		System.out.println("I live in a city of" + city + "in  state of " + state);
		System.out.println("My phone numer is" + phoneNumber);

	}
}
