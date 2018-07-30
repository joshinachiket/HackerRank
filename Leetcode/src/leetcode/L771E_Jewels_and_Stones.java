package leetcode;

import java.util.HashMap;
import java.util.Set;

public class L771E_Jewels_and_Stones {
	
	public static int numOfJewels (String j, String s) {
		
		// declare a frequency hashmap
		HashMap <Character, Integer> hashMap = new HashMap <Character, Integer>();
		// convert the string into char array
		char [] ch = s.toCharArray();
		
		// loop that generates the frequency map
		for (int i=0;i<ch.length;i++) {
			if (hashMap.containsKey(ch[i])) {
				hashMap.put(ch[i], hashMap.get(ch[i]) + 1);
			} else {
				hashMap.put(ch[i], 1);
			}			
		}
		
		// display frequenct map
		Set <Character> hashSet = hashMap.keySet();
		
		for (Character key : hashSet) {
			System.out.println(key + " " + hashMap.get(key));
		}
		
		
		// find the occurances of each char from second string in first map and sum		
		int answer = 0;
		char [] ch1 = j.toCharArray();
		
		for (int i=0;i<ch1.length;i++) {
			if (hashMap.containsKey(ch1[i])) {
				answer += hashMap.get(ch1[i]);
			} else {
				answer += 0;
			}
		}				
		return answer;		
	}
	
	public static void main(String[] args) {
		// put your J and S string here
		String J = "z";
		String S = "ZZz";
		
		System.out.println(numOfJewels(J, S));
	}

}
