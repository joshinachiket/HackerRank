package String;

public class Substrings {
	
	public static void findSubstringsIntArray (int [] nums) {
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				System.out.println(nums[i] + "" + nums[j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finding all continuous substrings of a given string
		int [] nums = {1,2,3,4,5,6};
		findSubstringsIntArray(nums);

	}

}
