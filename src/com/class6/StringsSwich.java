package com.class6;

import java.util.Scanner;

public class StringsSwich {

	
	public static void main(String[] args) {
		
		
		/*prompt user to enter trheir country
		 * based on the country -->specify favorite food 
		 */
		
		Scanner scan;
		String country;
		String food;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter wich country you are from");
		country=scan.nextLine();
		switch(country){
			
			case "USA":
                food="Burger";
			    break;
			case"Afganistan":
				food="Palau";
			    break;
			case  "Russia":   
                 food="Pelemei";
                 break;
			case "Italy":
				food="Pasta";
				break;
			case "Turky":
				food="Baklava";
				break;
			case "Moroco":
				food="couscous";
				break;
			case "Kazakhstan":
				food="Beshparmak";
				break;
			case "Pakistan":
				food="Biryan";
				break;
			default:
				food="Unknown";
				
                 
		}             
        System.out.println("Your favorite is "+food);         
                 
                
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
     
		
		
	}

}
