package chap12.javabase;

public class BaseEx {
	public static void main( String[] args ) {
		
		String str1 = new String( "yoonjae" );
		String str2 = new String( "yoonjae" );
		System.out.println( str1.equals( str2 ) );
		System.out.println( str1 == str2 );
		
		// hashCode 는 객체의 메모리 번지를 이용하여 해시코드가 생성되며
		// 객체마다 다른 정수값을 반환한다.
		System.out.println( "str1.hashCode() : " + str1.hashCode() );
		System.out.println( "str2.hashCode() : " + str2.hashCode() );
		
		
		Base base1 = new Base( "yoonjae" );
		Base base2 = new Base( "yoonjae" );
		Base base3 = new Base( "yoonjae" );
		
		System.out.println( base1.equals( base2 ) );
	}
}
