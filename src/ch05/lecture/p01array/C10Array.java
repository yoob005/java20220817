package ch05.lecture.p01array;

public class C10Array {
	public static void main(String[] args) {
		int[][] a = {{3,4,5},{1,2,3}};
		int[][] b = new int[2][3];
		int[][] c = new int[3][];//null
		
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[0][2]);
		
		b[0][0] = 9;
		b[0][1] = 8;
		b[0][2] = 99;
		
		c[0] = new int[] {99,98};
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		
		c[1] = new int[] {200,100};
		System.out.println(c[1][0]);
		System.out.println(c[1][1]);
		
		c[2] = new int[] {-1,-2};
		System.out.println(c[2][0]);
		System.out.println(c[2][1]);
	}
}
