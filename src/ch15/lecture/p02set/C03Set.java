package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		//Set 만들기
		Set<String> set1 = new HashSet<String>();
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		
		set1.remove("gooses");
		
		System.out.println(set1);
		
		//수정 불가능한 set
		
		Set<String> set2 = Set.of("thor", "hulk", "batman" );
		
		System.out.println(set2.contains("thor"));
		
		System.out.println(set2);
	}
}
