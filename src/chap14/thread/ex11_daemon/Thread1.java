package chap14.thread.ex11_daemon;

public class Thread1 extends Thread {
	
	@Override public void run() {
		
		for( int i = 1; i <= 4; i++ ) {
			
			System.out.println( ".....일반 스레드......" );
			try {
				
				Thread.sleep( 500 );
				
			}
			catch ( InterruptedException e ) {
				break;
			}
		}
		System.out.println( "일반 스레드 종료" );
	}
}
