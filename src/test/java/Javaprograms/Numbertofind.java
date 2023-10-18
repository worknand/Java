package Javaprograms;

public class Numbertofind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,6,7,82,45,62,785,2,5,45,45};
		int len=a.length;
		System.out.println(len);
		int find=45;
		Boolean found=false;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==find) {
				found=true;
				//break;
			}
			   
			}
		if(found)
			System.out.println("yes number present");
		else
			System.out.println("No, number not present");
		
		}
		
		

	}


