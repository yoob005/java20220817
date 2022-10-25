package mypack;

public class three_gun_four {
	public static void main(String[] args) {
		
		int[] number = {-2,3,0,2,-5};
		int cnt = 0;
		for(int i = 0; i < number.length; i++) {
			for(int j = i+1; j < number.length; j++) {
				for(int k = j+1; k < number.length; k++) {
					if((number[i]+number[j]+number[k])==0) {
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		
		
	}
	
	public static int sam(int[] number) {
		
		
		
		
		return 0;
	}
}
