package chap19_network.ex2_tcp_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * localhost 에서 port 를 할당하여 소켓 서버를 열고,
 * 클라이언트에게 접속을 허용하여
 * 문자열 데이터를 받아 다시 돌려보내는 에코 ( 메아리 ) TCP 서버 구현 예제
 * 
 * @author cheeeeze
 *
 */
public class EchoServer {
	
	private static ServerSocket serverSocket = null;

	public static void main( String[] args ) {
		
		System.out.println( "#########################" );
		System.out.println( "서버 종료하려면 q 또는 Q 입력 후 Enter 입력하셈" );
		System.out.println( "#########################" );

		// TCP 서버 구동
		startServer();
		
		Scanner scanner = new Scanner( System.in );
		while( true ) {
			
			String input = scanner.nextLine();
			if ( input.toLowerCase().equals( "q" ) ) {
				break;
			}
		}
		scanner.close();
		
		stopServer();
		
	}
	
	public static void startServer() {
		
		Thread serverThread = new Thread() {
			
			@Override
			public void run() {
				
				try {
					// ServerSocket 생성
					serverSocket = new ServerSocket( 50001 );
					System.out.println( "[서버] 시작됨..." );
					
					
					while( true ) {
						
						System.out.println( "\n[서버] 연결 요청을 기다림..." );
						// 연결 수락 및 데이터 통신
						Socket client = serverSocket.accept();
						
						// 연결된 클라이언트의 정보
						InetSocketAddress isa = ( InetSocketAddress ) client.getRemoteSocketAddress();
						System.out.println( "[서버] " + isa.getHostName() + " 의 연결 요청을 수락함" );
						
						// 데이터 받기
						DataInputStream dis = new DataInputStream( client.getInputStream() );
						String message = dis.readUTF(); // return Unicode String
						
						System.out.println( "받은 데이터 : " + message );
						
						// 데이터 보내기
						DataOutputStream dos = new DataOutputStream( client.getOutputStream() );

						// 받은 메세지를 그대로 다시 보냄
						dos.writeUTF( message );
						
						System.out.println( "[서버] 받은 데이터를 다시 보냄 : " + message );
						
						
						// 연결 해제
						client.close();
						System.out.println( "[서버] " + isa.getHostName() + " 의 연결을 해제함.." );
						
					}
					
					
				}
				catch( IOException e ) {
					System.out.println( "[서버] " + e.getMessage() );
				}
			}
		};
		
		serverThread.start();
	}

	public static void stopServer() {
		
		try {
			serverSocket.close();
			System.out.println( "[서버] 종료됨.." );
		}
		catch( IOException e ) {
			System.out.println( e.getMessage() );
		}
	}
	
	
}
