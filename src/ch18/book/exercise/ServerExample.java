package ch18.book.exercise;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001));
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				
				
				fileName = fileName.trim();
				try()
				
				System.out.println("[파일 받기 시작] " + fileName);
				
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
			} catch(Exception e) {
				break;
			}
		}
		
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
