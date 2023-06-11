package chap14.thread.ex10_stop_thread;

public class Ex1 {
	
	public static void main( String[] args ) {
	
		PrintThread thread = new PrintThread();
		
		thread.start();
		
		try {
			
			Thread.sleep( 2000 );
		}
		catch ( InterruptedException e ) {
			e.printStackTrace();
		}
		
		System.out.println( "isInterrupted : " + thread.isInterrupted() );
		thread.interrupt();
		System.out.println( "isInterrupted : " + thread.isInterrupted() );
	}
}
