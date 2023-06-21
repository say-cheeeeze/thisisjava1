package chap19_network.ex2_tcp_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * localhost 에서 서버 포트에 연결하여 문자열을 전송하는 클라이언트 예제
 * @author cheeeeze
 *
 */
public class EchoClient {

	public static void main( String[] args ) {
		
		try {
			
			Socket socket = new Socket( "localhost", 50001 );
			
			System.out.println( "[클라이언트] 연결 성공" );
			
			String sendMsg = "나는 자바를 열심히 공부할거얌!";
			DataOutputStream dos = new DataOutputStream( socket.getOutputStream() );
			dos.writeUTF( sendMsg );
			dos.flush();
			
			System.out.println( "[클라이언트] 데이터 보냄 : " + sendMsg );
			
			// 서버가 보내는 데이터가 있다.
			// 데이터 받기
			DataInputStream dis = new DataInputStream( socket.getInputStream() );
			String receiveMsg = dis.readUTF();
			System.out.println( "[클라이언트] 데이터 받음 : " + receiveMsg );

			socket.close();
			System.out.println( "[클라이언트] 연결 해제..." );
		}
		catch( IOException e ) {
		}
		
	}
}
