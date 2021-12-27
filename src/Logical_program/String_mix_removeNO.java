package Logical_program;

public class String_mix_removeNO {

	public static void main(String[] args) {

		String s="anu123rty23yh";

		String num="";
		String character="";
	
		character = s.replaceAll("[^a-z]","");
		System.out.println(character);
		
		num = s.replaceAll("[^0-9]","");
		System.out.println(num);
		
		
		
		
            
	}

}
