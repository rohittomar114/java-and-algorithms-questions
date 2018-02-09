package basicQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPipedInputFile {
	
	private void printBuffered(String filePath) throws IOException{
		
         BufferedReader br = new BufferedReader(new FileReader(filePath));
		  // Most important step 
		  String str ;
		   // Another Most Important step to, Must write it in Exact way 
		  while((str= br.readLine())!= null ){ 
			
		  String[] string = str.split("\\|", 5);
			
		  System.out.println(string[0] + " "+ string[1]+ " "+ string[2]+ " "+ string[3] + " "+ string[4]);
			
		}
		
		
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReaderPipedInputFile bc = new BufferedReaderPipedInputFile();
		bc.printBuffered("input.txt");
		
	}

}
