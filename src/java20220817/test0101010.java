package java20220817;

import java.util.*;
import java.util.stream.Collectors;

import com.sun.jdi.Value;

import ch11.book.s110302.Key;

public class test0101010 {
	public static void main(String[] args) {
		String s = "try hello world";
		
		String result = "";
		String add = "";
		int blankcount = 1;
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i+1).equals(" ")) {
				add+= (s.substring(i, i+1));
				blankcount++;
			}
//			여백갯수 홀수일때
			if(blankcount%2==1) {
				if((!s.substring(i, i+1).equals(" "))&&(i%2==1)) {
					add+= (s.substring(i, i+1)).toUpperCase();
				}
				
				if((!s.substring(i, i+1).equals(" "))&&(i%2==0)) {
					add+= s.substring(i, i+1);
				}
			}
//			여백 갯수 짝수 일 때 
			if(blankcount%2==0) {
				if((!s.substring(i, i+1).equals(" "))&&(i%2==0)) {
					add+= (s.substring(i, i+1)).toUpperCase();
				}
				
				if((!s.substring(i, i+1).equals(" "))&&(i%2==1)) {
					add+= s.substring(i, i+1);
				}
			}
			if(!s.substring(i, i+1).equals(" ")){
				blankcount = 0;
			}
			
		}
		
		System.out.println(add);
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
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	
		
	}
}
