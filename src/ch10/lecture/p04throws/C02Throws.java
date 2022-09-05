package ch10.lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C02Throws {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
