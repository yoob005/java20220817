package mypack;

public class crazyString {
	public static void main(String[] args) {
		String s = "try hello world";
	}
	public static String cz(String s) {
		String add = "";
		char blank = ' ';
		int strcnt=1;
		
		for(int i = 0; i < s.length(); i++) {
			if(blank==s.charAt(i)) {
				add += s.substring(i, i+1);
				strcnt=1;
			} else {
				strcnt++;
				if(strcnt%2==0) {
					add += s.substring(i,i+1).toUpperCase();
				} else {
					add += s.substring(i,i+1).toLowerCase();
				}
			}
			
		}
		
		return add;
	}
}
