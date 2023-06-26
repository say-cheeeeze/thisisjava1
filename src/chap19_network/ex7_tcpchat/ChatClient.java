package chap19_network.ex7_tcpchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy년 MM월 dd일 HH:mm:ss" );
	
	public static void main( String[] args ) {
		
		try {
			ChatClient client = new ChatClient();
			client.connect();
			
			Scanner scanner = new Scanner( System.in );
			System.out.println( "대화명을 입력하세요 : " );
			client.chatName = scanner.nextLine();
			
			JSONObject json = new JSONObject();
			json.put( "command", "incoming" );
			json.put( "data", client.chatName );
			
			LocalDateTime now = LocalDateTime.now();
			String timeNow = now.format( formatter );
			json.put( "time", timeNow );
			
			String strJson = json.toString();
			client.send( strJson );
			
			client.receive();

			System.out.println( "#################################" );
			System.out.println( "보낼 메시지를 입력한 뒤 Enter " );
			System.out.println( "채팅을 종료하려면 q를 입력 후 Enter" );
			System.out.println( "#################################" );
			
			while( true ) {
				
				String message = scanner.nextLine();
				
				if( message.toLowerCase().equals( "q" ) ) {
					break;
				}
				else {
					JSONObject sendJson = new JSONObject();
					sendJson.put( "command", "message" );
					sendJson.put( "data", message );
					
					now = LocalDateTime.now();
					timeNow = now.format( formatter );
					sendJson.put( "time", timeNow );
					
					client.send( sendJson.toString() );
				}
			}
			scanner.close();
			client.unconnect();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void connect() throws UnknownHostException, IOException {
		
		socket = new Socket( "localhost", 50001 );
		dis = new DataInputStream( socket.getInputStream() );
		dos = new DataOutputStream( socket.getOutputStream() );
		System.out.println( "[클라이언트] 서버에 연결됨..." );
		
	}
	
	public void receive() {
		
		Thread thread = new Thread( () -> {
			
			try {
				
				while( true ) {
					
					String strJson = dis.readUTF();
					JSONObject json = new JSONObject( strJson );
					String clientIP = json.getString( "clientIP" );
					String chatName = json.getString( "chatName" );
					String message = json.getString( "message" );
					String time = json.getString( "time" );
					System.out.println( "[" + time + "]" + chatName + "@" + clientIP + " >> " + message );
				}
			}
			// 서버와 연결이 끊어지면 dis.readUTF() 에서 IOException 이 일어나기 때문에
			// 예외처리를 통해 클라이언트도 접속이 끊어지도록 한다.
			catch ( Exception e ) {
				e.printStackTrace();
				System.out.println( "[클라이언트] 서버 연결 끊김" );
				System.exit( 0 );
			}
			
		});
		
		thread.start();
	}
	
	public void send( String json ) throws IOException {
		
		dos.writeUTF( json );
		dos.flush();
	}
	
	public void unconnect() throws IOException {
		socket.close();
	}
}
