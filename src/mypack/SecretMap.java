package mypack;

public class SecretMap {
	public static void main(String[] args) {
		int n = 5; 
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			String one = Integer.toString(arr1[i],2);
			String two = Integer.toString(arr2[i],2);
			String sum = "";
			
			if(one.length()!=n) {
				int x = n-one.length();
				for(int k = 0; k < x; k++) {
					one = "0" + one;
				}
			}
			if(two.length()!=n) {
				int y = n-two.length();
				for(int k = 0; k < y; k++) {
					two = "0" + two;
				}
			}			
			for(int j = 0; j < n; j++) {
				if(one.substring(j, j+1).equals("0")&&two.substring(j, j+1).equals("0")) {
					sum += " ";
				} else {
					sum += "#";
				}
			}
			System.out.println(one +"  " +  i+"번째");
			System.out.println(two +"  " +  i+"번째");
			answer[i] = sum;
			System.out.println(sum);
		}
		
		
	}
}
