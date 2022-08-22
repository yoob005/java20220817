package ch04.lecture;

public class C09For {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			
			for(int j = 1; j<6; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 5; j>0; j--) {
				System.out.print(j);				
			}
			System.out.println();
		}
		System.out.println("============================1");
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
		
		for(int i = 2; i < 7; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
		
		System.out.println("============================");
		int k = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <=i ; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println("============================");
		
		for(int i = 0; i < 5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for(int i = 5; i > 0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for(int i = 0; i < 5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int s=4; s>=i; s--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for(int i = 0; i < 5; i++) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int s=0; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		int t = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((t++)%10);
			}
			System.out.println();
		}   
	}
}
