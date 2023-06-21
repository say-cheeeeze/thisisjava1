package chap19_network.ex3_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class NewsClient {

	public static void main( String[] args ) {
		
		try {
			
			DatagramSocket clientSocket = new DatagramSocket();
			
			Scanner scanner = new Scanner( System.in );
			
			// msg send
			String msg = scanner.nextLine();
			byte[] bytes = msg.getBytes();
			
			// 패킷 전송
			DatagramPacket datagramPacket = new DatagramPacket( bytes, bytes.length, new InetSocketAddress( "localhost", 50001 ) );
			clientSocket.send( datagramPacket );
			
			while( true ) {
				
				// 패킷 수신
				DatagramPacket receivePacket = new DatagramPacket( new byte[1024], 1024 );
				clientSocket.receive( receivePacket );
				
				String receiveMsg = new String( receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8" );
				System.out.println( "[클라이언트] 받은 메시지 : " + receiveMsg );
				
				if ( receiveMsg.contains( "9" ) ) {
					break;
				}
				
			}
			
			clientSocket.close();
			scanner.close();
			
		}
		catch( Exception e ) {
			System.out.println( "[클라이언트]" + e.getMessage() );
		}
		
	}
}
