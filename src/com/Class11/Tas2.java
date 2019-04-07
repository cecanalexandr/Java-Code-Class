package com.Class11;

public class Tas2 {

	public static void main(String[] args) {
   // Create an arry of contries ,while retrieving all values from an array print
		//capital for each country.(use 2 diferentloops)
		
		String[] array= {"Moldava", "Russia", "Romania", "USA" };
		
		for(int i=0; i<array.length; i++ ) {
			System.out.println();
			// you are missing a System.out statement
			if (array[i].equals("Moldova")) {
				System.out.println("Chisinau");
			}else if (array[i].equals("Russia")) {
				System.out.println("Moscow");
			}else if (array[i].equals("Romania")) {
				System.out.println("Bucuresti");
				
			}else if (array[i].equals("USA")) {
				System.out.println("Washington DC");
			}
		}
		String[] contries = {"Moldava", "Russia", "Cuba", "USA"};
		for (String contry : contries) {
			switch(contry) {
			case"Moldova":
				System.out.println("Chisinau");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			case "Cuba":
				System.out.println("Havana");
				break;
			case"USA":
				System.out.println("Washington DC");
				break;
			}
		}
	}
	

}
