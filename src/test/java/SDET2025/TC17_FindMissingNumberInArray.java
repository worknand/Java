package SDET2025;

public class TC17_FindMissingNumberInArray {

	public static void main(String[] args) {

       //Array should not have duplicates
		//Array no need to sorted order
		//values should in range

		int a[]= {1,2,3,4,5,7,8,9};
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<=9;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		for(int i=0;i<a.length;i++) {
			sum2=sum2+a[i];
		}
		System.out.println(sum2);
		
		int missingNumber=sum1-sum2;
		System.out.println(missingNumber);
	}

}
