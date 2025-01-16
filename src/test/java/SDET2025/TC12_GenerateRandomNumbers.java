package SDET2025;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class TC12_GenerateRandomNumbers {

	public static void main(String[] args) {
		
		
		//Approach 1 -Random number class
		
		
//		Random random=new Random();
//		
//		int num=random.nextInt(20); // max limit is 1000 and range is o to 999
//		System.out.println(num);
//		
//		double dec=random.nextDouble(5);
//		System.out.println(dec);
		
		//Approach 2 Math class by default it generate decimal numbers
		
	       System.out.println(Math.random());
	       
	    // Approach 3 - Apcahe common -lang API
	       
	    String sNUMString=RandomStringUtils.randomNumeric(2); // generate based on digits
	    
	    System.out.println(sNUMString);
	    
	   String ranString= RandomStringUtils.randomAlphabetic(5);
	   
	   System.out.println(ranString);
	       
	       
		
		

	}

}
 	