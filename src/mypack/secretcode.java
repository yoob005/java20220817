package mypack;

public class secretcode {
	public static void main(String[] args) {
		String s = "c D Z e F f";
		int n = 22;
		String result = "";
		for(int i=0; i < s.length(); i++) {
			if(s.substring(i, i+1).equals(" ")){
				result += s.substring(i, i+1);
			}
			char cr = s.charAt(i);
			int num = (int) cr;
			if(num+n>122) {
				int newNum = (num+n)-26;
				char newCr = (char) newNum;
				String str = String.valueOf(newCr);
				result+=str;
				
			}
			if((num+n<123)&&(num>96)) {
				int newNum = num+n;
				char newCr = (char) newNum;
				String str = String.valueOf(newCr);
				result+=str;
			}
			if((num+n>90)&&(num<91)) {
				int newNum = (num+n)-26;
				char newCr = (char) newNum;
				String str = String.valueOf(newCr);
				result+=str;
			}
			if((num+n<91)&&(num>64)) {
				int newNum = num+n;
				char newCr = (char) newNum;
				String str = String.valueOf(newCr);
				result+=str;
			}
		}
		System.out.println(result);
	}
	
	public static String code(String s, int n) {		
		String result = "";
		for(int i=0; i < s.length(); i++) {
			if(s.substring(i, i+1).equals(" ")){
				result += s.substring(i, i+1);
				break;
			}
			char cr = s.charAt(i);
			int num = (int) cr;
			if(num+n>122) {
				int newNum = (num+n)-26;
				char newCr = (char) newNum;
				String str = String.valueOf(newCr);
				result+=str;
			}
			if(num+n<122) {
				int newNum = num+n;
				char newCr = (char) newNum;
				String str = String.valueOf(newCr);
				result+=str;
			}
		}
		
		
		return result; 
	}
}
