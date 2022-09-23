package java20220817;

import java.util.*;
import java.util.stream.Collectors;

import com.sun.jdi.Value;

import ch11.book.s110302.Key;

public class test0101010 {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		arr(arr1, arr2);

	}

	public static boolean charAscii(String str) {

		if ((str.length() != 4 || str.length() != 6)) {
			return false;
		} //

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 60) {
				return false;
			}
		}
		return true;
	}

	public static int Solu(int left, int right) {

		int answer = 0;

		for (int i = left; i <= right; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt % 2 == 0) {
				answer += i;
			}
			if (cnt % 2 == 1) {
				answer -= i;
			}
		}
		return answer;
	}
	
	public static int[][] arr(int[][] arr1, int[][] arr2){
		int[][] answer = {};
		
		return answer;
		
		
	}
}
