package com.class21;

public class Student {
String studentNames;
static int numberOFStudennts;
int studentID;

/*2.  Create a Class called Students
 * Create three  variables  studentNames,studentID  and  numberOfStudents
 * Create three objects of the Students Class
 * Set the value for  studentName ,studentID and increment  the numberOfStudents for each objectPrint out  total number of students
 */

	



	public static void main(String[] args) {
		Student obj1=new Student();
		Student obj2=new Student();
		Student obj3=new Student();

		obj1.studentNames="Alex";
		obj1.studentID++;
		System.out.println(numberOFStudennts++ +" "+obj1.studentNames+" "+obj1.studentID++ +"");
		
		obj2.studentNames="Alin";
	    obj2.studentID++;
		System.out.println(numberOFStudennts++ +" "+obj2.studentNames+" "+obj2.studentID++ +"");
		
		obj3.studentNames="Obama";
		 obj3.studentID++;
		System.out.println(numberOFStudennts++ +" "+obj3.studentNames+" "+obj3.studentID++ +"");
		
		System.out.println("Total number of students " +numberOFStudennts++);

	
		
		
		
	}

}
