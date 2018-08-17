package Practise;
import java.util.*;

public class Nth_Largest {
	public static int findSecondHighest (int [] nums) {
		int first = Integer.MIN_VALUE;
		int second = first;
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i] > first) {
				second = first;
				first = nums[i];
				System.out.println("first: " + first + " second: " + second);
			} else if (nums[i] > second) {
				second = nums[i];
			}
		}
		
		return second;
	}
	
	public static int findThirdHighest (int [] nums) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i] > first) {
				third = second;
				second = first;
				first = nums[i];
			} else if (nums[i] > second) {
				third = second;
				second = nums[i];
			} else if (nums[i] > third) {
				third = nums[i];
			}
			System.out.println("first: " + first + " second: " + second + " third " + third);
		}
		
		return third;
	}
	
	public static int findKthHighest (int [] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i=0;i<nums.length;i++) {
			pq.offer(nums[i]);
			
			if (pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
	
	public static void main(String[] args) {
		int [] nums = {11,16,12,14,10,20};
		int k = 5;
		System.out.println("second highest is: " + findSecondHighest(nums));
		System.out.println("second highest is: " + findThirdHighest(nums));
		System.out.println("kth highest is: " + findKthHighest(nums, k));

	}
}
