package chap19_network.ex7_tcpchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 서버 실행 클래스
 * 클라이언트의 요청을 수락하고 통신용 SocketClient 를 생성 함.
 * 
 * @author cheeeeze
 *
 */
public class ChatServer {

	ServerSocket serverSocket;
	
	ExecutorService executorService = Executors.newFixedThreadPool( 100 );
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap( new HashMap<>() );
	
	/**
	 * 서버 시작 시 가장 먼저 호출됨
	 * @throws IOException 
	 */
	public void startServer() throws IOException {
		
		serverSocket = new ServerSocket( 50001 );
		System.out.println( "[Server] is starting...." );
		
		Thread thread = new Thread( () ->{ 
			
			try {
				while( true ) {
					
					Socket socket = serverSocket.accept();
					SocketClient client = new SocketClient( this, socket );
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		});
		
		thread.start();
	}
	
	
	
	
	
	
}
