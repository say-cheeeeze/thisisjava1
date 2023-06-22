package chap19_network.ex7_tcpchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

/**
 * 서버 실행 클래스
 * 클라이언트의 요청을 수락하고 통신용 SocketClient 를 생성 함.
 * 
 * @author cheeeeze
 *
 */
public class ChatServer {

	ServerSocket serverSocket;
	
	ExecutorService threadPool = Executors.newFixedThreadPool( 100 );
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap( new HashMap<>() );
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy년 MM월 dd일 HH:mm:ss" );
	static String timeNow = "";
	
	public static void main( String[] args ) {
		
		try {
			
			ChatServer chatServer = new ChatServer();
			chatServer.startServer();

			System.out.println( "###########################################" );
			System.out.println( "####  서버를 종료하려면 q 를 입력하고 Enter  #####" );
			System.out.println( "###########################################" );
			
			Scanner scanner = new Scanner( System.in );
			
			while( true ) {
				
				String key = scanner.nextLine();
				if ( key.toLowerCase().equals( "q" ) ) {
					break;
				}
			}
			scanner.close();
			chatServer.stop();
			
		}
		catch( IOException e ) {
			System.out.println( "[서버] " + e.getMessage() );
		}
	}
	
	/**
	 * 서버 시작 시 가장 먼저 호출됨
	 * @throws IOException 
	 */
	public void startServer() throws IOException {
		
		// 50001번 포트에 바인딩하는 서버 소켓을 생성
		serverSocket = new ServerSocket( 50001 );

		LocalDateTime now = LocalDateTime.now();
		timeNow = now.format( formatter );
		System.out.println( "[" + timeNow + "][서버] is starting...." );
		
		// 작업 스레드가 처리할 Runnable 을 람다로 작성
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
	
	/**
	 * 채팅서버에 소켓 클라이언트 추가 ( 입장 )
	 * @param socketClient
	 */
	public void addSocketClient( SocketClient socketClient ) {
		
		String key = socketClient.chatName + "@" + socketClient.clientIP;
		chatRoom.put( key, socketClient );

		LocalDateTime now = LocalDateTime.now();
		timeNow = now.format( formatter );
		System.out.print( "[" + timeNow + "]" );
		System.out.println( "입장 : " + key + " / 현재 채팅자 수 : " + chatRoom.size() );
	}

	
	/**
	 * 채팅서버에 소켓 클라이언트 제거  ( 퇴장 )
	 * @param socketClient
	 */
	public void removeSocketClient( SocketClient socketClient ) {
		
		String key = socketClient.chatName + "@" + socketClient.clientIP;
		chatRoom.remove( key );

		LocalDateTime now = LocalDateTime.now();
		timeNow = now.format( formatter );
		System.out.print( "[" + timeNow + "]" );
		System.out.println( "퇴장 : " + key + " / 현재 채팅자 수 : " + chatRoom.size() );
		
	}
	
	/**
	 * 메세지를 보낸 클라이언트를 제외한 다른 모든 클라이언트에게 메세지 발송
	 * 
	 * @param client
	 * @param msg
	 */
	public void sendToAll( SocketClient client, String msg ) {
		JSONObject json = new JSONObject();
		json.put( "clientIP", client.clientIP );
		json.put( "chatName", client.chatName );
		json.put( "message", msg );

		LocalDateTime now = LocalDateTime.now();
		timeNow = now.format( formatter );
		json.put( "time", timeNow );
		String strJson = json.toString();
		
		Collection<SocketClient> socketClients = chatRoom.values();
		for( SocketClient sc : socketClients ) { 
			if ( sc == client ) {
				continue;
			}
			sc.send( strJson );
		}
	}
	
	/**
	 * 채팅 서버 종료
	 */
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			chatRoom.values().stream().forEach( sc -> sc.close() );

			LocalDateTime now = LocalDateTime.now();
			timeNow = now.format( formatter );
			System.out.print( "[" + timeNow + "]" );
			System.out.println( "[서버] is stopped..." );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
