package chap19_network.ex1_basic;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 클라이언트 TCP 연결 예제
 * @author cheeeeze
 *
 */
public class ClientExample {
	
	public static void main( String[] args ) {
		
		try {
			
			Socket socket = new Socket();
			socket.connect( new InetSocketAddress( "localhost", 50001 ) );
			
			System.out.println( "[클라이언트] 연결 성공!" );
			
			socket.close();
			
			System.out.println( "[클라이언트] 연결 해제.." );
		}
		catch( UnknownHostException e1 ) {
			// IP 표기 방법이 잘못된 경우
			e1.printStackTrace();
		}
		catch( IOException e2 ) {
			// 해당 포트의 서버에 연결할 수 없는 경우
			e2.printStackTrace();
		}
		
	}

}
