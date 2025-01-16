package SDET2025;

import java.util.Arrays;

public class TC28_ReverseEachWordInString {

	public static void main(String[] args) {
		
//		String nameString="welcome to java";
//		String newString="";
//		int len=nameString.length();
//		
//		for(int i=len-1;i>=0;i--) {
//			
//			char c=nameString.charAt(i);
//			newString=newString+c;
//			
//		}
//		
//		System.out.println(newString);
		
		// word reverse
		String nameString="welcome to java";
		
	String[] strArrayStrings =	nameString.split(" ");
//	String[] strArrayStrings =	nameString.split("\\s "); //Another way
	System.out.println(Arrays.toString(strArrayStrings));
	
	String revString="";
	for(int i=0;i<strArrayStrings.length;i++) {
		
		char[] ch=strArrayStrings[i].toCharArray();
		
		String revWord="";
		for(int j=ch.length-1;j>=0;j--) {
			
			revWord=revWord+ch[j];
			System.out.println();
			
		}
		
		revString=revString+revWord+" ";
	}
	
	
	System.out.println(revString);
	
	// using stringBuilder
	String name="welcome to java";
	
	String[] strArray =	nameString.split("\\s");
	String reveString="";
	for(String s:strArray) {
		
		System.out.println(s);
		
		StringBuilder sBuilder=new StringBuilder(s);
	    sBuilder.reverse();
		
		reveString=reveString+sBuilder.toString()+" ";
	}
	
	System.out.println(reveString);
	
		
		

	}

}
