package Javaprograms;

public class UppercaseLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="nandakumar ";
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		System.out.println(s);
		//System.out.println(upper);
		//System.out.println(lower);
		
		char[] ch=s.toCharArray();
		System.out.println(ch);
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97 && ch[i]<=122) {
				ch[i]=(char) (ch[i]-32);
			}
		}
		System.out.println(ch);

	}

}
