package com.class13;

public class Task {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (sunday-->yadnus).
	//	String str = "Sunday";
	//	for(int  i=str.length()-1;i>=0; i--) {
	//		System.out.print((str.charAt(i)) );
	//	}

		String day =new String("Thursday!");
		if (!day.isEmpty()) {
			if (day.length()%2!=0 && day.length()>=3) {
				System.out.println(day.charAt(day.length()/2));
			}
		}
	}

}
