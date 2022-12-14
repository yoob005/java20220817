package ch12.lecture;

public class C05ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Task5();
		t1.setName("쓰레드1");
		t1.setPriority(10); //가장 높은 순위
		t1.start();
		
		//확률상 가장 높은 순위가 먼저 끝날 확률이 높아짐.
		
		Thread t2 = new Task5();
		t2.setName("쓰레드2");
		t1.setPriority(1); //가장 낮은 순위
		t2.start();
	}
}

class Task5 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 100000; i++) {
			System.out.println(getName() +  ":" + i);
		}
	}
}
