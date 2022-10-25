package mypack;

import java.util.*;

public class smallWallet {
	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		
	}
	public static int wallet(int[][] sizes) {
		int max = Integer.MIN_VALUE;
		int min = 0;
		List<Integer> list = new ArrayList<>();
		for (int[] sizeArr : sizes) {
			for (int size : sizeArr) {
				list.add((Integer) size);
				if (size > max) {
					max = size;
				}
			}
		}
		Set<Integer> set = new HashSet<Integer>(list);
		List newList = new ArrayList<>(set);
		Collections.sort(newList);

		int cnt = 0;
		for (int i = 0; i < newList.size(); i++) {
			if(cnt==sizes.length) {
				break;
			} else {
				cnt = 0;
			}
			for (int[] sizeArr : sizes) {
				int num = (int) newList.get(i);
				int wmin = 0;
				int width = sizeArr[0];
				int height = sizeArr[1];
				if (height <= width) {
					wmin = height;
				} else if (height >= width) {
					wmin = width;
				}
				if (num>=wmin){
					cnt++;
				}

				if(cnt==sizes.length) {
					min = num;
					break;
				}
			}
			
		}
		int answer = max * min;
		
		return answer;
	}
}
