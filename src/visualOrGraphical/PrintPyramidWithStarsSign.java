package visualOrGraphical;

import java.util.*;
import java.lang.*;
public class PrintPyramidWithStarsSign {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter hieght of pyramid: ");
		int n = scan.nextInt();
		scan.close();
		pyramid(n);	
	}
	
	private static void pyramid(int n){
		int i = n-1;
		//row index in revere order
		
		while(i>=0){
			int j=0;
			while(j<n*2){
				if(j>=i && (i+j+1)< n*2){
					System.out.print("*" + " ");
					//Dont Use println
				}else{
					System.out.print(" " +" ");
					//Dont Use println && 2 spaces
				}
				j++;
			}
			System.out.println();
			i--;	
		}		
	}
}
