package SDET2025;

public class TC10_FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		
		int sum=0;
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0;i<=10;i++) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}

	}

}