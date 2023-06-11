package chap14.thread.ex11_daemon;

public class Daemon1 extends Thread {
	
	@Override public void run() {
		while( true ) {
			
			System.out.println( "##########  Daemon 스레드......" );
			
			try {
				
				Thread.sleep( 500 );
				
			}
			catch ( InterruptedException e ) {
				System.out.println( "데몬 스레드 break" );
				break;
			}
		}
		System.out.println( "데몬 스레드 종료" );
	}
}
