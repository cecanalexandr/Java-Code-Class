package com.class23;

public class Employee {
	public static String department="IT";
	
	public int salary;
	protected int salary1;
	public void getPaid() {
		System.out.println("Employee get's paid"+salary);
	}
	public static void work() {
		System.out.println("Employee students works in "+ department);
	}

}
