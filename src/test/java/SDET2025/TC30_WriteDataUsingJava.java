package SDET2025;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TC30_WriteDataUsingJava {

	public static void main(String[] args) throws IOException {
		
		
        String locationString="sample.txt";
        String contentString="Hey Everybody!!";
        String contentString1="Hey Everybody!! Stop it";
		
//		FileWriter fWriter=new FileWriter(locationString);
//		fWriter.write(contentString);
//		fWriter.close();
		
		FileWriter fWriter1=new FileWriter(locationString);
		BufferedWriter bWriter=new BufferedWriter(fWriter1);
		bWriter.write(contentString1);
		bWriter.close();
		
	}

}
