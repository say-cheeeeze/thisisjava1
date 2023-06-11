package chap14.thread.ex9_stop_thread;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		PrintThread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep( 1000 );
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		
		thread.setExistFlag( true );
		System.out.println( thread.getState() );
	}
}
