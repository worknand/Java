package SDET2025;

import java.util.Arrays;
import java.util.Collections;

public class TC23_ArrayBuiltInMethods {

	public static void main(String[] args) {
		
		int a[]= {20,4,5,24,62,78,13,68,59,24,35,74,85,15,26};
		
		// Approach 1
//	System.out.println(Arrays.toString(a));	
//	
//	Arrays.parallelSort(a);
//	System.out.println(Arrays.toString(a));
	
	//Approach 2
	
//    System.out.println(Arrays.toString(a));	
//	
//	Arrays.sort(a);
//	System.out.println(Arrays.toString(a));
		
		//Approach 3 to sort in descending order
		
		System.out.println(Arrays.toString(a));
		
	//	Arrays.sort(a,Collections.reverseOrder()); // it wont support primitive data type
	// so modifying to non-primitive data type	
		Integer a1[]= {20,4,5,24,62,78,13,68,59,24,35,74,85,15,26};
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println(Arrays.toString(a1));
		
	}

}
