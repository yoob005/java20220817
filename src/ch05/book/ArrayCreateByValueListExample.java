package ch05.book;

import java.lang.reflect.Array;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores = {83 , 90 , 87};
		
		System.out.println("Scores[0] : " + scores[0]);
		System.out.println("Scores[1] : " + scores[1]);
		System.out.println("Scores[2] : " + scores[2]);
		
		int sum = 0;
//		int length = scores.length;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
