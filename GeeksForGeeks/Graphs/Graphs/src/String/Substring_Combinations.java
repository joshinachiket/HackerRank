package String;
import java.util.*;

public class Substring_Combinations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabccddffghij";
		int len = 3;

		List<String> answer = new ArrayList<String>();
	
		Set<String> opt = new HashSet<String>();


		for(int i=0; i<=str.length()-len; i++) {

			String sub = str.substring(i, i+len);
			Set<Character> set = new HashSet<Character>();
			boolean flag = false;
			for(char c: sub.toCharArray()) {
				if(set.contains(c)) {
					flag = true;
					break;
				}
				set.add(c);
			}

			if(flag)
				continue;

			opt.add(sub);
		}

		answer.addAll(opt);
		System.out.println(answer.size());
		System.out.println(answer);
}
}
