package ch04.lecture.p01control;

import java.util.Scanner;

public class C20GuessNumber {
	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int user = 0;
		
		do {
			System.out.println("(1~100) 입력 : ");
			
			user = scanner.nextInt();
		
			if (com==user) {
				System.out.println("정답");
			} else if(com>user) {
				System.out.println("up");
			} else {
				System.out.println("down");
			} 
		  } while(com != user);
	}
}
