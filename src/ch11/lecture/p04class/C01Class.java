package ch11.lecture.p04class;

public class C01Class {
	public static void main(String[] args) throws Exception {
		Class c;
		
		
		String s1 = "java";
		
		// instance 의 getClass
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		
		//class forName 메소드
		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2.getName());
		
		//class 키워드 사용
		Class c3 = String.class;
		System.out.println(c3.getName());
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
	}
}
