package com.Review;

public class arrayrev4 {

	public static void main(String[] args) {
		// find the number of values above the value of 7.

//		int[][]ray = {{2,6,9,3,7},{1,7,9,4,8},{0,4,6,2,5},{0,1,2,3}};
//		int count = 0;
//		for(int[] inner:ray) {
//			for(int element: inner) {
//				if(element>7) {
//					count++;
//				}
//			}
//			
//		}
//		System.out.println("The number of all elements above 7 is " +count);
		
		//Print the average of the values in column.
		int[][]ray = {{2,6,9,3,7},{1,7,9,4,8},{0,4,6,2,5},{0,1,2,3}};
		int sum2=0;
		for(int i=0; i<ray.length;i++) {
			sum2+=ray[i][2];
			
		}
		System.out.println(sum2  /ray.length);
	}

}
