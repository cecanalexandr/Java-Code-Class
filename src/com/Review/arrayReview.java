package com.Review;

public class arrayReview {

	public static void main(String[] args) {
		//  Write a program to print the length of each array.
		int [][]ar = {{1,2,3},{4,5,6,9},{7,8}};
		
		for (int i=0; i<ar.length;i++) {
			System.out.println("The length of row " + (i +1) + " = " + ar [i].length);
		}
      for(int[] inner : ar) {
    	  System.out.println("The length of row = " + inner.length);
      }
      	}

}
