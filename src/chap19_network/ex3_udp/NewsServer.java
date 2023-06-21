package chap19_network.ex3_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

/**
 * 뉴스를 전송하는 뉴스 UDP 서버
 * @author cheeeeze
 *
 */
public class NewsServer {
	
	private static DatagramSocket datagramSocket = null;

	public static void main( String[] args ) {
		
		System.out.println( "#########################" );
		System.out.println( "서버 종료하려면 q 또는 Q 입력 후 Enter 입력하셈" );
		System.out.println( "#########################" );

		// UDP 서버 구동
		startUDPServer();
		
		Scanner scanner = new Scanner( System.in );
		while( true ) {
			
			String input = scanner.nextLine();
			if ( input.toLowerCase().equals( "q" ) ) {
				break;
			}
		}
		scanner.close();
		
		stopUDPServer();
		
	}
	
	public static void startUDPServer() {
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				
				try {
					
					datagramSocket = new DatagramSocket( 50001 );
					System.out.println( "[서버] 시작됨..." );
					
					while( true ) {
						
						// 데이터를 수신할 패킷을 생성
						DatagramPacket receivePacket = new DatagramPacket( new byte[1024], 1024 );
						
						// 수신 패킷을 통해 클라이언트의 데이터를 기다림
						datagramSocket.receive( receivePacket );
						
						String receivedData = new String( receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8" );
						System.out.println( "[서버] 받은 데이터 : " + receivedData );
						
						// 클라이언트의 IP 와 port 를 얻어야 메세지를 보낼 수 있음.( send packet 의 생성자 파라미터로 이용됨 )
						SocketAddress clientAddress = receivePacket.getSocketAddress();
						
						for( int i = 0; i < 10; i++ ) {
							String msg = "메세지 " + i + "!!";
							byte[] bytes = msg.getBytes( "UTF-8" );
							DatagramPacket sendPacket = new DatagramPacket( bytes, 0, bytes.length, clientAddress );
							datagramSocket.send( sendPacket );
							System.out.println( "send..." + msg );
						}
						
					}
					
				}
				catch( Exception e ) {
					System.out.println( "[서버] " + e.getMessage() );
				}
			}
		};
		
		thread.run();
		
	}
	public static void stopUDPServer() {
		
		datagramSocket.close();
		System.out.println( "[서버] 종료됨.." );
	}
}
