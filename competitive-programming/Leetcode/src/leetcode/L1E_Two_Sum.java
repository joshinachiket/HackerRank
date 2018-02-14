package leetcode;

import java.util.HashMap;

public class L1E_Two_Sum {
	
	public static int[] twoSum (int [] nums, int target) {
		
		int result[] = new int [2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0;i<nums.length;i++) {
			
			if (map.containsKey(target - nums[i])) {
				
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				
				return result;
				
			} else {
				map.put(nums[i], i);
			}
			
		}
				
		return result;	
	}
	
	public static void main(String[] args) {
		int [] nums = new int [] {2, 3, 5, 6, 8, 9, 11, 13, 15, 30};
		int target = 32;
		int [] result = new int [2];
		
		result = twoSum(nums, target);
		
		System.out.println(result[0] + " " + result[1]);
		
	}

}
