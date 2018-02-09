package stringBasedAlgorithms;

public class ReverseSentenceWithoutAPI {
	
	static StringBuffer s = new StringBuffer(" This     is the String");
	
	public static void main(String[] str){	
		int i=0,j=0,w=0;
		while(i<s.length()){
			if(i==0){
				w=0;
			}
			if(i== s.length()-1 || s.charAt(i)==' '){
				j=i;
				if(i==s.length()-1){
					j=i;
				}else{
					j--;
				}
				swap(w,j);
				w=i+1;
			}
			i++;
		}
		swap(0,s.length()-1);
		System.out.println("Final  : "+ s);
	}
	
	public static void swap(int i , int j){
		while(i<j){
			char ch = s.charAt(i);
			s.setCharAt(i,s.charAt(j));
			s.setCharAt(j, ch);
			i++;
			j--;
		}	
	}
}
