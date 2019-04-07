package ScannerClass;

import java.util.Scanner;

public class practiceExe {

	public static void main(String[] args) {
		
		int loan;
		Scanner scanner=new Scanner(System.in);
		System.out.println("how much you want");
		loan=scanner.nextInt();
		System.out.println("loan");
		if (loan<200000) {
			System.out.println("I will geve you money" );
		}
		

	}

}
