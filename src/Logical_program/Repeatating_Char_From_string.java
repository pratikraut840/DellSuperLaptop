package Logical_program;

import java.util.HashMap;
import java.util.Set;

public class Repeatating_Char_From_string {
	
	public static void main(String[] args) {
		 String s="abcdabcdde";
		 
		 HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		 
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 char Charvalue=s.charAt(i);//a, b,c,d
			 
			 if(hm.containsKey(Charvalue))//a--->a
			 {
				 hm.put(Charvalue, hm.get(Charvalue)+1);
			 }
			 
			 else
			 {
				 hm.put(Charvalue, 1);
			 }
			 
		 }
		 
		 
		 Set<Character> keys= hm.keySet();
		 for(Character key:keys)
		 {
			 System.out.println(key+" : "+hm.get(key));
		 }
	}
	


}
