package chap14.thread.ex7_key;

public class Ex1 {
	
	public static void main( String[] args ) {
	
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
