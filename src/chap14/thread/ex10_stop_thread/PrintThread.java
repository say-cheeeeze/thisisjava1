package chap14.thread.ex10_stop_thread;

public class PrintThread extends Thread {
	
	@Override public void run() {
		
		while( true ) {
			
			System.out.println( "### print..... ");
			
			if ( Thread.interrupted() ) {
				break;
			}
		}
		
		System.out.println( "리소스 정리" );
	}
}
