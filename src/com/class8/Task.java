package com.class8;

public class Task {

	public static void main(String[] args) {
		/* Print numbers from1 to 100*/
		//print numbers from 1 to 100
  for(int a=1;  a<=100 ;a++) {
	  System.out.println(a);
  }//print numbers from 100 to 1
  for (int b=100;b>=1; b--) {
	  System.out.println(b);
  }//print odd  numbers from 1 to 20(2 ways)
  for(int c=1;c<=20; c++) {
	  System.out.println(c);
  }
	// print even number between 20 to 1(2 ways )
  for(int d=20;d>=1;d-- ) {
	  System.out.println(d);
  }// print even between numbers 20 to 50 (2ways)
  for(int f=20;f<=50;f++) {
	  if (f%2==1) {
		  } System.out.println(f);
  }// print odd numbers between 20 and 50 (2ways)
  for(int e=21;e<=50;e+=2) {
	  System.out.println(e);
  }
  for (int e=20; e<=50;e++) {
	  if (e%2==0) {
		  System.out.println(e);
	  }
  }
}
}
