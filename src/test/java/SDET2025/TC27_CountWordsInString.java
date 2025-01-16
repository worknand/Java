package SDET2025;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.s;

public class TC27_CountWordsInString {

	public static void main(String[] args) {

     String nameString="kashmir beatiful kashmir kashmir wonderful kashmir";
     
    String[] strArray= nameString.split(" ");
    
    System.out.println(Arrays.toString(strArray));
    
   int len= strArray.length;
   
   System.out.println(len);
   
   //Approach2
   String nameString1="kashmir beatiful kashmir kashmir wonderful kashmir";
   
   int count=1;
   
   for(int i=0;i<nameString1.length()-1;i++) {
	   
	   if((nameString1.charAt(i) == ' ') && (nameString1.charAt(i+1) != ' ')) {
		   
		   count++;
	   }
   }
   
   System.out.println(count);
   

	}

}
