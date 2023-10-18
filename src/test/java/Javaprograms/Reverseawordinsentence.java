package Javaprograms;



import java.util.Set;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;

public class Reverseawordinsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I love India and India is my country";
		String rev="";
		String[] str=s.split(" ");
		
	
		
		for (String Starray : str) {
			System.out.println(Starray);
			
	}
		for(int i=str.length-1;i>=0;i--) {
			rev=rev+" "+str[i];
		}
		System.out.println(rev);
		

	}

}
