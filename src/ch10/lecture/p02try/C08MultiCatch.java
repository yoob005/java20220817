package ch10.lecture.p02try;

public class C08MultiCatch {
	public static void main(String[] args) {
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]);
			
			System.out.println(a);
			
			//캐치 블럭 하나에 한번에 쓸 수 있다.
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("exception 발생!!!");
		} 
	}
}
