package ch05.book.example;

public class Exercise07Foreach {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		
		for(int i : array) {			
			
			if(i > max) {
				max = i;
			}
			
		}
		
		// 가장 작은 값 구하기
				int min = Integer.MAX_VALUE;
				
				for (int i : array) {
					if (min > i) {
						min = i;
					}
				}
		
		
		
		System.out.println("max: " + max);
		System.out.println("min:" + min); // 1
	}
}
