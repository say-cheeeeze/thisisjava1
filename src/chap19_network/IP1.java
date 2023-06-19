package chap19_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP1 {
	
	public static void main( String[] args ) throws UnknownHostException {
		
		InetAddress ia = InetAddress.getLocalHost();
		String host = ia.getHostAddress();
		System.out.println( host );
		
		String naver = "www.naver.com";
		InetAddress[] naverAddArr = InetAddress.getAllByName( naver );
		for( InetAddress add : naverAddArr ) {

			String naverAddress = add.getHostAddress();
			System.out.println( naver + " IP 주소 : " + naverAddress );
		}
		
	}

}
