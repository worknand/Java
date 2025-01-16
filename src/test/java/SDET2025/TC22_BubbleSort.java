package SDET2025;


import java.util.Arrays;

public class TC22_BubbleSort {

	public static void main(String[] args) {
		
		
		int a[]= {20,4,5,24,62,78,13,68,59,24,35,74,85,15,26};
		System.out.println(Arrays.toString(a));
		
		//no of passes should be n-1 so for start from 0 soit should be 
		for(int i=0;i<a.length-1;i++) { // no of passess
			for(int j=0;j<a.length-1;j++)  // Iterations
			{
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
			}
		
		System.out.println(Arrays.toString(a));
		


	}

}
