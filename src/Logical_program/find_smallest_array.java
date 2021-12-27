package Logical_program;

import org.openqa.selenium.support.ui.WebDriverWait;

public class find_smallest_array {

	public static void main(String[] args) {

		
        int [] arr = new int [] {25, 11, 7, 75, 56};         
        int min = arr[0];  
       
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println(min);  
        
     

	}

}
