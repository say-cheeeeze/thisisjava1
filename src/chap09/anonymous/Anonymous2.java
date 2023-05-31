package chap09.anonymous;

/**
 * 익명 구현 객체
 *
 * 인터페이스를 구현하는 경우.
 */
public class Anonymous2 {
	
	private RemoteControl rc = new RemoteControl() {
		
		@Override public void turnOn() {
			System.out.println( "TV를 켭니다." );
		}
		
		@Override public void turnOff() {
			System.out.println( "TV를 끕니다." );
		}
	};
	
	public void use1() {
		rc.turnOff();
		rc.turnOn();
	}
	
	
	public void use2() {
		
		RemoteControl rc = new RemoteControl() {
			
			@Override public void turnOn() {
				System.out.println( "TV를 켭니다." );
			}
			
			@Override public void turnOff() {
				System.out.println( "TV를 끕니다." );
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3( RemoteControl rc ) {
		rc.turnOn();
		rc.turnOff();
	}
	
	public static void main( String[] args ) {
		
		Anonymous2 a1 = new Anonymous2();
		
		a1.use1();
		
		a1.use2();
		
		a1.use3( new RemoteControl() {
			
			@Override public void turnOn() {
				System.out.println( "TV를 켭니다." );
			}
			
			@Override public void turnOff() {
				System.out.println( "TV를 끕니다." );
			}
		} );
	}
}
