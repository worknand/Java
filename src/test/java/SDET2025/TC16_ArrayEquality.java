package SDET2025;

import java.util.Arrays;

public class TC16_ArrayEquality {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,0,5,6,7,8,9};
		
		// direct approach
//		boolean status=Arrays.equals(a,b);
//		
//		if(status==true) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("not equal");
//		}
		
		// Approach 2
		boolean status =true;
	    int len1=a.length;
	    int len2=b.length;
	
	if(len1==len2) {
		//compare rest of array for each individual element
		
		for(int i=0;i<len1;i++) {
		if(a[i]!=b[i]) {
			
			status=false;
			System.out.println("Both arrays are not equal");
		}
		}
	}
	else {
		status=false;
		System.out.println("Both arrays are not equal length");
	}
	
	if(status==true) {
		System.out.println("Both arrays equal");
	}

	}
	

}
