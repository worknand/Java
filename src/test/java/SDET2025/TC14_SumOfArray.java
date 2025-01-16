package SDET2025;

public class TC14_SumOfArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8};
		
//		int len=a.length;
//		System.out.println(len);
		int sum=0;
//		for(int i=0;i<len;i++) {
//			sum=sum+a[i];
//		}

		
		
		// enhanced for loop
		for (int temp:a) {
			sum=sum+temp;
		}
		
		System.out.println(sum);
	}

}
