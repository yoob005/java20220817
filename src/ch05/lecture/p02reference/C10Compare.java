package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	public static void main(String[] args) {
		// 그림 : 05참조타입비교.png
		int a = 3;
		int b = 3;
		
		System.out.println(a==b); //true
		
		int[] c = new int[]{3, 4, 5};
		int[] d = new int[]{3, 4, 5};
		
		System.out.println(c==d); //false
		//content 비교 => true
		System.out.println(Arrays.equals(c,d));
		System.out.println(c[0]==d[0]);
		
		
		int[] e = c;
		e[0] = 33;
		System.out.println(c[0]);
	}
}
