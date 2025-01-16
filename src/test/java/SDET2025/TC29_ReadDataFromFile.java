package SDET2025;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TC29_ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		
		// Approach 1
		String locationString="sample.txt";
		
		FileReader fReader=new FileReader(locationString);
		BufferedReader bReader=new BufferedReader(fReader);
		
		String curreString;
		
		while((curreString= bReader.readLine()) != null ) {
			System.out.println(curreString);
		}
		
		bReader.close();
		fReader.close();
		
		
		// Approach 2
		
		File file=new File(locationString);
		
		Scanner scanner=new Scanner(file);
		
		//loop
		while(scanner.hasNextLine()) { // has next line is true or false conditional method
			System.out.println(scanner.nextLine());
		}
		
		// Approach 3 without using loop
		
         File file1=new File(locationString);
		
		Scanner scanner1=new Scanner(file1);
		
		scanner1.useDelimiter("\\z");
		System.out.println(scanner1.nextLine());
		
		
	}

}
