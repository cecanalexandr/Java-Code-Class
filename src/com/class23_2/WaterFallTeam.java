package com.class23_2;

import com.class23.Employee;
  class WaterFallTeam extends Employee {
	public static void main(String[]args) {
		
		
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary=90000;// can access protected values from different package through inheritance ONLY 
		//default values cannot be access in different package
		wt.salary1=210000;
		
		
		
		
		
		
		
		
	}
	

}
