package chap07.sealedclass;

public non-sealed class Manager extends Person {
	
	@Override public void work() {
		System.out.println( "관리자....." );
	}
}
