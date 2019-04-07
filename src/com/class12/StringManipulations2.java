package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		//contains() --> checks for specific value in the string
        //if value is present--> true , else--> false

		String str="Good morning,studen!";
		boolean contains=str.contains("students");
		System.out.println(contains);
		
		String present="Welcome,Mehmet";
		String neededValue="WELCOME";
		
	
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);
        
		//startsWith(), endsWith(), --> will return true if String starts/ends with specific value
        //else --> false
		System.out.println("_________StartWith & EndsWith_________");
		String str1="Syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("X"));
		
        //isEmpty() if length of a string is =0--> string is empty else -> it is not
		System.out.println("_________isEmpty()_________");
		String str2="Syntax";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println(str1.endsWith("X"));
		
        //concat() --> will concatenate 1 string to the end of another
		System.out.println("___concat()_____");
		String str3="Hello";
		String str4="Ali";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
        //trim()--> will remove spaces at the beginning and at the end of your String
		
		//System.out.println("_____--_____")
		String expected="You may qualify for a multi-policy discount!";
		String actual="You may qualify for a multi-policy discount!";
		
		actual=actual.trim();
		System.out.println(expected.equals(actual));
		
	}

}
