package chap12.javabase.hashcode;

public class HashCodeEx {
	
	public static void main( String[] args ) {
		
		Student student1 = new Student( 1, "yoonjae" );
		Student student2 = new Student( 1, "yoonjae" );
		
		System.out.println( student1.hashCode() );
		System.out.println( student2.hashCode() );
		
		// toString() 은 클래스명@16진수해시코드로 구성된 문자열을 리턴한다.
		System.out.println( student2.toString() );
		
		Object obj = new Object();
		System.out.println( obj );
	}
}
