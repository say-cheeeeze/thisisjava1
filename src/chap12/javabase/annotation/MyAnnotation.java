package chap12.javabase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 어노테이션을 정의
 *
 * 어노테이션이 가질 속성을 정의할 수 있다.
 * default 선언으로 기본값을 설정할 수 있다.
 * 기본값이 선언되지 않았다면 코드에서 사용할 때 반드시 선언해주어야 한다.
 */
@Target( { ElementType.TYPE }) // 어노테이션 적용 대상 지정 ( 복수가능 )
@Retention( RetentionPolicy.RUNTIME ) // 어노테이션 유지 정책 설정
public @interface MyAnnotation {
	String value();
	int num() default 1;
}
