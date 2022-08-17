package java20220817;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");

		// 구구단 2~9단 출력
		for (int a = 2; a < 10; a++) {
			System.out.println();
			System.out.println("구구단" + a + "단");

			for (int i = 1; i < 10; i++) {
				System.out.println(a + " x " + i + " = " + a * i);

			}
		}
		
		
		// 1~100 짝수의 합만 구하기
		
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			if(i%2==0) {
				sum = sum+i; 
			}
		}
		System.out.println(sum);
	
	}
}
