package mypack;

import java.util.ArrayList;
import java.util.*;

public class supo {
	public static void main(String[] args) {
		int[] numbers = {1,3,2,4,2};
		int[] one = {1,2,3,4,5}; int[] two = {2,1,2,3,2,4,2,5}; int[] three = {3,3,1,1,2,2,4,4,5,5};
		
		for(int i = 0; i < numbers.length; i++) {
			
		}
		
		int oneCnt = 0; int twoCnt = 0; int threeCnt = 0;
		int size = 0; int max = 0;
		int num1 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==one[num1]) {
				oneCnt++;
			}
			num1++;
			if(num1==one.length) {
				num1 = 0;
			}
		}
		int num2 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==two[num2]) {
				twoCnt++;
			}
			num2++;
			if(num2==two.length) {
				num2 = 0;
			}
		}
		int num3 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==three[num3]) {
				threeCnt++;
			}
			num3++;
			if(num3==three.length) {
				num3 = 0;
			}
		}
		if(max<oneCnt) {
			max = oneCnt;
		} else if(max<twoCnt) {
			max = twoCnt;
		} else if(max<threeCnt) {
			max = threeCnt;
		}
		if(max==oneCnt) {
			size++;
		}
		if(max==twoCnt) {
			size++;
		} 
		if(max==threeCnt) {
			size++;
		}
		List<String> list = new ArrayList<>();
		if(max==oneCnt) {
			list.add("1");
		}
		if(max==twoCnt) {
			list.add("2");
		} 
		if(max==threeCnt) {
			list.add("3");
		}
		int[] answer = new int[size];
		for(int i=0; i < size; i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
		System.out.println(oneCnt + " 1카운트");
		System.out.println(twoCnt + " 2카운트");
		System.out.println(threeCnt + " 3카운트");
		System.out.println(list);
	}
	
	public static int[] sp(int[] numbers) {
		int[] one = {1,2,3,4,5}; int[] two = {2,1,2,3,2,4,2,5}; int[] three = {3,3,1,1,2,2,4,4,5,5};
		int oneCnt = 0; int twoCnt = 0; int threeCnt = 0;
		int size = 0; int max = Integer.MIN_VALUE;
		int num1 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==one[num1]) {
				oneCnt++;
			}
			if(num1==one.length-1) {
				num1 = 0;
			}
		}
		int num2 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==two[num2]) {
				oneCnt++;
			}
			if(num2==one.length-1) {
				num2 = 0;
			}
		}
		int num3 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]==three[num3]) {
				threeCnt++;
			}
			if(num3==three.length-1) {
				num3 = 0;
			}	
		}
		if(max<oneCnt) {
			max = oneCnt;
		}
		if(max<twoCnt) {
			max = twoCnt;
		}
		if(max<threeCnt) {
			max = threeCnt;
		}
		if(max==oneCnt) {
			size++;
		}
		if(max==twoCnt) {
			size++;
		} 
		if(max==threeCnt) {
			size++;
		}
		List<String> list = new ArrayList<>();
		if(max==oneCnt) {
			list.add("1");
		}
		if(max==twoCnt) {
			list.add("2");
		} 
		if(max==threeCnt) {
			list.add("3");
		}
		int[] answer = new int[size];
		for(int i=0; i < size; i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
		return answer;
	}
}
