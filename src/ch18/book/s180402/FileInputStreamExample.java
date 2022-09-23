package ch18.book.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"src/ch18/book/s180402/FileInputStreamExample.java"
					);
			int data;
			//야아아아아
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
