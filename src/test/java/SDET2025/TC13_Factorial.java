package SDET2025;

import java.util.Iterator;
import java.util.Scanner;

public class TC13_Factorial {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scanner.nextInt();
		long fact=1;
		
//		for(int i=1;i<=num;i++) {
//			
//			fact=fact*i;
//	
//		}
		
		//reverse way
		 for(int i=num;i>=1;i--) {
			 fact=fact*i; 
		 }
		 
		
		System.out.println(fact);

	}

}
