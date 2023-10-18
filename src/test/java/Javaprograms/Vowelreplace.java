package Javaprograms;

public class Vowelreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nandakumar";
		s.toLowerCase();
		int vow=0;
	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]== 'a' ||ch[i]== 'e' ||ch[i]== 'i' || ch[i]== 'o' || ch[i]== 'u') {
			ch[i]='*';
			vow++;
		}
		
	}
	System.out.println(ch);
	System.out.println(vow);
	
	//withmethod
	String str=s.replaceAll("[AEIOUaeiou]", "\\$");
	System.out.println(str);
		

	}

}
