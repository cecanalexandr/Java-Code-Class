package com.class24;
// Parent Class
public class Bank {
	
	public int chargeInterest() {
		return 0;
		
	}

}
//1 child class
class BOA extends Bank{
	@Override //annotition
public int chargeInterest() {
	return 2;
}	
}
//child class
class PNC extends Bank{
	public int chargeInterest() {
		return 3;
	}
}