package SDET2025;

public class TC01_Swapnumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println(a + "  and  " + b);

		
		  //logic1 - third variable 
//		  int t = a; a = b; b = t;
//		 
//		  System.out.println(a + "  and  " + b);
		 
		
		// logic 2
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a + "  and  " + b);
		
		//logic 3 -using / and * operators
		// here a and b values should not be zero
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		
//		System.out.println(a + "  and  " + b);
		
		
		// logic 4 - bitwise XOR (^) operator
		// need to convert a to decimal values for given integer
		//if a=0 b=0 aXORb=0
		//if a=0 b=1 aXORb=1
		//if a=1 b=0 aXORb=1
		//if a=1 b=1 aXORb=0
		
		                // decimal to binary for 10 is  01010
		                // decimal to binary for 200 is 10100
                // so a+b to add on binary using XOR is 11110 is 30 decimal  
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		
//		System.out.println(a + "  and  " + b);
		
		// logic 5 -single statement
		
		b=a+b-(a=b);
		
		System.out.println(a + "  and  " + b);
		
		
		
		
		
		

	}

}
