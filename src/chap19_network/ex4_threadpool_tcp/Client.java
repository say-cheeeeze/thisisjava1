package chap19_network.ex4_threadpool_tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	
	public static void main( String[] args ) {
		
		try {
			
			Socket socket = new Socket( "localhost", 50001 );
			System.out.println( "[클라이언트] 연결 성공" );
			
			String msg = "Client의 메세지입니다";
			
			DataOutputStream outputStream = new DataOutputStream( socket.getOutputStream() );
			
			outputStream.writeUTF( msg );
			outputStream.flush();
			
			System.out.println( "[클라이언트] 메시지 보냄 : " + msg );
			
			DataInputStream inputStream = new DataInputStream( socket.getInputStream() );
			String receiveMsg = inputStream.readUTF();
			System.out.println( "[클라이언트] 메시지 받음 : " + receiveMsg );
			
			
			socket.close();
			System.out.println( "[클라이언트] 접속 해제" );
			
		}
		catch( IOException e ) {
			e.printStackTrace();
		}
	}

}
