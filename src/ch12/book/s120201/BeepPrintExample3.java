package ch12.book.s120201;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new Thread(() ->{
			
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		});
	}
}
