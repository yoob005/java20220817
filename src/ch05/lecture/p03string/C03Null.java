package ch05.lecture.p03string;

public class C03Null {
	public static void main(String[] args) {
		// null : 참조하는 객체가 없을때 null 값 들어감 
		
		int[] a;
		String b;
		String c = "java";
		
		a = null; //참조하는 객체가 없음
		b = null; //참조하는 객체가 없음
		
		System.out.println(c.length());
		System.out.println(b.length()); //NullPointerExeption
		
	}
}
