package chap14.thread.ex2;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		
		for( int i = 0; i < 5; i++ ) {
			System.out.println( i + 1 + ") print.....");
			try {
				Thread.sleep( 1000 );
			}
			catch( InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}
