package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Three_Sum {

	public static void threeSum (int [] nums, int target) {
		Arrays.sort(nums);
		// pivot first and iterate over others
		for (int i=0;i<nums.length-2;i++) {
			// assume no duplicates
			int one = nums[i];
			
			// two pointer from next element from this pivote
			int start = i+1;
			int end = nums.length-1;
			
			while (start < end) {
				int two = nums[start];
				int three = nums[end];
				
				int sum = one + two +three;
				if (sum == target) {
					System.out.println("one: " + one + " two: " + two + " three: " + three);
					start ++;
					end --;
				} else if (sum > target) {
					end --;
				} else if (sum < target) {
					start ++;
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8};
		int target = 6;
		
		threeSum (nums, target);
		
	}
}
