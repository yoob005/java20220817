package ch13.lecture.p04genericmethod;

public class C01Method {
	
	public static void main(String[] args) {
		C01Method.<String>method1("str");
		C01Method.<Integer>method1(33);
		
		//메소드 타입 파라미터 생략 가능
		method1("str");
		method1(99);
		
		method1(3.14);
		
	}
	
	public static <T> void method1(T p) {
		
	}
	
	public static void method(Object o) {
		
	}
	
	public static void method(String o) {
		
	}
	
	public static void method(Integer i) {
		
	}
}
