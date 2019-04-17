package com.class24;

public class TestEmployee {

	public static void main(String[] args) {
		
	Employee emp=new Employee();
	FullTimeEmployee ft=new FullTimeEmployee();
	Contractor contractor=new Contractor();
	
	emp.getPaid();//Employee gets paid
	ft.getPaid();//Full time employee gets paid salary + bonus
    contractor.getPaid();//Employee gets paid

	}

}
