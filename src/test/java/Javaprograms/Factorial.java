package Javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
	      int given=scan.nextInt();
		int fact=1;
		
		for (int i = 1; i <= given; i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
