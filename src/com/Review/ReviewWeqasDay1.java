package com.Review;

import java.util.Scanner;

public class ReviewWeqasDay1{
	 
	 String eyes;
	 String hair;
	 String nose;
	 String shirt;
	 public static void main(String []args) {
		 
		 ReviewWeqasDay1 weqas=new ReviewWeqasDay1();
//		 weqas.eyes="blue";
//		 weqas.hair="blue";
//		 weqas.nose="bron";
//		 weqas.shirt="gray";
//		 weqas.humanEyes();
		 weqas.noReturn();
		 
		 ReviewWeqasDay1 weqas1=new ReviewWeqasDay1();
		 weqas1.eyes="green";
		
		System.out.println(weqas1.eyes);
//		weqas.scannerFirstName();
//		weqas.noReturn();
//		weqas.scannerInt();
//      weqas.reverseString();
//		weqas.vowelCountWithLooop();
		weqas.vowelCountWithReplaceAll();
	 }
	 void humanEyes() {
		 ReviewWeqasDay1 weqas1=new ReviewWeqasDay1();
		 weqas1.eyes="red";
		 System.out.println(weqas1.eyes);
		
	 }
	 void noReturn() {
		 System.out.println("I not have a return type");
	 }
	 void scannerFirstName() {
		 Scanner scan =new Scanner(System.in);
		 scan.nextLine();
		 
	 }
	 void scannerInt() {
		 Scanner scan =new Scanner(System.in);
		 scan.nextInt();
	 }
	 void reverseString() {
		 String str="seigolonhceT xatnyS";
		 String reverse="";
	 
		 for(int i=str.length()-1;i>=0;i--) {
			 reverse+=str.charAt(i);
	 }
		 System.out.println(reverse);
	 }
	 void vowelCountWithLooop() {
		 String weqas="hello world my name Is wEqas";
		 char[] w=weqas.toCharArray();
		 char empty;
		 for(int i=0; i<=w.length; i++) {
			 if (w[i]=='a'|| w[i]=='A' || w[i]=='e'||w[i]=='E'||w[i]=='i'||w[i]=='I'||w[i]=='o'||w[i]=='O'||
					 w[i]=='u'||w[i]=='U') {
			  empty=w[i];
			  System.out.print (empty+",");
			 }
		 }
	 }
     void vowelCountWithReplaceAll() {   
    	 String weqas="hello world my name Is wEqas";       
    	 String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");   
    	 //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");    
    	 System.out.println(replace);
     }
}