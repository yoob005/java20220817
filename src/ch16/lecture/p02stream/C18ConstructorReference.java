package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C18ConstructorReference {
	public static void main(String[] args) {
		String res = IntStream.of(9,7,1,0)
				.boxed()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		
		System.out.println(res);
	}
}
