package Logical_program;

import java.util.Arrays;

public class Compare_two_arrays {

	public static void main(String[] args) {

		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		int arr3[]= {1,2,3};
		
		System.out.println("Result of arr1[] & arr2[] "+Arrays.equals(arr1, arr2));
		System.out.println("Result of arr1[] & arr3[] " +Arrays.equals(arr1, arr3));


		
	}

}
