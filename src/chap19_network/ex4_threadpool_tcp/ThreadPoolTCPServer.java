package chap19_network.ex4_threadpool_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 스레드풀을 사용하여
 * 클라이언트의 요청을 동시에 처리하는 서버
 * @author cheeeeze
 *
 */
public class ThreadPoolTCPServer {
	
	private static ServerSocket serverSocket = null;
	
	// 10개의 스레드로 요청을 처리하는 스레드풀 생성
	private static int poolCnt = 10;
	private static ExecutorService executorService = Executors.newFixedThreadPool( poolCnt );
	
	public static void main( String[] args ) {
		
		System.out.println( "#########################" );
		System.out.println( "서버 종료하려면 q 또는 Q 입력 후 Enter 입력하셈" );
		System.out.println( "#########################" );
		
		startServer();

		Scanner scanner = new Scanner( System.in );
		
		while( true ) {
			
			String key = scanner.nextLine();
			if ( key.toLowerCase().equals( "q" ) ) {
				break;
			}
		}
		
		System.out.println( "###### 서버 종료...." );
		scanner.close();
		
		stopServer();
	}
	
	public static void startServer() {
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				
				try {
					serverSocket = new ServerSocket( 50001 );
					System.out.println( "[서버] 시작됨..." );
					
					while( true ) {
						
						// 연결 수락
						Socket socket = serverSocket.accept();

						// 작업큐에 처리 작업 넣기. Runnable는 함수형 인터페이스이므로 람다로 전개 가능
						executorService.execute( () -> {

							try {
								// 연결된 클라이언트 정보 얻기
								InetSocketAddress client = ( InetSocketAddress )socket.getRemoteSocketAddress();
								
								System.out.println( "[서버] " + client.getHostName() + "의 연결 요청을 수락함" );
								
								// 데이터 수신
								DataInputStream dis = new DataInputStream( socket.getInputStream() );
								String receiveMsg = dis.readUTF();
								
								// 데이터 송신
								DataOutputStream dos = new DataOutputStream( socket.getOutputStream() );
								dos.writeUTF( receiveMsg ); // 받은 메시지를 다시 보냄
								
								dos.flush();
								
								System.out.println( "[서버] 받은 데이터 다시 보냄 : " + receiveMsg );
								
								// 연결 끊기
								socket.close();
								System.out.println( "[서버] " + client.getHostName() + "의 연결을 끊음" );
							}
							catch( Exception e ) {
								e.printStackTrace();
							}
						});
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		thread.start();
	}
	
	public static void stopServer() {
		
		try {
			serverSocket.close();
			executorService.shutdown();
		}
		catch( IOException e ) {
			
		}
	}

}
