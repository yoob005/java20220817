package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.*;

public class C02List {
	public static void main(String[] args) {
		//리스트 만드는 방법2
		
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("spring");
	
		System.out.println(list1);

		// 리스트 만드는 방법 2
		
		List<String> list2 = Arrays.asList("java", "css", "spring");
		System.out.println(list2);
		
		// 리스트 만드는 방법 3
		
		List<String> list3 = List.of("java", "css", "spring");
		System.out.println(list3);
		
		//주의 2,3번은 추가 add 불가
		list1.add("jsp"); //ok
//		list2.add("jsp"); xxx
//		list3.add("jsp"); xxxxx
		
		System.out.println(list1);
		
		//주의 3은 변경도 불가능
		
		list1.set(0, "jsp");
		list2.set(0, "jsp");
	//	list3.set(0, "jsp"); 불가능 xxxxxxx
			
	}
}
