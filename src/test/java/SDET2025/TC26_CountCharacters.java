package SDET2025;

public class TC26_CountCharacters {

	public static void main(String[] args) {
		
		
		String nameString="nandakumar";
		
		int len=nameString.length();
		
		String newString= nameString.replaceAll("a", "");
		int len1=newString.length();
		
		int diff=len-len1;
		
		System.out.println(diff);
	}

}
