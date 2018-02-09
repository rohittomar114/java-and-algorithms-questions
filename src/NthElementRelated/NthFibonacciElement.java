package NthElementRelated;

import java.util.Scanner;

public class NthFibonacciElement {
	static int a=-1, b=1, c=0;
	
	public static void main(String[] str){
		System.out.println("Enter the nth Value: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
	    fibonacciValue(n);
		System.out.println(c);
		
	}
	
	static void fibonacciValue(int n){
		if(n==0){
		 return;
		}
		c=a+b;
		a=b;
		b=c;
		fibonacciValue(n-1);// recursive
	}

}
