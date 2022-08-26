package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b = {99,100,101};
		
		a[0] = 33; 
		
		System.out.println(a[0]);
		
		
		
		
		int[]c = a;
		
		c[2] = -5;
		
		System.out.println(a[2]);
		
	}
}
