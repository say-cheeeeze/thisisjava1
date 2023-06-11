package chap14.thread.ex07_key;

public class Ex1 {
	public native int availableProcessors();
	
	public static void main( String[] args ) {
		
		System.out.println( Runtime.getRuntime().availableProcessors() );
		
		ThreadKey threadKey = new ThreadKey();
		
//		new Thread() {
//			@Override public void run() {
//				threadKey.methodA();
//			}
//		}.start();
//
//		new Thread() {
//			@Override public void run() {
//				threadKey.methodB();
//			}
//		}.start();
		
//		new Thread() {
//			@Override public void run() {
//				threadKey.methodC();
//			}
//		}.start();

		new Thread() {
			@Override public void run() {
				threadKey.methodD();
			}
		}.start();

		new Thread() {
			@Override public void run() {
				threadKey.methodE();
			}
		}.start();
		
	}
	
}
