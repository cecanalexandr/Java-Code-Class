package com.Review;

public class arrayrev3 {

	public static void main(String[] args) {
		// Write a program to find the average of row2
		
		int[][]rating = {{2,6,9,3,7},{1,7,9,4,8},{0,4,6,2,5},{0,1,2,3}};
		double sum=0;
		double average=0;
		for (int i=0; i<rating[1].length; i++) {
			sum+=rating[1][i];
		}
average=sum/5;
System.out.println(average);
	}

}
