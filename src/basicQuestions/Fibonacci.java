package basicQuestions;

// Program to print Fibonacci numbers
public class Fibonacci {

	public static void main(String arg[]){
		
		int totalNumbers = 10;

		findFibonacciNos(totalNumbers);
	}
	
	public static void findFibonacciNos(int n){
		int n1= 0;
		int n2= 1;
		
		// To print first two numbers
		 System.out.print(n1 + ", " + n2);
		
		for(int i= 2; i<n; i++){
			
			int n3 = n1 + n2;
			
			// To print series after first two numbers
			System.out.print(", " + n3);
			
			n1= n2;
			n2= n3;
					
		}		
	}
}
