package ch05.book.example;

public class Exercise08ForEach {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		double cnt = 0;
		int allLength = 0;
		for (int[] i : array) {
			for (int j : i) {
				sum += j;
				cnt++;
			}
		}
		
		avg = sum / cnt;
		
		System.out.println(sum / (double) allLength);
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		
	}
}



//public int centeredAverage(int[] nums) {
//	  
//	  int max = 0;
//	  // Integer.MAX_VALUE;
//	  int min = 0;
//	  // Integer.MIN_VALUE;
//	  int z = nums.length;
//	  int sum = 0;
//	  int y = 0;
//	  
//	  for(int num : nums){
//	    if(num>max){
//	      max = num;
//	    }
//	    if(num<min){
//	      min = num;
//	    }
//	  }
//	  
//	  int x = sum/(z-2);
//	  
//	  return x;
//	  
//	}
//


//public int centeredAverage(int[] nums) {
//	  
//	  int max = Integer.MAX_VALUE;
//	  int min = Integer.MIN_VALUE;
//	  
//	  int sum = 0;
//	  int y = 0;
//	  
//	  for(int num : nums){
//	    if(num!=max&&num!=min){
//	      sum = sum + num;
//	      y++;
//	    }
//	  }
//	  
//	  int x = sum / y;
//	  
//	  return x;
//	  
//	}
//
//
//public int[] biggerTwo(int[] a, int[] b) {
//	  
//	  int front = Integer.MIN_VALUE;
//	  int back = Integer.MIN_VALUE;
//	  
//	  for(int num : a){
//	    front = Math.max(front,num);
//	  }
//	  
//	  for(int num : b){
//	    back = Math.max(back,num);
//	  }
//	  
//	  
//	  
//	  if(front>back){
//	    return a;
//	  }else{
//	  return b;
//	  }
//	}