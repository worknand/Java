package SDET2025;

public class TC15_PrintOddAndEvenArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		// extracting even numbers
		
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2== 0) {
				System.out.println(a[i]);
			}
		}
		
		
		// extracting odd numbers
		
				for(int i=0;i<a.length-1;i++) {
					if(a[i] % 2 != 0) {
						System.out.println(a[i]);
					}
				}
				
				
				// extracting even numbers
				// enhance for loop
				for(int temp:a) {
					if (temp % 2== 0) {
						System.out.println(temp);
					}
				}
				
				// extracting odd numbers
				// enhance for loop
				for(int temp:a) {
					if (temp % 2 != 0) {
						System.out.println(temp);
					}
				}
				

	}

}
