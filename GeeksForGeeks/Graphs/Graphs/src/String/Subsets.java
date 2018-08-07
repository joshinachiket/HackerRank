package String;
import java.util.*;

public class Subsets {
	
	public static void findSubsets (int [] nums, List<List<Integer>> result) {
		List<Integer> list = new ArrayList<>();
		backtrack(nums, result, list, 0);
	}
	
	public static void backtrack (int [] nums, List<List<Integer>> result, List<Integer> list, int start) {
		result.add(new ArrayList<> (list));
		System.out.print("list is : ");
		for  (Integer row : list) System.out.print(row + " ");
		System.out.println("\n");

		for (int i=start;i<nums.length;i++) {
			System.out.println("i=" + i + " thus " + nums[i] + " added ");
			list.add(nums[i]);
			backtrack (nums, result, list, i+1);
			System.out.println("for loop is from : " + start + " to: " + nums.length);
			System.out.println(list.get(list.size()-1) + " removed");
			list.remove(list.size()-1);
		}
	}
	
	public static void display (List<List<Integer>> result) {
		for (List<Integer> row : result) {
			for (Integer num : row) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		List<List<Integer>> result = new ArrayList<>();
		findSubsets (nums, result);
		// display(result);
	}
}
