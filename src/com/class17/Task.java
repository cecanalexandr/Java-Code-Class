package com.class17;

public class Task {
	
	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.
		Task obj=new Task();
		
		obj.findLargest(50, 20);
		

		
	}
	int findLargest(int a, int b) {
		if (a>b) {
		return a;
		}else {
			return b;
		}
}
}