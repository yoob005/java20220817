package mypack;

public class divisor {
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		return div(n,m);
	}
	
		
		public static int[] div(int n , int m) {
			
			int[] answer = new int[2];
		
			for(int i = m; i<=(m*n); i+=m) {
				for(int j = n; j <= i; j+=n) {
					if(j==i) {
						answer[1] = j;
						break;
					}
				}
				if(answer[1]!=0) {
					break;
				}
			}
			answer[0] = 1;
			for(int i = n; i>1; i--) {
				if(n%i==0&&m%i==0) {
					answer[0] = i;
					return answer;
				}
				
			}
			
			return answer;
		
	}
}
