package ch04.lecture.p01control;

import java.util.Scanner;

//ctrl + shift + o

public class C18GuessNumber {
	public static void main(String[] args) {
		// 컴퓨터 1~100 random
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("번호 맞추기");
		
		int a = (int)(Math.random()*100)+1;
		
//		while(true) {
//			System.out.println("번호를 입력하세요 (1~100) : " );
//			
//			int user = scanner.nextInt();			
//			
//			if(user==a) {
//				System.out.println("맞췄습니다.");
//				break;
//			} else if(user < a){
//				System.out.println("틀렸습니다. " + user + "보다 더 큰 값을 입력하세요");
//			} else if(user > a) {
//				System.out.println("틀렸습니다. " + user + "보다 더 작은 값을 입력하세요");
//			}
//		}
		
		while(true) {
			System.out.println("번호를 입력하세요 (1~100) : " );
			
			int user = scanner.nextInt();			
			
			if(user==a) {
				System.out.println("맞췄습니다.");
				break;
			} else if(user < a){
				System.out.println("UP");
			} else if(user > a) {
				System.out.println("DOWN");
			}
		}
		
	}
}
