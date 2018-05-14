package basicQuestions;


public class Palindrome {

    public static void main(String[] args) {

        String s="rotator";
        
        String str= palindrome(s);
        System.out.println(str);
        
       /* String reverse="";

        for(int i=s.length()-1;i>=0;i--) {
            reverse = reverse+s.charAt(i);
        }

        if(s.equalsIgnoreCase(reverse)) {  // case insensitive check

        	System.out.println(s+" is a palindrome");

        }else {

        	System.out.println(s+" is NOT a palindrome");
        }  */  
    }
    
    private static String palindrome(String str){
    	
    	String result=" String is Palindrome";
    	int j= str.length()-1;
    	
    	for(int i = 0; i<j; i++){
    		
    		if(str.charAt(i)== str.charAt(j)){
    			j--;	
    		}else{
    			result=" String is Not Palindrome";
    			break;
    		}	
    	} 	
    	return result;	
    }
    
}



