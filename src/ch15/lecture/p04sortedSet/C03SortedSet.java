package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C03SortedSet {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>((a,b)->a-b);
	}
}
