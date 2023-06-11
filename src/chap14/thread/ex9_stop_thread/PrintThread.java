package chap14.thread.ex9_stop_thread;

import java.time.LocalDateTime;

public class PrintThread extends Thread {
	
	private boolean existFlag;
	
	public void setExistFlag( boolean existFlag ) {
		this.existFlag = existFlag;
	}
	
	@Override public void run() {
		
		while( !existFlag ) {
			try {
				Thread.sleep( 100 );
			}
			catch ( InterruptedException e ) {
				throw new RuntimeException( e );
			}
			System.out.println( LocalDateTime.now() + " existFlag : " + existFlag );
		}
		
	}
}
