package ch10.lecture.p06message;

public class C01Message {
	public static void main(String[] args) {
		System.out.println("메인코드 1");
		method1();
		
		System.out.println("메인 실행 이어감");
	}
	
	private static void method1() {
		System.out.println("메인코드 1");
		try {
			method2();
		} catch (Exception e) {
				//캐치 블록 빈칸으로 두면 절대 ㄴㄴ 메세지 남기기
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("메인 실행 이어감");
	}
	
	private static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지 메세지 남기기기기기기기기기기기");
	}
}
