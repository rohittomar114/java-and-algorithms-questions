package leetcode.dsa.questions.pattern.binarysearch;

public class MinimumIntegerInRotatedSortedArray {
		
	public int findMin(int[] nums) {

      // 1. ******* O(log n) approach *********************

        int li =0; 
        int hi = nums.length-1;

        while( li<hi){
       	
        	//Find mid element without going out of range of integers
            int mi = li + (hi-li)/2;

            if(nums[mi]>nums[mi+1] ){ // mid element value greater than mid+1 Index element value
                return nums[mi+1]; 
                
            }else if(nums[mi] > nums[hi]){  // element value at mid index greater than high Index element
                li=mi+1;
            }else{
                hi=mi;
            }
        }
        return nums[li];


      //  2. ********* O(n) approach *******************************
        /*
        int min = nums[0];
        for (int i=1; i <= nums.length -1 ; i++){

            if(nums[i-1] >= nums[i]){
                return nums[i];
            }     
        }
        return min;
       */
     
    }
}
