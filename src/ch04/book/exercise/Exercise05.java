package ch04.book.exercise;

public class Exercise05 {
	public static void main(String[] args) {
		
		int sum =1;
		for(int x = 1; x <11; x++) {
			for(int y = 1; y < 11; y++) {
				if((4*x)+(5*y)==60) {
					System.out.println(x+","+y);
				}
				
			}
		}
	}
}
