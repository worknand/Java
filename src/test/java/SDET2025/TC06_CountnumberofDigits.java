package SDET2025;

public class TC06_CountnumberofDigits {

	public static void main(String[] args) {
		int num=123456;
		
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		
		System.out.println(count);
		


	}

}
