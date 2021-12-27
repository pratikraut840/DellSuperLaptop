package Logical_programming_study;

public class count_alpha_A {

	public static void main(String[] args) {
  String alpha="Amol,Ankush,Amar,Akshay,Amar,Ashish,Ajay";
		int count=0;
		for(int i=0;i<=alpha.length()-1;i++)
		{
			char letter='A';
			if(letter==alpha.charAt(i))
			{
				count++;
			}
		}
         System.out.println("Total number of A letter are "+count);
	

}}
