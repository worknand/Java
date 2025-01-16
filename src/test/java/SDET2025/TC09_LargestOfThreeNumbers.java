package SDET2025;

import java.util.Scanner;

public class TC09_LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Enter the three numbers");
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		//approach1
//		if(a>b && a>c) {
//			System.out.println("largest number is A "+a);
//		}
//		else if (b>a && b>c) {
//			System.out.println("Largestnumber is B "+b);
//			
//		}
//		
//		else {
//			System.out.println("largest number is C "+c);
//		}
		
		//using ternary operator
		
		int largest1=a>b?a:b;  // largest of a and b
		
		int largest2=c>largest1?c:largest1;
		
		// in a single line
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println("largest number is "+largest2);
		
		System.out.println("largest number is "+largest);
		
		

	}

}
