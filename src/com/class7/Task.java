package com.class7;

public class Task {

	public static void main(String[] args) {
	/*create a boolean variable workDay an assign true 
	 * create int variable day and assign it to 1
	 * as long as it is workDay print -->"I need a day off " and increment day
	 * day once day is 6 -->your condition for your loop shold becom false*/
	 
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
		
			System.out.println("I need day off");
			
			if (day==6) {
				workDay=false;
			}else {
			System.out.println("I do need a day off");
			}
		day++;
		
		}

	}

	}
