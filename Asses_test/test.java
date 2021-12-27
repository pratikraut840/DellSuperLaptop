package Asses_test;

import Access_specifires.sample1;

public class test extends sample1
{

	public static void main(String[] args) {
		sample1 s1= new sample1();
		s1.display(); //only public is allowed
		              
		test t= new test();
		t.display2(); // by using inheritance with extends keyword
	}

}
