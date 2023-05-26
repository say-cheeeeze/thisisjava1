package chap07.sealedclass;

public final class Employee extends Person {
	
	@Override public void work() {
		System.out.println( "제품 생산하는 노동자" );
	}
}
