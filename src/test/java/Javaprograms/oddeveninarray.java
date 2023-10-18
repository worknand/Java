package Javaprograms;

public class oddeveninarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,25,34,75,69,84,12,5,126,25,145,1258,25,24,1,5,37,19,25};
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0) {
				System.out.println("Even number is" +a[i]);
			}
			
			else
				System.out.println("odd number is "  +a[i]);
	
			
			
		
		}
	}
}


	


