package mypack;

import java.util.Arrays;

public class Knumber {
	public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,7,4};
		int[][] com = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = new int[com.length];
		for(int i = 0; i < com.length; i++) {
			int one = (com[i][0])-1;
			int two = (com[i][1])-1;
			int three = (com[i][2])-1;
			int sum = two-one;
			if(sum<0) {
				sum = -sum;
			}
			int[] newArr = new int[sum+1];
			if(sum==0) {
				newArr[0] = arr[one];
			}else {
				
				for(int j = 0; j < sum+1; j++) {
					newArr[j] = arr[one];
					one++;
				}
			}
			Arrays.sort(newArr);
			result[i] = newArr[three];
		}
		System.out.print(result[0]);
		System.out.print(result[1]);
		System.out.print(result[2]);
	}
	
	public static int[] knum(int[] arr , int[][] com) {
		int[] result = new int[com.length];
		
		for(int i = 0; i < com.length; i++) {
			int one = com[i][0];
			int two = com[i][1];
			int three = com[i][2];
			int sum = two-one;
			if(sum<0) {
				sum = -sum;
			}
			int[] newArr = new int[sum];
			
			for(int j = 0; j <= three; j++) {
				newArr[j] = arr[one];
				one++;
			}
			Arrays.sort(newArr);
			result[i] = newArr[three];
		}
		return result;
	}
}
