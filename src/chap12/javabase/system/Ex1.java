package chap12.javabase.system;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Ex1 {
	
	public static void main( String[] args ) throws IOException {
		
		// System.out.println( System.in.read() );
		// System 클래스의 in 필드의 read() 메서드로
		// 입력된 키의 코드값을 읽을 수 있다.
		/**
		 * 입력       -> 코드
		 * 0 ~ 9    -> 48 ~ 57
		 * A ~ Z    -> 65 ~ 90
		 * a ~ z    -> 97 ~ 122
		 * 등등..
		 */
		
		Properties properties = System.getProperties();
		Set keys = properties.keySet();
		for( Object key : keys ) {
			String strKey = String.valueOf( key );
			String strValue = System.getProperty( strKey );
			System.out.printf( "%-40s: %s\n", strKey, strValue );
		}
	}
}
