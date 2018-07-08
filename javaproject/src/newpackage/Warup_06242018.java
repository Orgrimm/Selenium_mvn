package newpackage;

import java.util.Arrays;

public class Warup_06242018 {

	
		//Create an array if Integer
		public static int[] addElement(int[] originalArr, int newItem) {
			
		int[] newArr = new int[originalArr.length+ 1];
		for(int i =0; i < newArr.length; i++) {
		newArr[i] = originalArr[i];	
		newArr[newArr.length -1] = newItem;
		return newArr;
				
			
		}
		}
		
		
		public static void main(String[] args) {
		
		
		//Create an array int of 5 ;		
		//add 5 items
			
			int[] myArr = {1,3,5,6,7};
			myArr = addElemnt(myArr, 100);
			
			System.out.println(Arrays.toString(a));
			
		
		//call your AddElement method and add 2 more items
		//print out all the elements to the console
		
	
		/*
		 * Create a method called AddElement , 
		 *  take 2 parameters  
		 *    first : Integer array object 
		 *    second : Integer
		 *    
		 *    Logic 
		 *    return new Array with the new element added 
		 * 
		 * 
		 * */

	}

}
