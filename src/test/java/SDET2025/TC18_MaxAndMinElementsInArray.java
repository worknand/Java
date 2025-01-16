package SDET2025;

public class TC18_MaxAndMinElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {20,4,5,24,62,78,13,68,59,24,35,74,85,15,26};
		
		int max=a[0];
		// maximum element
		for(int i=1;i<a.length;i++) {
			
			if(a[i] > max ) {
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		//minimum element
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]< min) {
			min=a[i];
			}
		}
		
		System.out.println(min);
		

	}

}
