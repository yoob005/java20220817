package ch05.book.example;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		
		for(int i = 0; i < array.length; i++) {			
			
			if(array[i] > max) {
				max = array[i];
			}
			
		}
		
		// 가장 작은 값 구하기
				int min = Integer.MAX_VALUE;
				
				for (int i = 0; i < array.length; i++) {
					if (min > array[i]) {
						min = array[i];
					}
				}
		
		
		
		System.out.println("max: " + max);
		System.out.println("min:" + min); // 1
	}
}
