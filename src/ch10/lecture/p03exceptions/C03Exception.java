package ch10.lecture.p03exceptions;

public class C03Exception {
	public static void main(String[] args) {
		Class a = null;
		try {
			a = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a.toString());
		
		
	}
}
