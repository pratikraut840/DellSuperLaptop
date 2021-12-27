package Logical_program;

public class find_largest_array {

	public static void main(String[] args) {

		int[] arr=new int[] {55,89,98,74};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			
				max = arr[i];
			
		}
		System.out.println(max);

	}

}
