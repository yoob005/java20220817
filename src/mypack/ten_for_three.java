package mypack;

public class ten_for_three {
	public static void main(String[] args) {
		int n = 45;
		StringBuilder sb1 = new StringBuilder(Integer.toString(n, 3)).reverse();
		int answer = Integer.parseInt(sb1.toString(),3);
	}
}
