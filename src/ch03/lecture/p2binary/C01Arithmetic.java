package ch03.lecture.p2binary;

public class C01Arithmetic {
	public static void main(String[] args) {
		//산술연산자
		// +,-,*,/,%
		
		//피연산자 2개 (byte,short,int,long,float,double,char)
		//연산결과는 피연산자 중 큰타입 
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);
	}
}
