package Logical_program;

public class Reverse_no_using_conversion {

	public static void main(String[] args) {

		int OrgNum=1234;
		
		//convert int to string
		String StrToNum= Integer.toString(OrgNum);
		
		String Rev = "";
		
		for(int i=StrToNum.length()-1; i>=0; i--)
		{
			Rev = Rev+StrToNum.charAt(i);
		}
		
		System.out.println(Rev);
		

	}

}
