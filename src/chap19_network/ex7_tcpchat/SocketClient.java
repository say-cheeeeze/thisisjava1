package chap19_network.ex7_tcpchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

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
		}
	}
	
	
	
	public void receive() {
		
	}
}
