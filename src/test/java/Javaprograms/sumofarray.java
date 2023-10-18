package Javaprograms;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,11,12,15,1,617,15,25,34,16,82,19,75,54};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}

		System.out.println(sum);
	}

}
