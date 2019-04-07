package com.class6;
import java.util.Scanner;
public class Swich {

	public static void main(String[] args) {
		
		String country;
		String Language;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter which country you are from?");
	   
		country=scan.nextLine();
		switch (country) {
		
		case"Moldova":
			Language="Romanian";
			break;
		case"Russia":
			Language="Russian";
			break;
		case "USA":
			Language="English";
			break;
		case "Spain":
			Language="Spanish";
			break;
		case "Brazil":
			Language="Brazilian";
			break;
			default:
				Language="Unknown";
		}System.out.println("Your country is "+country+" and your language is "+Language);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 

	}

}
