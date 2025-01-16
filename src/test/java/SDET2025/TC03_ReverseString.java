package SDET2025;

public class TC03_ReverseString {

	public static void main(String[] args) {
		
		//1.using string concatenation operator
		
		String string="nandakumar";
//		System.out.println(string.length());
//		int len=string.length();
//		
//		String revString="";
//		
//		for(int i=len-1;i>=0;i--) {
//			char c=string.charAt(i);
//			revString=revString+c;
//		}
//		
//		System.out.println(revString);
		
		//2.using chararray
		
	  char[] ch=	string.toCharArray();
	  String reverseString="";
	  for(int i=ch.length-1;i>=0;i--) {
		  reverseString=reverseString+ch[i];
	  }
	  System.out.println(reverseString);
	  
	  //3.string buffer
	  
	  StringBuffer sBuffer=new StringBuffer("NandaKumar");
	  System.out.println(sBuffer.reverse());
		
		
		

	}

}
