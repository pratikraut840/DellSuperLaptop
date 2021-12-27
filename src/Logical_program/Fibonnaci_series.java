package Logical_program;

public class Fibonnaci_series {

	public static void main(String[] args) {

		int n=15;
		int a=0;
		int b=1;
		
		System.out.println("for first "+n+" terms ");
		
		
		for(int i=0; i<=n; i++)
		{
			
			int c=a+b;
			a=b;
			b=c;
			
			System.out.println(a);
			
		}

	}

}
