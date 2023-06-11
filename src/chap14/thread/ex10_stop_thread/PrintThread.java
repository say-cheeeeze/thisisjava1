package chap14.thread.ex10_stop_thread;

public class PrintThread extends Thread {
	
	@Override public void run() {
		while( true ) {
			
			System.out.println( "### print..... ");
			
			try {
				Thread.sleep( 100 );
			}
			catch( InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}
