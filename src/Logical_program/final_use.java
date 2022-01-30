package Logical_program;

public class final_use {
	
	int a=10;
	final int b=20;
	public void display() {
		a=a+100;
		System.out.println(a);
	}
     public final void display(int a,int b) {
    	 int c=a+b;
    	 System.out.println("sum is "+c);
    	 
     }
	public static void main(String[] args) {
		final_use f= new final_use();
		f.display();
		f.display(20, 50);
		
		
	}

}
