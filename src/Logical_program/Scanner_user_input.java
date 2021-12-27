package Logical_program;

import java.util.Scanner;

public class Scanner_user_input {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		// we use scanner for input
		
		
//		//1. for two number  ===============================
//				
//		System.out.println("Enter 1st no");
//		
//		int num1=sc.nextInt();
//		
//		System.out.println("Enter 2nd no");
//		
//		int num2=sc.nextInt();
//		
//		int sum = num1+num2;
//		
//		System.out.println("Addition is "+sum);
		
		//1. for two number =================================
		
		
		System.out.println("Enter first name");
		String s1 = sc.next();
		System.out.println("Enter last name");
		String s2 = sc.next();
		
		String FullName = "Your full name is "+s1+s2;
		System.out.println(FullName);

	}

}
