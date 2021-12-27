package Logical_programming_study;

import java.util.Scanner;

public class Odd_even_number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		
		int num = sc.nextInt();
		
		System.out.println(num%2); //gives Remainder value
		
		System.out.println(num/2);  //Gives division value
		
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
