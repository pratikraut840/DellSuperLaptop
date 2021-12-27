package Logical_program;


public class Reverse_String {

	public static void main(String [] args)
	{
	//	1. Reverse String
//		
//		String original="Velocity";
//		String reverse ="";
//		
//		for(int i=original.length()-1; i>=0; i--)
//		{
//			reverse=reverse+original.charAt(i);
//		}
//		
//		System.out.println(reverse);
		
		
		
//		1. Palindrome String
		
		String original="NAYAN";
		String reverse="";
		
		for(int i=original.length()-1; i>=0; i--)
		{
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		if (original.equals(reverse)) 
		{
			System.out.println("Given string is Palindrome ");
			
		} else 
		{
			System.out.println("Given string is not Palindrome ");
		}

		
		
		
		
		
	}

}
