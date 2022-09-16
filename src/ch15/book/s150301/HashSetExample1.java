package ch15.book.s150301;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println("향상for");
		
		for(String elem : set) {
			System.out.println(elem);
		}
		
		System.out.println("forEach");
		set.forEach((e) -> System.out.println(e));
			
			set.remove("JDBC");
			set.remove("iBATIS");
			
			System.out.println("총 객체수: " + set.size());
			
			iterator = set.iterator();
			while(iterator.hasNext()) {
				String element = iterator.next();
				System.out.println("\t" + element);
			}
			
			set.clear();
			if(set.isEmpty()) {
				System.out.println("비어있음");
			}
	}
}
