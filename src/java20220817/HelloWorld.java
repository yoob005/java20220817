package java20220817;

public class HelloWorld {
	public static void main(String[] args) {
//		public boolean sameEnds(int[] nums, int len) {
		
		int[] nums = {1,2,3,2,5,2};
		int val = 2;
		
		int[] arr = new int[nums.length];
		  
	    for(int i=0; i < nums.length; i++){
	      arr[i] = nums[i];
	      if(i!=0&&i!=(nums.length-1)){
	        if(nums[i]==val){
	          if(nums[i-1]>nums[i+1]){
	            arr[i]=nums[i-1];
	          }else if(nums[i-1]<nums[i+1]){
	            arr[i]=nums[i+1];
	          }
	        }
	      }
	    }
	}
}


