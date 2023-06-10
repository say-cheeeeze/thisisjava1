package chap14.thread.ex6_synchronized;

public class CalculInfo {
	
	private int number;
	
	public synchronized void setNumber1( int number ) {
		
		System.out.println( "setNumber1 에서 : " + number + " 로 number 를 할당합니다" );
		this.number = number;
		
		try {
			Thread.sleep( 2000 );
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println( Thread.currentThread().getName() + " : " + this.number );
	}
	
	public void setNumber2( int number ) {
		
		synchronized( this ) {
			System.out.println( "setNumber2 에서 : " + number + " 로 number 를 할당합니다" );
			this.number = number;
			
			try {
				Thread.sleep( 2000 );
			}
			catch( InterruptedException e ) {
				e.printStackTrace();
			}
			System.out.println( Thread.currentThread().getName() + " : " + this.number );
			
		}}
}
