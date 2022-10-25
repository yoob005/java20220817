package mypack;

public class everLand {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
	}
	
	public static long play(int price, int money, int count) {
		
		long answer = 0;
		
		for(int i = 0; i < count; i++) {
			price += price;
			money -= price;
		}
		if(money < 0) {
			answer =  -(money);
		}
		
		return 0;
	}
}
