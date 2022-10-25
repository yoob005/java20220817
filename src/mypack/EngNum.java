package mypack;

public class EngNum {
	public static void main(String[] args) {
		String s1 = "one4seveneight";
		String s2 = "23four5six7";
		String s3 = "1zerotwozero3";
		String[] numArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String result = "";
		String str = "";
		for(int i = 0; i < s.length(); i++) {
			char cr = s.charAt(i);
			
			if(cr>47&&cr<58) {
				result+=s.substring(i,i+1);
			}
			if(cr>58) {
				str+=s.substring(i,i+1);
			}
			
			for(int j = 0; j < numArr.length; j++) {
				String num = Integer.toString(j);
				if(numArr[j].equals(str)) {
					result += num;
					str = "";
				}
			}
		}
		int answer = Integer.parseInt(result);
		
		
		
	
	
	}
}
