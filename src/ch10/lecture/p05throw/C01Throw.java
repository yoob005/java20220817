package ch10.lecture.p05throw;

public class C01Throw {
	public static void main(String[] args) {
		try {
			method1();
			
		}catch(RuntimeException) {
			
		}
		
	}
	
	private static void method1() throws RuntimeException{
		System.out.println("코드1");
		System.out.println("코드2");
		
		//예외 발생
		//throw Exception
		throw new RuntimeException();
	}
}
