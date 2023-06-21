package chap19_network.ex1_tcp_basic;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 반복적으로 accept() 메서드를 호출하여 클라이언트의 연결 요청을 계속 수락하는 
 * TCP 서버의 기본적인 코드
 * @author cheeeeze
 *
 */
public class ServerExample {
	
	private static ServerSocket serverSocket = null;
	
	public static void main( String[] args ) {
		
		System.out.println( "#########################" );
		System.out.println( "서버 종료하려면 q 또는 Q 입력 후 Enter 입력하셈" );
		System.out.println( "#########################" );
		
		startServer();
		
		Scanner scanner = new Scanner( System.in );
		
		while( true ) {
			
			String input = scanner.nextLine();
			
			if ( input.toLowerCase().equals( "q" ) ) {
				System.out.println( "break.." );
				break;
			}
		}
		
		System.out.println( "scanner.close()..." );
		scanner.close();
		
		stopServer();
	}
	
	public static void startServer() {
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket( 50001 );
					System.out.println( "[서버] 시작.." );
					
					while( true ) {
						System.out.println( "[서버] 연결 요청을 기다림.." );
						
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa = ( InetSocketAddress )socket.getRemoteSocketAddress();
						
						System.out.println( "[서버] " + isa.getHostName() + "의 연결 요청을 수락함.." );
						
						socket.close();
						
						System.out.println( "[서버] " + isa.getHostName() + "의 연결을 끊음.." );

					}
				}
				catch( Exception e ) {
					System.out.println( "[서버] " + e.getMessage() );
				}
			}
		};
		
		thread.start();
	}
	
	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println( "[서버] 종료됨.." );
		}
		catch( Exception e ) {
//			e.printStackTrace();
		}
	}
}
