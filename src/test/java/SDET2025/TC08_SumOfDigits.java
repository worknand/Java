package SDET2025;


public class TC08_SumOfDigits {

	public static void main(String[] args) {
	
		int num=123456789;
		
		int sum=0;
		
		while(num>0) {
			int rem =num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum is "+sum);

	}

}
