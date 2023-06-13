package chap16_lambda.returnphrase;

/**
 * 반환값이 있는 추상메소드를 지닌 인터페이스
 * @author cheeeeze
 *
 */
@FunctionalInterface
public interface Calculable {
	
	double calc( double x, double y );

}
