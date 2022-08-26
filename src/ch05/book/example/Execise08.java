package ch05.book.example;

public class Execise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < array[0].length; i++) {
			sum += array[0][i];
		}
		for(int j = 0; j < array[1].length; j++) {
			sum += array[1][j];
		}		
		for(int k = 0; k < array[2].length; k++) {
			sum += array[2][k];
		}		
		
		
		double sum1 = 0.0;
		
		sum1 = (array[0].length) + (array[1].length) + (array[2].length);
		
		avg = sum / sum1;
			
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);		
	}
}

