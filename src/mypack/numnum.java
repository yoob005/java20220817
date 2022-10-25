package mypack;

import java.util.*;

public class numnum {
	public static void main(String[] args) {
		String X = "5525";
		String Y = "1255";
//		char[] arrx = X.toCharArray();
//		Arrays.sort(arrx);
//		String strx=arrx.toString();
//		char[] arry = Y.toCharArray();
//		Arrays.sort(arry);
//		String stry=arry.toString();
//		StringBuilder sbx = new StringBuilder(strx).reverse();
//		StringBuilder sby = new StringBuilder(stry).reverse();
//		StringBuilder answer = new StringBuilder("");
//		List<String> list = new ArrayList<String>();
//		for(int i = 0; i < sbx.length(); i++) {
//			for(int j=0; j<sby.length(); j++) {
//				if((sbx.charAt(i))==(sby.charAt(j))) {
//					list.add(sby.substring(j,j+1));
//					sby.deleteCharAt(j);
//					break;
//				}
//			}
//		}
//		int cnt = 0;
//		int num = 9;
//		while(sby.length()==0) {
//			if(sbx.charAt(cnt)==&&sby.charAt(cnt)==num) {
//				answer.append(sbx.charAt(cnt));
//				cnt++;
//			}
//			
//			
//		}
////		if(list.size()==0) {
////			return "-1";
////		}
//		
////		Collections.sort(list,Collections.reverseOrder());
////		
////		for(String i : list) {
////			answer.append(i);
////		}
//		if(answer.length()>1&&answer.substring(0,1).equals("0")) {
//			if(answer.substring(0,1).equals(answer.substring(1,2))) {
//				answer=new StringBuilder("0");
//			}
//		}
//		String result = answer.toString();
//		System.out.println(answer);
//		System.out.println(arrx[0]);
		char[] xrr = X.toCharArray();
		char[] yrr = Y.toCharArray();
		Arrays.sort(xrr);
		Arrays.sort(yrr);
//		String xstr = new String(xrr);
//		String ystr = new String(yrr);
		StringBuilder ans = new StringBuilder("");
		StringBuilder xsb = new StringBuilder(new String(xrr));
		StringBuilder ysb = new StringBuilder(new String(yrr));
		//		for(char xy : xrr) {
//			for(int i = 0; i < yrr.length; i++) {
//				if(xy==yrr[i]) {
//					ans.append(yrr[i]);
//					yrr[i] = 'a';
//					break;
//				}
//			}
//		}
//			for(int i=0; i < xsb.length(); i++) {
//				if((xsb.charAt(i)!=ysb.charAt(i))&&xsb.charAt(i)>ysb.charAt(i)) {
//					ysb.delete(i,i+1);
//				}
//				if(xsb.charAt(i)==ysb.charAt(i)) {
//					ans.append(ysb.substring(i, i+1));
//					ysb.delete(i,+1);
//				}
//			}
//		while((ysb.length()!=0)&&(xsb.length()!=0)) {
//			for(int i = 0; i < ysb.length(); i++) {
//				if(xsb.charAt(0)==ysb.charAt(i)) {
//					ans.append(ysb.charAt(i));
//					xsb.deleteCharAt(0);
//					ysb.deleteCharAt(i);
//					if(ysb.length()==0||xsb.length()==0) {
//						break;
//					}
//				}
//				
//				if((xsb.charAt(0)!=ysb.charAt(0))&&(xsb.charAt(0)>ysb.charAt(0))) {
//					ysb.deleteCharAt(0);
//					if(ysb.length()==0||xsb.length()==0) {
//						break;
//					}
//				}
//				
//				if((xsb.charAt(0)!=ysb.charAt(0))&&(xsb.charAt(0)<ysb.charAt(0))) {
//					xsb.deleteCharAt(0);
//					if(ysb.length()==0||xsb.length()==0) {
//						break;
//					}
//				}
//			}
//			
//		}
		int cnt = 0;
		System.out.println(xsb);
		System.out.println(ysb);
		while(xsb.length()!=0&&ysb.length()!=0) {
			int xcnt = 0;
			int ycnt = 0;
			System.out.println(cnt);
			if((xsb.charAt(0)!=ysb.charAt(0))&&(xsb.charAt(0)>ysb.charAt(0))) {
				ysb.deleteCharAt(0);
				if(ysb.length()==0||xsb.length()==0) {
					break;
				}
			}
			
			if((xsb.charAt(0)!=ysb.charAt(0))&&(xsb.charAt(0)<ysb.charAt(0))) {
				xsb.deleteCharAt(0);
				if(ysb.length()==0||xsb.length()==0) {
					break;
				}
			}
			if(xsb.charAt(0)==ysb.charAt(0)) {
				cnt = Integer.parseInt(xsb.substring(0,1));
				String numstr = Integer.toString(cnt);
				System.out.println("numstr입니다" + numstr);
				for(int  i=0; i < xsb.length(); i++) {
					if(xsb.charAt(i)==numstr.charAt(0)) {
						xcnt++;
				
					} else {
						break;
					}
				xsb = new StringBuilder(xsb.substring(xcnt));	
				}
				for(int  i=0; i < ysb.length(); i++) {
					if(ysb.charAt(i)==numstr.charAt(0)) {
						ycnt++;
					} else {
						break;
					}
				}
				ysb = new StringBuilder(ysb.substring(ycnt));
				if(xcnt>ycnt) {
					for(int i = 0; i < ycnt; i++) {
						ans.append(numstr);
					}
				} else if(xcnt<ycnt) {
					for(int i = 0; i < xcnt; i++) {
						ans.append(numstr);
					}
				
				}
//				if(ysb.length()==0||xsb.length()==0) {
//					break;
//				}
			}
		}
		System.out.println(ans);
		ans.reverse();
		String answer = ans.toString();
        if(answer.length()==0) {
//			return "-1";
		}
        if(answer.length()>1&&answer.substring(0,1).equals("0")) {
			if(answer.substring(0,1).equals(answer.substring(1,2))) {
				answer = "0";
			}
		}
        System.out.println(answer);
	}
}
