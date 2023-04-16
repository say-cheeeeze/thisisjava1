package chap01.instance;

public class Instance1 {
	
	public static void main( String[] args ) {
		
		Car car = new Car();
		
		car.gas = 10;
		car.setSpeed( 20 );
		// car 인스턴스의 gas 필드는 객체에 소속된 멤버는 맞지만
		// setSpeed() 메서드는 객체에 포함되지 않는다.
		
		// 메서드는 코드의 덩어리이므로 객체마다 저장한다면 중복 저장으로 인해
		// 메모리 효율이 떨어진다. 따라서 메서드 코드는 메서드 영역에 두어
		// 공유하여 상요하고, 이 때 인스턴스 객체를 통해 사용하도록 하는 구조이다.
		
		
	}
}
