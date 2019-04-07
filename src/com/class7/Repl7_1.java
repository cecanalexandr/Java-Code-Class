package com.class7;

import java.util.Scanner; 
class Main {
 public static void main(String[]args){
   
   String responsability;
   String instractor;
  Scanner scan=new Scanner(System.in);
   System.out.println("enter name of the instructor");
   instractor=scan.nextLine();
   switch (instractor){
     
    case "Shiva":
       System.out.println("Will take care of Java Assignment");
       break;
    case "Sandish":
         System.out.println("Will take care of SDLC Assignment");
      break;
    case "Weqas":
           System.out.println("Will take care of Selenium Assignment");
      break;
    case "Asel":
        System.out.println("Will take care of every Assignment");
     break;
      
      default:
      System.out.println("Invalid instructor selected");
      break;
     
   }
 }
}