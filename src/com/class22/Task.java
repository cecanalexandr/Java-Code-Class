package com.class22;
/*
 * Write a program that will have a constructor: one with parameters and second
 * without any parameters. Create a separate Test class where you will execute
 * both of the constructors.
 */
  public class Task{
String str;


  Task(String str){
    System.out.println("I am a constructor with 1 parameter "+str);
}
 Task(){
 System.out.println("I am a constructor with no parameters");
}

	public static void main(String[] args) {
		Task obj1=new Task("Alex");
		Task obj2=new Task();
		
	}

}
