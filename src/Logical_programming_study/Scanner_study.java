package Logical_programming_study;

import java.util.Scanner;

public class Scanner_study {
	public static void main(String[] args) {
		//Scanner Study by Creating object of Scanner class
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
		String name = sc.next();
		System.out.println("Enter last name");
		String lastname = sc.next();
		
		System.out.println("Your name is "+name+" "+lastname);
		String s1 = name+lastname;
		System.out.println(s1);
	
		
//		System.out.println("Enter first number");
//		int num1 = sc.nextInt();
//		System.out.println("Enter second number");
//		int num2 = sc.nextInt();
//		
//		int sum=num1+num2;
//		System.out.println("Sum is "+sum);
//		System.out.println("Enter height");
//		double height = sc.nextDouble();
//		System.out.println("Enter weight");
//		double weight = sc.nextDouble();
//		System.out.println("Height and Weight is "+height+" & "+weight);
		
	}
	
	


}
