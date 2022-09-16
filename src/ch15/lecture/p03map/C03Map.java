package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		//Map 만들기
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("seoul", "korea");
		map1.put("busan", "korea");
		map1.put("osaka", "japan");
		map1.put("newyork", "usa");
		System.out.println(map1);
		
		//of 메소드 사용 하면 수정 ㄴㄴㄴ
		
		Map<String, String> map2
		= Map.of("seoul","korea",
				"busan", "korea",
				"osaka","japan",
				"newyork", "us");
		
		System.out.println(map2);
		
		Map<String, Integer> map3 = Map.of(
				"a", 1,
				"b", 2,
				"c", 3,
				"d", 4);
		System.out.println(map3);
				
	
	}
}
