package basicQuestions;


import java.util.Arrays;

public class BinarySearch {
	
	
public static final int NOT_FOUND = -1;
	
	public static int search(int[] arr, int searchValue) {
		int left = 0;
		int right = arr.length - 1;
		return binarySearch(arr, searchValue, left, right);
	}
		
	private static int binarySearch(int[] arr, int searchValue, int left, int right) {
		if (right < left) {
			return NOT_FOUND;
		}
		/* 
		int mid = mid = (left + right) / 2;
		There is a bug in the above line;
		*/
		int mid = (left + right) >>> 1;
		if (searchValue > arr[mid]) {
			return binarySearch(arr, searchValue, mid + 1, right);
		} else if (searchValue < arr[mid]) {
			return binarySearch(arr, searchValue, left, mid - 1);
		} else {
			return mid;
		}		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 7, 9, 8};
		Arrays.sort(arr);
		System.out.println("Index after sorting array : "+ search(arr, 5));
	}

}
