package ch02.lecture;

public class C05Char {
	public static void main(String[] args) {
		//char : 2byes
		//character
		// 하나의 문자 표현용
		// 유니코드 사용
		char a;
		a = '가'; //문자 하나는 작은 따옴표 사용
		
		char b = 'A';
		char c = 'a';
		char d = ' ';
//		char e = ''; //빈문자는 없음
		String f =""; //상관없음
		
		char g = 65;
		char k = '\u270d';
		
	}


public String notString(String str) {
	  int a=0;
	  int b=1;
	  
	  String c = str.substring(a,b);
	  String d = "n";
	  if(!c.equals(d)){
	    return "not " +  str;
	  }else if(str.length()==2){
	    return "not " + str;
	  }else {
	    return str;
	  }
	}
}