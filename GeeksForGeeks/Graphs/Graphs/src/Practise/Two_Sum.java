package Practise;
import java.util.*;

public class Two_Sum {
	
	public static void twoSumNSquare (int [] nums, int target) {
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("one 11 : " + nums[i] + " two 22: " + nums[j]);
				}
			}
		}
	}
	
	public static void twoSumNLogN (int [] nums, int target) {
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length-1;
		
		while (start < end) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				System.out.println("one 1 : " + nums[start] + " two 2: " + nums[end]);
				start++;
				end--;
			} else if (sum > target) {
				end--;
			} else if (sum < target) {
				start ++;
			}
		}
	}
	
	public static void twoSumN (int [] nums, int target) {
		Map <Integer, Integer> map = new HashMap<>();
		
		// O(N) and O(N)
		for (int i=0;i<nums.length;i++) {
			if (map.containsKey(target - nums[i])) {
				System.out.println("one: " + nums[i] + " two: " + (target-nums[i]));
			} else {
				map.put(nums[i], i);
			}
		}
	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8};
		int target = 10;
		
		twoSumNSquare (nums, target);
		twoSumNLogN (nums, target);
		twoSumN (nums, target);
		
	}

}
