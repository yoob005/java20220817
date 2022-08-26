package ch05.lecture.p01array;

public class C04Array {
	public static void main(String[] args) {
		// 참조타입 == 객체 (거의 같다)
		
		int[] arr1 = {9,8,7};
		
		
		
		//length 속성(field) attribute 라고도함 , 다른 언어에서는 property
		System.out.println(arr1.length);
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2.length);
		
		int[] arr3 = {};
		System.out.println(arr3.length);
		
		System.out.println(arr1[arr1.length - 1]);
		System.out.println(arr2[arr2.length - 1]);
		System.out.println(arr3[arr3.length - 1]);
		
		System.out.println("프로그램 계속 실행");
		
	}
}
