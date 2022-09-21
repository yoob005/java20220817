package java20220817;

import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
		int num = 12345;
		String str = Integer.toString(num);
		String[] arr = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i, i+1);
		}
		Integer[] number = new Integer[str.length()];
		for(int i=0; i < str.length(); i++) {
			 number[i] = Integer.parseInt(arr[i]);
		}
		List<Integer> list = Arrays.asList(number);
//		int[] result = new int[number.length];
//		for(int i=0; i < number.length; i++) {
//			int max = Collections.max(list);
//			Stream<Integer> stream1 = list.stream();
//			Optional<Integer> option1 = stream1.max((a,b) -> a.compareTo(b));
			
//			result[i] = max;
//			list.remove(4);
//		}
		list.remove(list.indexOf(Collections.min(list)));
//		System.out.println(Integer.valueOf(Collections.min(list)));
		System.out.println(list);
	}
}
