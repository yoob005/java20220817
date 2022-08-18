package ch02.lecture;

public class C11String {
	public static void main(String[] args) {
		//String 문자열
		//char 문자
		
		char a = '뀗'; //작은 따옴표
		String b = "java"; // 큰 따옴표
		String c = "";		
		
		
		
		
		// + (연결연산)의 결과는 String
		String d = "hello";
		char e = '!';
		String f = d + e;
		System.out.println(f);
		
		String g = d +100;
		System.out.println(g);
		
		String h =d + 3.14;
		System.out.println(h);
		
		String i = d + true;
		
		System.out.println(i);
		
		String j = d + "world";
		System.out.println(j);
		
		
		
		//참조타입(객체) ; 필드와 메소드가 있음
		
		String k = "bts";
		k.charAt(0); //charAta 메소드 특정 위치에 있는 하나의 문자만 뽑아 내고싶을때
	    int m = k.charAt(0);
	    
	    char n = k.charAt(0);
	    char o = k.charAt(1);
	    char p = k.charAt(2);
	    
	    System.out.println(n);
	    System.out.println(o);
	    System.out.println(p);
		
		//length : 길이 리턴
	    int q = k.length();
	    System.out.println(q);
	    
	    String r = "javascript";
	    System.out.println(r.length());
	    
	    System.out.println("hello World".length());
	    System.out.println("".length());
	    System.out.println(r.charAt(r.length()-1));
	    
	    //subString
	    
	    String s = r.substring(1); //음수 ㄴㄴ
	    
	    System.out.println(r.substring(0,9));
	    System.out.println(r.substring(0,10));		
	    
	    System.out.println(r.substring(0,4));
	    System.out.println(r.substring(2,4));
		
	}
}
