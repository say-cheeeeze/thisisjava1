package chap16_lambda;

public class Ex2 {

	public static void main( String[] args ) {
		
		Thread thread = new Thread(
				new Runnable() {
					@Override
					public void run() {
						for( int i = 0; i < 3; i++ ) {
							System.out.println( "작업 스레드 실행" );
						}
						
					}
				});
		
		/**
		 * 위 스레드 생성시 구현 객체 표현은 아래와 같이 변경할 수 있다.
		 * 
		 * Runnable 객체가 Thread 의 생성자로 쓰여지고, 
		 * Runnable 은 @FunctionalInterface 이기 때문에 ( 단 하나의 추상메서드만 가진 인터페이스 )
		 * Runnable 인터페이스의 추상메서드 run() 을 람다식으로 표현할 수 있고,
		 * run() 은 반환타입과 파라미터가 없기 때문에 
		 * () -> { ... } 으로 표현 가능하다. run() 추상메소드에 대한 구현이 되는 부분.
		 */
		thread = new Thread( () -> {
			for( int i = 0; i < 3; i++ ) {
				System.out.println( "작업 스레드 실행" );
			}
		} );
		
		thread.start();
	}
}
