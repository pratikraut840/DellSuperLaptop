package Logical_program;

public class Prime_Number {

	public static void main(String[] args) {
		//eg 2,3,5,7,11,13....

		//4-->remainder 0 -->not prime
		
		//% --> remaimder     /--> qu
		
		int num=7; //2.....10--> non zero
		int count=0;
		for(int i=2;i<num;i++ )//2
		{
			if(num%i==0)// 10%2=0
			{
				count++;//1
				break;
			}
			
		}
		
		if(count==1)
		{
			System.out.println("Given number "+num+ " is Non_Prime");
		}
		
		else 
		{
			System.out.println("Given number "+num+ " is Prime");	
		}
		
		
	}

}
