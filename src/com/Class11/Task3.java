package com.Class11;

public class Task3 {

	public static void main(String[] args) {
		//create an array of integers and largest number
		
	     
		int []number={30,40,70,13,499,80};
		int largest =number[0];
		for( int i=0; i<number.length;i++) {
			if (number[i]>largest) {
				largest=number[i];
			}
			
		}
System.out.println("The largest number is "+largest);
	}

}
