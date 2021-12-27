package Logical_program;

public class ArmStrong_Numer {
	
public static void main(String[] args) {
		
		//1--> //153-->1+125+27-->153, 407--> 64+0+343-->407// 
		
		int num=153;
		int num1=0;
			
		for(int i=num;i>0;i=i/10)// 153 15 1
		{
			System.out.println(i);
			//System.out.println(i%10);//3, 5, 1
			int rem=i%10;
			num1=num1+(rem*rem*rem);
			
		}

		if(num1==num)
		{
			System.out.println("Given number " +num+" is ArmStrong Number");
		}
		else {
			System.out.println("Given number " +num+" is not ArmStrong Number");
		}
	}

}


