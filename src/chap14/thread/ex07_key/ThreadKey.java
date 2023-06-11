package chap14.thread.ex07_key;

public class ThreadKey {
	
	Object keyObj = new Object();
	
	synchronized void methodA() {
		for( int i = 1; i <= 5; i++ ) {
			System.out.println( "### methodA : " + i );
		}
	}
	
	synchronized void methodB() {
		for( int i = 1; i <= 5; i++ ) {
			System.out.println( "@@@ methodB : " + i );
		}
	
	}
	
	void methodC() {
		synchronized ( this ) {
			for( int i = 1; i <= 5; i++ ) {
				System.out.println( "$$$ methodC : " + i );
			}
		}
	}
	
	void methodD() {
		synchronized ( keyObj ) {
			for( int i = 1; i <= 5; i++ ) {
				System.out.println( "&&& methodD : " + i );
			}
		}
	}
	
	void methodE() {
		synchronized ( new Object() ) {
			for( int i = 1; i <= 5; i++ ) {
				System.out.println( "*** methodE : " + i );
			}
		}
		
	}
}
