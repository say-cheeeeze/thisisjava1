package chap19_network.ex5_threadpool_udp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
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
public class ThreadPoolUDPServer {
	
	private static DatagramSocket datagramSocket = null;
	
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
					datagramSocket = new DatagramSocket( 50001 );
					System.out.println( "[서버] 시작됨..." );
					
					while( true ) {
						
						// 연결 수락
						DatagramPacket receivePacket = new DatagramPacket( new byte[1024], 1024 );
						
						datagramSocket.receive( receivePacket );
						
						// 작업큐에 처리 작업 넣기. Runnable는 함수형 인터페이스이므로 람다로 전개 가능
						executorService.execute( () -> {

							try {
								
								// 1. 가장 중요한, 받은 데이터.
								String data = new String( receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8" );
								
								// 2. 클라이언트의 소켓주소( 보낼때 알아야하니까 ) : 수신된 패킷으로부터 알 수 있다.
								SocketAddress socketAddress = receivePacket.getSocketAddress();
								
								// 3. 전송 : 심심하니까 10번 똑같이 보내준다.
								for( int i = 0; i < 9; i++ ) {
									String sendMsg = data + "(" + i + ")";
									
									byte[] sendDataBytes = sendMsg.getBytes( "UTF-8" );
									// 보낼 패킷을 만들고
									DatagramPacket sendPacket = new DatagramPacket( sendDataBytes, 0, sendDataBytes.length, socketAddress );
									
									// 소켓에 담아 소켓이 보낸다.
									datagramSocket.send( sendPacket );
								}
								
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

		datagramSocket.close();
		executorService.shutdown();
		System.out.println( "[서버] 종료됨..." );
	}

}
