package SDET2025;

public class TC24_RemoveJunkAndSpecialCharacters {

	public static void main(String[] args) {
		
		String string="@$@%^%^Nanda@%^%@%^@Ku#^%^@mar@$@^*%^";
		System.out.println(string);
		//using regular expression
		String string2= string.replaceAll("[^(a-zA-Z0-9)]", "");
		
		System.out.println(string2);
		
		String string3="@$@%^%^Nanda@%^%@%616546523^@Ku#^%^@mar@$@^*%^5449941165";
		String string4= string3.replaceAll("[^(a-zA-Z0-9)]", "");
		System.out.println(string4);
	}

}
