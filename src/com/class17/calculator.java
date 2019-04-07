package com.class17;

public class calculator {

	public static void main(String[] args) {
		
		calculator demo=new calculator();
		demo.sum(10,20);
		demo.sub(100, 200);
		demo.mult(200, 300);
		demo.div(10, 20);
		

	}public void sum(int a,int b){
		
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
		
	}
	public void mult(int a,int b) {
		System.out.println(a*b);
		
	}
	public void div(int a,int b){
		System.out.println(a/b);
	}

}
