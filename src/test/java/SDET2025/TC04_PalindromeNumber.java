package SDET2025;

public class TC04_PalindromeNumber {

	public static void main(String[] args) {
		
		int num=123215;
		int temp=num;
		System.out.println(num);
		System.out.println(temp);
		
		int rev=0;
		int rem=0;
		while(num !=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
		if(rev == temp) {
			System.out.println("IT Is palindrome");
		}
		else {
			System.out.println("IT Is not palindrome");
		}

	}

}
