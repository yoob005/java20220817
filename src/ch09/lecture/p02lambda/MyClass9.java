package ch09.lecture.p02lambda;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class MyClass9 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		setAll(a1, i -> i);
		
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> i+1);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> i*2);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> (i+10)-(i*2));
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> 10-i);
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> (i+9)-(i*2));
		System.out.println(Arrays.toString(a1));
		
		setAll(a1, i -> 9-i);
		System.out.println(Arrays.toString(a1));
		
		
		int[] a2 = new int[6];
		setAll(a2, i -> (int)(Math.random()*46)-1);
		
		System.out.println(Arrays.toString(a2));
	}
	public static void setAll(int[]arr, IntUnaryOperator gen) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = gen.applyAsInt(i);
		}
	}
}
