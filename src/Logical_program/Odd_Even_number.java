package Logical_program;

public class Odd_Even_number {

	public static void main(String[] args) {

		int num=12;
		
		System.out.println(num%2);  // this gives remainder
		System.out.println(num/2);  // this gives quotient
		
		if(num%2==0)
		{
			System.out.println("Given no is even");
		}
		else {
			System.out.println("Given no is odd");
		}

		
	}

}
