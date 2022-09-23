package ch18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C06Filter {
	public static void main(String[] args) throws Exception {
		
		
		String fileName = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		File cv = new File("C:\\Users\\user\\Desktop\\output\\output13.txt");
		
		try(
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		FileOutputStream fos = new FileOutputStream(cv);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		){
		
			char[] buf = new char[100];
			int len = 0;
			
			while ((len = br.read(buf)) != -1) {
				bw.write(buf, 0, len);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
