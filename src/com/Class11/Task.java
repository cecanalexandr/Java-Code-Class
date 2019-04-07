package com.Class11;

public class Task {

	public static void main(String[] args) {
   //Create an array of cars anda store 6 elements into it.Using 2 difernt loops
    //print all values from the array.
		
		String[] cars=new String[6];
		cars[0]="Nissan";
		cars[1]="Audi";
		cars[2]="BMW";
		cars[3]="Honda";
		cars[4]="Infinity";
		cars[5]="Lada"; 
		for(int i=0; i<cars.length; i++) {
			System.out.println( " My favorit car is " + cars[i]);
		}
		//the second ways:
		String[] car= {"Nissan", "Audi", "BMW", "Honda", "Infinity", "Lada"};
		System.out.println();
		for(int i=0; i<car.length;i++) {
			System.out.println(car[i]);
		}
		System.out.println();
		for(String cars1 : car) {
			System.out.println(cars1);
		}
	}

}
