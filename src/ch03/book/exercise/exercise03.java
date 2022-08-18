package ch03.book.exercise;

public class exercise03 {
	public static void main(String[] args) {
// 연습문제
// 1번) app만 뽑아서 출력		
//	String a = "apple";
//	
//	String b = a.substring(0,3);
//			
//			System.out.println(b);
//	
//2번) 면적과 둘레를 실수형으로 출력		
//	double a = 13.5; //가로
//	double b = 41.7; //세로
//	
//	//면적 c , 둘레 d 출력
//	
//	System.out.println("면적");
//	double c = a*b;
//	System.out.println(c);
//	System.out.println("둘레");
//	double d = (a+b) * 2;
//	System.out.println(d);
//3번) 국어(정수),영어(정수),수학(정수),총점(정수),평균(실수) 변수 선언
		
//		int korean = 100;
//		int english = 35;
//		int math = 60;
//		int sum = ((korean+english)+math);
//		double avg = sum / 3.0;
//		
//		System.out.println("총점 = " +sum);
//		System.out.println("평균 = " +avg);
//		if (avg >= 60) {
//			if(korean>=40 & english>=40 & math>=40) {
//			System.out.println("합격");
//		} 
//		  else {
//			System.out.println("불합격");
//		}
//		
//		}
//	4번)변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 
//		만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
		
		int num = 333;
		
		System.out.println(((num/10)*10)+1);
	
	
	}
}
