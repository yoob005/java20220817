package ch04.book.exercise;

public class NewExercise {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= 4; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 0; i < 5; i++) {
			for(int j=1; j <=5; j++) {
				System.out.print(j);
			}
			System.out.println();	
		}
		
		System.out.println("====================");
		
		for(int i = 0; i <5; i++) {
			for(int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 0; i <5; i++) {
			for(int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		int k = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <=i; j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		for(int i=5; i > 0; i--) {
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 5; i >0; i--) {
			for(int j = 5; j>i; j-- ) {
				System.out.print(" ");
			}
			for(int s = 0; s < i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
