package com.class9;

public class exemple2 {

	public static void main(String[] args) {
		/*I want to print patter
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		for(int i=5; i>=1;i--) {
			for(int y=5; y>=1;y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
