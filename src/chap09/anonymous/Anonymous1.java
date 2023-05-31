package chap09.anonymous;

class Tire {
	void roll() {
		System.out.println( "일반 타이어가 굴러갑니다." );
	}
}
class Car {
	
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		
		@Override
		void roll() {
			System.out.println( "익명 자식 Tire 객체1 이 굴러갑니다." );
		}
	};
	
	/**
	 * 필드를 이용하는 메소드
	 */
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	/**
	 * 로컬 변수를 이용하는 메소드
	 */
	public void run2() {
		
		Tire tire = new Tire() {
			
			@Override
			void roll() {
				System.out.println( "익명 자식 Tire 객체 2가 굴러갑니다." );
			}
		};
		
		tire.roll();
	}
	
	/**
	 * 매개변수를 이용하는 메소드
	 * @param tire
	 */
	public void run3( Tire tire ) {
		tire.roll();
	}
	
}

/**
 * 클래스를 상속하여 만드는 익명 자식 객체.
 */
public class Anonymous1 {

	public static void main( String[] args ) {
		
		Car car = new Car();
		
		// 필드를 이용한 메소드
		car.run1();
		
		// 로컬 변수 이용한 메소드
		car.run2();
		
		// 익명 자식 객체 대입된 매개변수 사용
		car.run3( new Tire() {
			
			@Override void roll() {
				System.out.println( "익명 자식 Tire 객체 3 이 굴러갑니다..." );
			}
		});
	}
}
