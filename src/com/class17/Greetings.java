package com.class17;

public class Greetings {

	public static void main(String[] args) {
		Greetings obj=new Greetings();
		obj.hello();
		
		// how to find the largest number
		 obj.findLargest(20, 10);// calling method FindLargest and passing value of 20 and 10
		 obj.findLargest(30, 31);// calling method FindLargest and passing value of 30 and 31
		 obj.findLargest(2000, 664674);
		 obj.helloToInstructor("Arif");
		 obj.helloToInstructor("Weqas");
		 
	}
	void helloToInstructor(String name) {// name=" " // method with 1 parametr
		System.out.println(" Hello " + name);
	}
	void hello() {//method signature
		System.out.println("Hello");//method body
	}
	void findLargest(int a,int b) {//method with 2 parametrs

		
		if (a>b) {
			System.out.println("A is larger then B");
		}else {
			System.out.println("B is the larger then A");
		}
	}

}
