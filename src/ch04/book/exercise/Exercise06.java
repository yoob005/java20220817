package ch04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		for(int i=1; i <6; i++) {
			for(int s = 1; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("중첩 for문 사용");
		
		for(int i=5; i > 0; i--) {
			for(int s = 1; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("01234");
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 1; j<6; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 5; j>0; j--) {
				System.out.print(j);				
			}
			System.out.println();
		}
		System.out.println("============================1");
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
		
		
		System.out.println("============================");
		
		for(int i = 0,j = 1; i > j; i++,j++) {
			System.out.print(i);
			System.out.println(j);
			

		}
			
	}
}
