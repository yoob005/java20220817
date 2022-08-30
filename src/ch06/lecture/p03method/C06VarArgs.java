package ch06.lecture.p03method;

public class C06VarArgs {
	public static void main(String[] args) {
		method1();
		
		method1(3);
		
		method1(1, 4);
	}

	 static void method1() {
		
		
	}
	 
	static void method1(int a) {
		System.out.println("인트 파라미터 하나");
	}
	
	//가변인자 (varrable agument)
	//같은 타입을 여러개(몇개인지 모름), 받을 경우..사용 가능
	//메소드 내에서 배열로 사용
	static void method1(int...i) {
		System.out.println("파라미터 여러개 받는 메소드");
	}
	//가변인자는 파라미터 목록 끝에만 작성 가능
	static void method2(String s, int... i) {
		
	}
}
