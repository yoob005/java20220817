package java20220817;

import java.util.*;
import java.util.stream.Collectors;

import com.sun.jdi.Value;

import ch11.book.s110302.Key;

public class test0101010 {
	public static void main(String[] args) {
		int[] arr = {5,9,7,10}; 
		int divisor = 5;
		int[] answer = {};
		ArrayList<Integer> integerArray2 = (ArrayList<Integer>) Arrays.stream(answer).boxed().collect(Collectors.toList());
		ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		for(int i : integerArray) {
			if(i%divisor==0) {
				integerArray2.add(i);
			}
		}
		int[] result =  integerArray2.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(result[0]);
		
	}
}
