package Logical_programming_study;

public class Reverse_num_swap {

	public static void main(String[] args) {
		
		int a=12345;
		//used integer class and with method toString
		String s1=Integer.toString(a);
		String r="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			r=r+s1.charAt(i);
			
		}
            System.out.println("Reverse is "+r);
            
	     int value = Integer.parseInt(r);
	     System.out.println("Reverse is "+value);
	
	
	}

}
