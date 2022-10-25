package mypack;

import java.util.Arrays;

public class cash {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int result = 0;
		int x = 0;
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			x+= d[i];
			if(x > budget) {
				return result;
			}
			result++;
		}
		
	}
	
	public static int budgett(int[] d, int budget ) {
		int x = 0;
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			x+= d[i];
			if(x > budget) {
				return result;
			}
			result++;
		}
		 
	}
}
