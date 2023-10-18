package Javaprograms;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int given= 0;
		System.out.println("Given number");
		Scanner scan=new Scanner(System.in);
		given= scan.nextInt();
		int rev= 0;
		
		
		while (given!=0) 
		 {
			 rev=rev*10;
			 rev =rev+given%10;
			 given=given/10; 
			 
		 }
		 System.out.println(rev);

	}

}
