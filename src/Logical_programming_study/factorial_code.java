package Logical_programming_study;

public class factorial_code {

	public static void main(String[] args) {
		
		//5!=5*4*3*2*1=answer
		
		int num=5;
		int fact=1;
//		
//		for(int i=num;i>=1;i--) {
//			
//			fact=fact*i;
//		}
//            System.out.println("factorial is "+fact);
	for(int j=1;j<=num;j++) {
		fact=fact*j;
	}
	System.out.println("factorial is "+fact);
	
	
	
	}

}
