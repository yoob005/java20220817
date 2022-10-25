package mypack;

import java.util.*;

public class twoNumberPlus {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		return;
	}
	
	public static int[] twoNum(int[] numbers) {
		List<Integer> numList = new ArrayList<>();
		for(int i=0; i < numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				numList.add(numbers[i]+numbers[j]);
			}
		}
		Set<Integer> numSet = new HashSet<Integer>(numList);
		List<Integer> list = new ArrayList<Integer>(numSet);
		Collections.sort(list);
		Integer[] arr = (Integer[]) list.toArray(new Integer[list.size()]);
		int[] answer = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			answer[i] = Integer.valueOf(arr[i]);
		}
		
		return answer;
	}
}
