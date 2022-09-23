package ch18.book.exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:\\Users\\user\\Desktop\\output\\output4.txt";
	
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int num = 1;
		while((line = br.readLine())!=null) {
			System.out.println(num + ": " + line);
			
			num++;
		}
		br.close();
		fr.close();
	}
}
