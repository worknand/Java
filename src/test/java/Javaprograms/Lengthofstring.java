package Javaprograms;

public class Lengthofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="NANDAKUMAR";
		System.out.println( str.length());
		char[] ch=str.toCharArray();
		int length=0;
		//System.out.println(ch.length);
		for(Character c:ch) {
			length++;
		}
		System.out.println(length);

	}

}
