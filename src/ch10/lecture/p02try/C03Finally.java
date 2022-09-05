package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 3;
			
			if (a == 1) {
				return;
			}
		} catch (ArithmeticException e) {
			System.out.println("exception!!!!");
		} finally { //무조건 실행된다.
			System.out.println("@@@@finally");
		}
		
		System.out.println("continue............");
	}
}
