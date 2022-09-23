package ch18.lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Server {
	public static void main(String[] args) {
		System.out.println("연결 시도 중....");
		try(
			ServerSocket serverSocket = new ServerSocket(60000);
			Socket socket = serverSocket.accept();){
			
			System.out.println("연결 완료");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			try(is;isr;br;){
				
				String line = "";
				while((line = br.readLine())!= null) {
					System.out.println("받은메세지: " + line);
				}
				
			}
			
			System.out.println("프로그램 종료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
