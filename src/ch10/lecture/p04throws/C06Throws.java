package ch10.lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C06Throws {
	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() throws FileNotFoundException{
		FileReader fr = new FileReader("a");
	}
}
