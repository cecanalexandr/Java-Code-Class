package com.class21;

public class LocalVariables {

	public static void main(String[] args) {
		
		
		Student obj1=new Student();
		obj1.studentNames="a";
		
		obj1.studentID++;
	
		String name ="John";
		//System.out.println(name);
		
		LocalVariables obj=new LocalVariables();
		obj.hello(name);//Hello Jack
		System.out.println(name);
		
	}
	public void hello(String name) {
		name="Jack";
		System.out.println("Hello "+name);
	}
}
