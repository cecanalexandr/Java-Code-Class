package com.Review;
import java.util.Scanner;
class Main {

public static void main(String [] args){

boolean loan;
int score;
String elg="0";
Scanner input =new Scanner(System.in);
System.out.println("Do you need a loan?");
loan=input.nextBoolean();

if(loan){
 System.out.println("What is your credit score?");
score=input.nextInt();
if(score<600){
  elg="Not eligible";
}else if(score>=600 && score<=700){
  elg="Maybe eligible";
}else if(score>=701 && score<=800){
  elg="Eligible";
}else if(score>800){
  elg="Definitely eligible";
}

 }else{
    elg="Unknown";
 }
 System.out.println("The eligibility is "+elg);


}}

