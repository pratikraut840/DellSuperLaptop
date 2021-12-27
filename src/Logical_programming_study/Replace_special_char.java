package Logical_programming_study;

public class Replace_special_char {

	public static void main(String[] args) {
		
		String s="v&e@l#%oci#ty@";
		
//		String rep1 = s.replace("@", "");
//		System.out.println(rep1);
		
		String s3 = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("Value is "+s3);
		
		String s4="Hello i am Khateeja ";
	    String r=s4.replaceAll(" ", "");
	    System.out.println("Given Value is "+r);

} 

}
