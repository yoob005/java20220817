package ch16.lecture.p02stream;

import java.util.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C06IntStream {
	public static void main(String[] args) {
		
		IntStream.generate(() ->1)
		.limit(11)
		.forEach((e)-> System.out.println(e));
		
		
		
	}
}
