package SDET2025;



import java.util.Arrays;
import java.util.Scanner;

public class TC21_BinarySearch {

	public static void main(String[] args) {
		
		// to perform binary search array should be in sorted order
		int a[]= {20,4,5,24,62,78,13,68,59,24,35,74,85,15,26};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		/*		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number to Search");
		int key=scanner.nextInt();
		
		int l=0;
		
		int h=a.length-1;
		boolean flag=false;
		while(l<=h) {
			int m=(l+h)/2;
			
			if(a[m]==key) {
				System.out.println("Element found "+a[m]);
				flag=true;
				break;
			}
			
			if(a[m] < key) {
				
				l=m+1;
			}
			if(a[m] > key) {
				h=m-1;
			}
		}
		
		if(flag==false) {
			System.out.println("Element not found ");
		}
		*/
		
		// approach 2 direct binary search method
		// return position of found element
		// if element not found then it returns random negative value
		
		int positionOfNumber=Arrays.binarySearch(a, 41);
	    System.out.println(positionOfNumber);	

	}

}
