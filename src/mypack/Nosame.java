package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Nosame {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		return samenono(arr);
	}
	public static int[] samenono(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length; i++) {
			if(i>=1) {
				if(arr[i]==arr[i-1]) {
					continue;
				}
			}
			list.add(arr[i]);
		}
		int[] answer = new int[list.size()];
		for(int i=0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		
		return answer;
	}
}
