package chap14.thread.ex10_stop_thread;

public class Ex1 {
	
	public static void main( String[] args ) {
	
		PrintThread thread = new PrintThread();
		
		thread.start();
		
		thread.interrupt();
	}
}
