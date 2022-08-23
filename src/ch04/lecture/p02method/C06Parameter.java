package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		
		sum(1,10); // 1~10 사이의 정수 합 출력
		sum(1,100);
		sum(50,200);
	}
	
	public static void sum(int a, int b) {
		
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "~" +  b +" 사이의 정수 합 출력 = " + sum);
	}
}
