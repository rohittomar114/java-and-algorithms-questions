package basicAlgorithmTypeQuestions.countAndFileIORelated;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountEachCharInString {
	
	static final int MAX_CHAR = 256;
	 
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "geeksforgeeks";
        getOccuringChar(str);
        System.out.println("\n ----Using Hash Map----");
        usingHashMap(str);
    }
    //    Using Hash Map
    static void usingHashMap(String str){
    	 Calendar cal = Calendar.getInstance();
         long startTime = cal.getTimeInMillis();
    	
    	int len = str.length();
    	HashMap<Character,Integer > hmap = new HashMap<>();
    	for (int i=0; i<len;i++){
    		if(hmap.get(str.charAt(i))== null){
    			hmap.put(str.charAt(i), 1);
    		}
    		else if(hmap.get(str.charAt(i))!= null){
    			//int value = hmap.get(str.charAt(i)) + 1;
    			hmap.put(str.charAt(i),hmap.get(str.charAt(i)) + 1);
    		}	
    	}
    	
    	for(Entry<Character, Integer> hm : hmap.entrySet()){
    		System.out.println(hm.getKey()+ " Occuers " + hm.getValue()+ " times");
    	}
    	
    	Calendar cal2 = Calendar.getInstance();
        long endTime = cal2.getTimeInMillis();
        long timeTaken = endTime - startTime;
        
        System.out.println("Using HashMap Time taken in millis = " + timeTaken);
    }
    
    
    // Without Using Hash Map
    static void getOccuringChar(String str)
    {   
    	Calendar cal = Calendar.getInstance();
        long startTime = cal.getTimeInMillis();
        
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++){
        	System.out.print(count[str.charAt(i)] + ",");
        	// increase the default values at index of char ASCII int code
            count[str.charAt(i)]++;
            
        }
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (str.charAt(i) == ch[j]) 
                    find++;                
            }
             // only print first time its found in ch[i]
            if (find == 1) 
                System.out.println("Number of Occurrence of " +
                 str.charAt(i) + " is:" + count[str.charAt(i)]);            
        }
        Calendar cal2 = Calendar.getInstance();
        long endTime = cal2.getTimeInMillis();
        long timeTaken = endTime- startTime;
        
        System.out.println("Time taken in millis =" + timeTaken);
    }
}
