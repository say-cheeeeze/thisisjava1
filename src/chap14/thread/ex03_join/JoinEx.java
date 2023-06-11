package chap14.thread.ex03_join;

public class JoinEx {
	
	public static void main( String[] args ) {
	
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		System.out.println( "sum : " + sumThread.getSum() );
	}
}
