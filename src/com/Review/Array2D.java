package com.Review;

public class Array2D {

	public static void main(String[] args) {
		//Write a program  to print all elements of the 2D array Using a for loop

		int [][]array = {{1,2,3},{4,5,6,9},{7,8}};

		for(int i=0;i<array.length;i++) {
			for(int b=0; b<array[i].length; b++) {
				System.out.print(array[i][b]+" ");
			}
                System.out.println();
	}
		for(int []inn : array) {
			for (int elements:inn) {
				System.out.print(elements);
			}
		}
	}
}
