package java20220817;

import java.util.*;

public class test {
	public static void main(String[] args) {
		String X = "5525";
		String Y = "1255";

		char[] xrr = X.toCharArray();
		char[] yrr = Y.toCharArray();
		Arrays.sort(xrr);
		Arrays.sort(yrr);
		String num = "9876543210";
		String x = xrr.toString();
		String y = yrr.toString();
//		List<Character> list = new ArrayList<Character>(xrr);
//		String[] strxrr = (String[]) Arrays.toString(xrr);
		StringBuilder ans = new StringBuilder("");
		for(int i=0; i <num.length(); i++) {
			if(x.contains(num.valueOf(i))&&y.contains(num.valueOf(i))){
				
			}
		}
		while(y.length()==0) {
//			if(x.indexOf(0))
		}
		System.out.println(x.indexOf("5"));
		System.out.println(y.indexOf("5"));
		ans.reverse();
		
//		StringBuilder sbx = new StringBuilder(X);
//		StringBuilder sby = new StringBuilder(Y);
//		String answer = "";
//		List<String> list = new ArrayList<String>();
//		for(int i = 0; i < sby.length(); i++) {
//			for(int j=0; j<sbx.length(); j++) {
//				if((sby.charAt(i))==(sbx.charAt(j))) {
//					list.add(sbx.substring(j,j+1));
//					sbx.deleteCharAt(j);
//					break;
//				}
//			}
//		}
//		if(list.size()==0) {
//			return "-1";
//
//		}
//		Collections.sort(list,Collections.reverseOrder());
//		
//		for(String i : list) {
//			answer+=i;
//		}
		String answer = ans.toString();
//		if(answer.length()==0) {
//			return "-1";
//		}
//        if(answer.length()>1&&answer.substring(0,1).equals("0")) {
//			if(answer.substring(0,1).equals(answer.substring(1,2))) {
//				answer = "0";
//			}
//		}
////        return answer;
        System.out.println(answer);
		
	}
}
