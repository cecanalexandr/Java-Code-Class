package com.class12;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {

		 /* Accept username, password and confirm password and check following requirements:
			*Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			*Password should be minimum 8 characters, if less → message=”Password is too short”.
			*Password cannot contain username if so, → message=”Password cannot contain username”.
			*Password should match confirmed password, if not  → message “Passwords do not match”.
			*Only after all requirements met → message “Your username and password has been created”
			*/
		
		String userName="";
		String password="";
		String confirm="";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		System.out.println("Please enter password");
		password=scan.nextLine();
		System.out.println("Please confirm,password");
		 confirm=scan.nextLine();
		 
		 if (!userName.isEmpty()&& !password.isEmpty()) {
			 if(password.length()>=8) {
				 if(!password.contains(userName)) {
					 if(password.contentEquals(confirm)) {
						 System.out.println("your username has been created");
					 }
					 else {
						 System.out.println("Password do  not match");
					 }
					 }else  {
						 System.out.println("Password can not contain username!");
					 }   
				 }else  {
						 System.out.println("Password is to short");
					 }
			 }else {
						 System.out.println("Username and password can not be empty");
					 }
					 System.out.println();
				 }
				 }
		 
		 
		 
