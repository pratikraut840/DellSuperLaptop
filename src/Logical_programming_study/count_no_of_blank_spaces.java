package Logical_programming_study;

public class count_no_of_blank_spaces {

	public static void main(String[] args) {
		String name= " i love my India ";
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++)
		{
			char blank=' ';
			
			if(blank==name.charAt(i))
			{
				count++;
			}
		}
		
          System.out.println("Total blank space are "+count);
	}

}
