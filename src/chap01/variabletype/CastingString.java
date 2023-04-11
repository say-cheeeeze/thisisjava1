package chap01.variabletype;

/**
 * 문자열을 기본타입으로 변환
 */
public class CastingString {
	
	public static void main( String[] args ) {
		
		String str1 = "126";
		
		// 정수형 byte 타입으로
		byte b1 = Byte.parseByte( str1 );
		
		System.out.println( b1 );
		
		// 정수형 2byte 타입 short 으로
		short s1 = Short.parseShort( str1 );
		System.out.println( s1 );
		
		int i1 = Integer.parseInt( str1 );
		System.out.println( i1 );
		
		long l1 = Long.parseLong( str1 );
		System.out.println( l1 );
		
		double d1 = Double.parseDouble( str1 );
		System.out.println( d1 );
		
		float f1 = Float.parseFloat( str1 );
		System.out.println( f1 );
		
		boolean bool1 = Boolean.parseBoolean( str1 );
		System.out.println( bool1 ); // false
		
		// 엇... boolean 은 어떻게 parsing 되는거지
		String strTrue = "true";
		String strTRUE = "TRUE";
		boolean bool2 = Boolean.parseBoolean( strTrue );
		boolean bool3 = Boolean.parseBoolean( strTRUE );
		System.out.println( bool2 );
		System.out.println( bool3 );
		// true 이거나 TRUE 일 때만 true
		// parseBoolean 메소드 설명에 나옴
	}
}
