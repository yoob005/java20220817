package ch03.lecture.p2binary;

public class C09Assignment {
	public static void main(String[] args) {
		
		//대입연산자 : = , += , -+ 등등등
		
		int i = 3 ;
		int j = 5 ;
		
		int k = i;
		
		System.out.println(k); // 3
		
		k += j; // k = k + j;
		System.out.println(k); //8
		k -= i;
		System.out.println(k);
		
		k *= i; 
		System.out.println(k); 
		
		k /= j; // k = k/j
		System.out.println(k);
		
		k %= i;
		System.out.println(k);
	}
}
