package Javaprograms;

import java.util.Scanner;

public class Printtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan=new Scanner(System.in);
//		System.out.println("number of lines");
//		int lines=scan.nextInt();
//		int row,column=0;
		
//		for (row = 0; row < lines; row++) {
//			for (column = 0; column <= row; column++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//			
//		}
//	}
		Scanner scan=new Scanner(System.in);
	    System.out.println("number of lines");
	    int lines=scan.nextInt();
		int startingnumber=10;
		int row, column =0;
		
		for (row = 0; row < lines; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print(startingnumber+" ");
				startingnumber=startingnumber+1;
			}
			System.out.println();
			
		}

	}
}
