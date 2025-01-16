package SDET2025;

import java.util.Scanner;

public class TC02_ReverseANumber {

	public static void main(String[] args) {
		 
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int num=scanner.nextInt();  //1234
		
		//1.using algorithm
		
//		int rev=0;
//		int rem=0;
//		
//		while(num != 0) {
//			rem=num%10;
//			rev=rev*10 +rem;
//			num=num/10;
//		}
//		
//		System.out.println(rev);
		
		// 2.using string buffer class
		
//		StringBuffer revBuffer;
//		
//		StringBuffer sBuffer=new StringBuffer(String.valueOf(num));
//		revBuffer=sBuffer.reverse();
//		
//		System.out.println(revBuffer);
		
		//3.String builder
		
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append(num);
		StringBuilder reverBuilder= sBuilder.reverse();
		System.out.println(reverBuilder);
		

	}

}
