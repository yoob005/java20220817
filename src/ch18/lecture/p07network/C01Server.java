package ch18.lecture.p07network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) throws Exception {
		//서버: 연결을 기다림
		//연결 요청을 수락
		// socket 만들기 위해
		// serversocket 사용
		
		try(
		
				//serverSocket 만듦.
				ServerSocket serverSocket = new ServerSocket(50000);
	
		
				//연결을 기다림
				Socket socket = serverSocket.accept();
				){
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println("연결종료");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
