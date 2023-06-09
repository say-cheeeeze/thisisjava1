package chap13.generic.ex1;

/**
 * 자동차 대리점 객체
 *
 * 대리점은 렌트 인터페이스를 장착하고 있고 그 인터페이스의
 * 타입 파라미터는 자동차(Car) 객체이다.
 */
public class CarAgency implements Rentable<Car> {
	
	@Override
	public Car rent() {
		return new Car();
	}
}
