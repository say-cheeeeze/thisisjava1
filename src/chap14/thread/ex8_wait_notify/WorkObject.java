package chap14.thread.ex8_wait_notify;

public class WorkObject {
	
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println( thread.getName() + " >>> methodA 실행" );
		
		//Wakes up a single thread that is waiting on this object's monitor.
		notify();
		
		try {
			// 자신 스레드는 일시정지상태로 만든다.
			wait();
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
	
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println( thread.getName() + " >>> methodB 실행" );
		
		//Wakes up a single thread that is waiting on this object's monitor.
		notify();
		
		try {
			// 자신 스레드는 일시정지상태로 만든다.
			wait();
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
}
