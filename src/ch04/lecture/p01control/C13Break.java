package ch04.lecture.p01control;

public class C13Break {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(2);
			
			for(int j = 0; j < 5; j++) {
				System.out.println(3);
				if(true) {
					break;
				}
				System.out.println(4);
				
			}
			System.out.println(5);
		}
		
		
		
		System.out.println(6);
	}
}
