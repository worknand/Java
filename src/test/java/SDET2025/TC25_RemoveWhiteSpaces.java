package SDET2025;

public class TC25_RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str="    Java    Programming     Selenium     Automation     ";
		System.out.println(str);
		String string= str.replaceAll("\\s", "");
		System.out.println(string);
		

	}

}
