package ch04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		
		System.out.println("주사위 2개 던져서 5 나오게 하기");
		
		while(true){
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;

			if(a+b==5) {
				System.out.println("결과 : " + a + "," + b);
				System.out.println("Clear");
				break;
			}else {
				System.out.println("결과 : " + a + ","+ b);
				System.out.println("다시 던져보세요");
			}
			
		}
		
		
		System.out.println("do while==============================");
		
//		do {
//			int d1 = (int)(Math.random()*6)+1;
//			int d2 = (int)(Math.random()*6)+1;
//			
//			System.out.println("(" + d1 + "," + d2 + ")");
//		} while(d1 + d2 != 5);
	}
}
