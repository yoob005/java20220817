package java20220817;

import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = {"ab","bd","aaab","baa","badab"};
		
		Set<Character> set1 = new HashSet<>();
		for(int i=0; i < allowed.length(); i++) {
			set1.add(allowed.charAt(i));
		}
		
		int answer = 0;
		
		for(int i=0; i < words.length; i++) {
			int count = 0;
			Set<Character> set2 = new HashSet<>();
			for(int j=0; j < words[i].length(); j++) {
				set2.add(words[i].charAt(j));
				}
			Character[] arr = set2.toArray(new Character[0]);
			for(int k = 0; k < arr.length; k++) {
				if(!set1.add(arr[k])) {
					count++;
				}
			}
			if(count==2) {
				answer++;
			}
	}
		
		System.out.println(answer);
		
}
}	
 

