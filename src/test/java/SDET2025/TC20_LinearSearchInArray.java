package SDET2025;

public class TC20_LinearSearchInArray {

	public static void main(String[] args) {
		
		
		int a[]= {20,4,5,24,62,78,13,68,59,24,35,74,85,15,26};
		
		int key=36;
		boolean status=false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("Element Found "+a[i]);
				status=true;
				break;
			}
		}
		if(status == false) {
			System.out.println("Element not Found");
		}

	}

}
