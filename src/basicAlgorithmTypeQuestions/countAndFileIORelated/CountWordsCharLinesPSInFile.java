/**
 * Count the words, char, lines, paragraph, and Sentence in a file.  
 */
package basicAlgorithmTypeQuestions.countAndFileIORelated;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWordsCharLinesPSInFile{
	
	public static void main( String args[])throws IOException {
		
		int words =0;
		int para = 0;
		int sentnc= 0;
		int chrctrs = 0;
		int whiteSpaceCount=0;
		
		BufferedReader reader = new BufferedReader(new FileReader("inputWords.txt"));
		String line	;
		
		while((line= reader.readLine())!= null){
			
			if(line.equals("")){
				para++; // 1st
			}
			
			if(!(line.equals(""))){
				
				chrctrs += line.length();//2nd
				
				String[] wordsInLine = line.split("\\s+"); // space delimiter 
				
				words += wordsInLine.length; //3rd
				whiteSpaceCount += wordsInLine.length - 1;
				
				String[] sentenceList = line.split("!?.:");
				
				sentnc += sentenceList.length;		
			}
		}
		
		System.out.println( words + " words," + para + " para," + sentnc + " sentence," + chrctrs + " characters ," + whiteSpaceCount +" whitespaces" );
	
	}
}
