package ch15.book.s150201;

import java.util.*;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name: list1) {
			System.out.println(name);
		}
		
		System.out.println("일반for");
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("forEach");
		list1.forEach((e)-> System.out.println(e));
		
		System.out.println("Iterator 사용");
		Iterator<String> Iterator = list1.iterator();
		while(Iterator.hasNext()) {
			System.out.println(Iterator.next());
		}
		
		System.out.println();
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
