package chap13.generic.ex1;

public interface Rentable<P> {
	
	// 다양한 대상을 렌트할 수 있다는 상황.
	// 반환타입을 P 로 정의한다.
	P rent();
}
