package Logical_program;

public class Factorial {

	public static void main(String[] args) {

		//factorial  9!= 9*8*7*6...*1
		
		int num=5;
		int fact=1;
		
		for(int i=num; i>=1; i-- )
		{
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
