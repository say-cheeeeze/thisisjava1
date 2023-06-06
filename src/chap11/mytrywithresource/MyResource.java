package chap11.mytrywithresource;

/**
 * AutoCloseable 인터페이스 구현 객체
 *
 * 이 클래스는 try-with-resource 블록에 사용할 수 있게 된다.
 */
public class MyResource implements AutoCloseable {
	
	private String resource;
	
	public MyResource( String resource ) {
		this.resource = resource;
		System.out.println( "myResource 열기 : " + resource );
	}
	
	public String getResource() {
		return this.resource;
	}
	
	@Override
	public void close() throws Exception {
		System.out.println( "resource 해제" );
		this.resource = null;
	}
}
