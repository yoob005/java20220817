package ch04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
//		for(int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for(int n=1; n<=9; n++) {
////				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		}
		
		for(int a=2; a<10; a++) {
			System.out.println("-------------------");
			System.out.println("구구단 " + a + "단 출력");
			System.out.println();
			for(int b=1; b<10; b++) {
				System.out.println(a + "X"+ b + " = " + a*b);
			}
		}
	}
}
