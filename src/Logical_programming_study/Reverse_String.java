package Logical_programming_study;

public class Reverse_String {
	public static void main(String[] args) {
		
		String s="RADAR";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
			
		}
		System.out.println("Reversr string is "+r);
		
		if(s.equals(r)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not Palindrome");
		}
	}

}
