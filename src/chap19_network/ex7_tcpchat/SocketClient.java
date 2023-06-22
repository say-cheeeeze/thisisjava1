package chap19_network.ex7_tcpchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

/**
 * 클라이언트와 1:1 로 통신하는 역할
 * 
 * @author cheeeeze
 *
 */
public class SocketClient {
	
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIP;
	String chatName;

	public SocketClient( ChatServer chatServer, Socket socket ) {
		
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream( socket.getInputStream() );
			this.dos = new DataOutputStream( socket.getOutputStream() );
			InetSocketAddress isa = ( InetSocketAddress )socket.getRemoteSocketAddress();
			this.clientIP = isa.getHostName();
			
			receive();
		}
		catch ( IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * JSON 메시지 받기
	 */
	public void receive() {
		
		chatServer.threadPool.execute( () -> {
			try {
				
				while( true ) {
					String receiveJson = dis.readUTF();
					
					JSONObject json = new JSONObject( receiveJson );
					String command = json.getString( "command" );
					String msg = "";
					
					if ( "incoming".equals( command ) ) {
						
						this.chatName = json.getString( "data" );
						msg = "입장하셨습니다";
						chatServer.addSocketClient( this );
					}
					else if( "message".equals( command ) ) {
						
						msg = json.getString( "data" );
					}
					
					chatServer.sendToAll( this, msg );
					
				}
			}
			// 채팅을 종료할 경우 readUTF() 에서 IOException 이 발생한다. 이걸 이용해 chatRoom 의 소켓 클라이언트를 제거한다.
			catch( IOException e) {
				e.printStackTrace();
				chatServer.sendToAll( this, "퇴장하셨습니다" );
				chatServer.removeSocketClient( this );
			}
		});
	}
	
	public void send( String json ) {
		
		try {
			dos.writeUTF( json );
			dos.flush();
		}
		catch( IOException e ) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			socket.close();
		}
		catch( Exception e ) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
