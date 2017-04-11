package basicQuestions;


public class Palindrome {

    public static void main(String[] args) {

        String s="rotator";
        
        
        String reverse="";

        for(int i=s.length()-1;i>=0;i--) {
            reverse = reverse+s.charAt(i);
        }

        if(s.equalsIgnoreCase(reverse)) {  // case insensitive check

        	System.out.println(s+" is a palindrome");

        }else {

        	System.out.println(s+" is NOT a palindrome");
        }    
    }
    
}



