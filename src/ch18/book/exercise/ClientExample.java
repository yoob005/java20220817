package ch18.book.exercise;

import java.io.File;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "";
		File file = new File(filePath);
		
		String fileName = file.getName();
		
		System.out.println("[파일 보내기 시작] " + fileName);
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
