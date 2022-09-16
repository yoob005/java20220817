package ch15.book.exercise.e09;
import java.util.*;
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			Integer val = map.get(key);
			totalScore += val;
			if(val>maxScore) {
				maxScore = val;
				name = key;
				}
			}
		int bal = totalScore/map.size();
		
		System.out.println("평균점수 : " + bal );
		System.out.println("최고점수 : " +  maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		}
	}

