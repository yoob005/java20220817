package ch12.lecture;

import java.awt.Toolkit;

public class C03Lambda {
	public static void main(String[] args) {
		//소리 출력
		Thread t1 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i=0; i < 5; i++) {
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i=0; i < 5; i++) {
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
			}
		});
	}
}
