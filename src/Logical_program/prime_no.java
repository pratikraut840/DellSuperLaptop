package Logical_program;

public class prime_no {
	
	public static void main(String[] args) {
		
		
		// /by == it gives quotient
		// %by == it gives remainder
		
		int num=7;
		int count=0;
		
		
		for(int i=2;i<num; i++) // if i divide by 2..10 --> non-zero
		{
			if(num%i == 0) //7%2=1 
			{
				count++;  //if count==0 then its non-prime
				break;
			}
		}
		
		if (count==1) 
		{
			System.out.println(" given no is not prime");
			
		}
		else {
			System.out.println(" given no is prime");

		}
		
		
	}

}
