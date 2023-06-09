package chap13.generic.ex1;

/**
 * 부동산 객체
 *
 * 부동산은 렌트 인터페이스를 장착하고 있고 그 렌탈 인터페이스의
 * 타입 파라미터는 아파트(Apartment) 이다.
 */
public class RealEstate implements Rentable<Apartment> {
	
	@Override
	public Apartment rent() {
		return new Apartment();
	}
	
}
