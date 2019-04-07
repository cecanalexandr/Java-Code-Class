package groupwork;

public class Task3 {

	public static void main(String[] args) {
		//.How to find out the part of the string from a string? What is substring? Find number of words in string?
		String a="Today is Java Class";
		
		System.out.println(a.substring(9,13));
		
     String[] array=a.split(" ");
     System.out.println("The number of words string is "+array.length);

	}

}
