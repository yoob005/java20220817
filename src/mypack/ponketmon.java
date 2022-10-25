package mypack;

import java.util.Arrays;
import java.util.*;

public class ponketmon {
	public static void main(String[] args) {
		int[] nums= {3,3,3,2,2,4};
		
	}
	
	public static int ponket(int[] nums) {
		Integer[] pokets = new Integer[nums.length];
		for(int i=0; i<nums.length; i++) {
			pokets[i] = nums[i];
		}
		int size = nums.length/2;
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(pokets));
		int answer = 0;
		if(set.size()>=size) {
			answer = size;
		} else {
			answer = set.size();
		}
		
		return answer;
	}
}
