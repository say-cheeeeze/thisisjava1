package chap08.interface1;

public interface RemoteControl {
	
	/**
	 * 인터페이스의 상수는 모두 static final 이다.
	 * static final 생략 가능하며 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.
	 */
	static final String CONTROL_NUMBER = "TEST0001";
	int VOLUME_MIN = 0;
	int VOLUME_MAX = 100;
	
	/**
	 * 인터페이스의 추상메서드는
	 * public abstract 생략 가능하며 생략하더라도 컴파일 과정에서 자동으로 붙게 된다.
	 */
	public abstract void turnOn();
	void turnOff();
	void setVolume( int volume );
	int getVolume();
	
	/**
	 * default 메서드는 완전한 실행코드를 가진다.
	 */
	default void setMute( boolean mute ) {
		if ( mute ) {
			System.out.println( "무음 처리합니다." );
			setVolume( VOLUME_MIN );
		}
		else {
			System.out.println( "무음을 해제합니다." );
		}
		test1();
	}
	
	/**
	 * private 메서드는 구현객체가 필요한 메서드이다.
	 */
	private void test1() {
		System.out.println( "private void 메서드" );
	}
	
	public static void changeBattery() {
		System.out.println( "배터리를 교체합니다," );
		
		// 정적 메서드에서는 인스턴스 메서드를 호출할 수 없다.
		// getVolume(); // X
		// Non-static method 'getVolume()' cannot be referenced from a static context
		
		test();
	}
	
	/**
	 * private static 메서드는 구현 객체가 필요없다.
	 */
	private static void test() {
		System.out.println( "이건 static 메서드이다." );
	}
}
