package basicQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class CutTheSticks {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do want to print");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Please print the numbers");
		for(int i=0; i<n;i++){		
			arr[i]=scan.nextInt();
		}
		
		scan.close();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for( int i= 0; i< arr.length; i++){	
			list.add(arr[i]);
		}
		
		
		while(list.size()>0){
			
			int count = 0;		
			ListIterator<Integer> itr =list.listIterator();
			int currentMin = Collections.min(list);
			
			while(itr.hasNext()){
				
				int el = itr.next();
				count++;
				
				itr.set(el = el-currentMin);
				
				if(el<=0){
					itr.remove();
				} 
			}
			
			System.out.println(count);		
		}
		
	}
}
