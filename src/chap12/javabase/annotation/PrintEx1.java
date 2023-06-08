package chap12.javabase.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintEx1 {
	
	public static void main( String[] args ) throws InvocationTargetException, IllegalAccessException {
		
		Method[] methodArr = PrintService.class.getDeclaredMethods();
		
		for( Method method : methodArr ) {
			
			String methodName = method.getName();
//			System.out.println( "methodName : " + methodName );
			
			PrintAnnotation printAnnotation = method.getDeclaredAnnotation( PrintAnnotation.class );
			
			printLine( printAnnotation );
			method.invoke( new PrintService() );
			printLine( printAnnotation );
		}
	
	}
	
	public static void printLine( PrintAnnotation printAnnotation ) {
		
		// 어노테이션의 속성 값 중 'number' 값을 읽어옴
		int propertyNum = printAnnotation.number();
		
		// 어노테이션의 속성 값 중 'value' 값을 읽어옴
		String propertyValue = printAnnotation.value();
		
		for( int i = 0; i < propertyNum; i++ ) {
			
			System.out.print( propertyValue );
		}
		System.out.println();
	}
}
