package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C03ArrayList {
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		
		arr1.add(3);
		
		arr1.get(0);
		
		Object o1 = arr1.get(0);
		if(o1 instanceof Integer) {
			int v1 = (Integer) o1;
		}
		
		int v1 = (int) arr1.get(0);
		
		System.out.println(v1);
	}
}
