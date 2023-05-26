package chap07.protect;

public class A {
	protected String field;
	
	protected A() {
		System.out.println( "A클래스 생성자..(protected)" );
	}
	
	protected void method() {
		System.out.println( "protected method" );
	}
}
