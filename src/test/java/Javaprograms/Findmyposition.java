package Javaprograms;

import java.util.Scanner;

public class Findmyposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ascii 97->a minus from 96  , A->65 minus from 64(A=65-64=1)
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Character");
		char given =scan.next().charAt(0);
		 //given= Character.toLowerCase(given);
		 int ascii=given;
		// int position=ascii-96;
		 System.out.println(ascii);
	}

}
