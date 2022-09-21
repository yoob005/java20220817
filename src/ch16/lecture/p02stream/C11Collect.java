package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C11Collect {
	public static void main(String[] args) {
		//collect 메소드 : 종료연산
		//스트림에 있는 원소들을 지정된 컨테이너에 수집하는 일을 함.
		
		// param1 : 원소가 들어갈 컨테이너
		// param2 : 컨테이너에 원소를 넣는 일
		// param3 : 여러 컨테이너 병합(merge)
		
		
		List<Integer> list1 =  IntStream.range(1, 100)
			.filter(e -> e%2==0)
			.collect(() -> new ArrayList<>() ,
					(c,e) -> c.add(e) , 
					(c1,c2)-> c1.addAll(c2));		
		System.out.println(list1);
		
	}
	
}
