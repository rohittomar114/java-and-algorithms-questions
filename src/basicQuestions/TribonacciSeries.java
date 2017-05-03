package basicQuestions;

import java.util.Scanner;

public class TribonacciSeries {
	
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till u want Tribonacci series: ");
        int n=sc.nextInt();
        
        sc.close();

        int a = 0,b = 0,c = 1;
        int d = a+b+c;

        System.out.println("\nTribonacci Series: ");
        System.out.print(a+"\t"+b+"\t"+c);

        for(int i=4;i<=n;i++)
        {
            System.out.print("\t"+d);
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }

        System.out.println();
    }

}
