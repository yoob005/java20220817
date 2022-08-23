package ch04.lecture.p01control;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");
			
			int input1 = scanner.nextInt();
			if(input1==1) {
				System.out.println("예금액> ");
				int input2 = scanner.nextInt();
				balance += input2;
				System.out.println("잔액: " + balance + "원");
			} else if(input1==2) {
				System.out.println("출금액> ");
				int input3 = scanner.nextInt();
				if(input3>balance) {
					System.out.println("잔액이 부족합니다.");
				}else {
					balance -= input3;
					System.out.println("잔액: " + balance + "원");
				}
			} else if(input1==3) {
				System.out.println("잔고> " + balance + "원");
			} else if(input1==4) {
				//break;
				run = false;
			}
		}
		
		
		System.out.println("프로그램 종료");
	}
}
