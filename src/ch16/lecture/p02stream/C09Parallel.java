package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		
		
		//병렬 스트림은 순서 보장xxx
		list1.parallelStream()
				.forEach((e)->System.out.println(e));
		list1.parallelStream()
			.forEachOrdered((e)->System.out.println(e)); // <--- 사용하면 순서 보장 ㅇㅇㅇㅇ
			
	}
}
