package SDET2025;

import java.util.Scanner;

public class TC11_PrimeNumber {

	public static void main(String[] args) {
		
		
		// Natural number > 1
		// which has only two factors 1 and itself
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		int count=0;
		
		if(num > 1) {
			
			for(int i=1;i<=num;i++) {
				
				if (num%i== 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("It is prime number " +count);
			}
			else {
				System.out.println("It is not a prime number " +count);
			}
			
		}
		else {
			System.out.println("Its not a prime number ");
		}
		

		
		
	}

}
