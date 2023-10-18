package Javaprograms;

public class Extractnumberfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nandakumar877";
		s=s.toLowerCase();
		int total=0;
		int len=s.length();
		for (int i = 0; i < len; i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch);
				total=total+Character.getNumericValue(ch);
				
				
			}
			
			
		}
		System.out.println(total);
			
		}

	}


