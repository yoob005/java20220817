package ch05.lecture.p01array;

public class C08Array {
	public static void main(String[] args) {
		// 04 이차배열.png
		int[] a = {4,5,6};
		
		int[][] b; // 각 아이템의 type이 int[]
		
		b = new int[][] {{1,2}, {100,200},{5,6}};
		
		System.out.println(b[0][0]); //1
		System.out.println(b[0][1]); //2
		System.out.println(b[1][0]); //100
		System.out.println(b[1][1]); //200
		System.out.println(b[2][0]); //5
		System.out.println(b[2][1]); //6
		
		System.out.println();
	}
}
