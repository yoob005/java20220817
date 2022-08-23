package ch04.lecture.p02method;

import java.util.Scanner;

public class C01Method {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method(invoke method)
		method1();
		
		
		System.out.println(4);
		method2();
		System.out.println(5);
		System.out.println(6);
		//method 는 함수다.
	}
	
	public static void method1() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	
	public static void method2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("번호 맞추기");
		
		int a = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.println("번호를 입력하세요 (1~100) : " );
			
			int user = scanner.nextInt();			
			
			if(user==a) {
				System.out.println("맞췄습니다.");
				break;
			} else if(user < a){
				System.out.println("틀렸습니다. " + user + "보다 더 큰 값을 입력하세요");
			} else if(user > a) {
				System.out.println("틀렸습니다. " + user + "보다 더 작은 값을 입력하세요");
			}
		}
	}
}
