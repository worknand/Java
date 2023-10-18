package Javaprograms;

public class Stringstrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="     NANDAKUMAR     ";
		System.out.println(s);
		//String st=s.strip();
		//String st=s.stripLeading();
		//String st=s.stripTrailing();
		//String st=s.trim();
		
		System.out.println(s.replaceAll("^[ \t]+ |[ \t]$", ""));
		System.out.println(s.replaceAll("[ \t]$",""));
		System.out.println(s.replaceAll("^[ \t]",""));
		

	}

}
