package SDET2025;

public class TC05_ReverseString {

	public static void main(String[] args) {
	
		String string="MADAM";
		String copyString=string;
		System.out.println(copyString);
		String revString="";
		
		for(int i=string.length()-1;i>=0;i--) {
			char c=string.charAt(i);
			revString=revString+c;
			
		}
		
		System.out.println(revString);
		
		if(revString.equals(copyString)) {
			System.out.println("IT Is palindrome");
		}
		else {
			System.out.println("IT Is not palindrome");
		}

	}

}
