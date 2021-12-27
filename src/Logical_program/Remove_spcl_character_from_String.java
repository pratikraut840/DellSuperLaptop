package Logical_program;

public class Remove_spcl_character_from_String {

	public static void main(String[] args) {

	
		//Single type spcl character
		String s1="Mar%ket%";
		
		String s2 = s1.replace("%", "");
		
		System.out.println(s2);
		
		//Single type spcl character
		String s5="Maha$ra(sh)tra";
		
		String s6 = s5.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s6);
		
		
		
		String k1="&&Ind%i@@a";
		String k2 = k1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(k2);
		
	}

}
