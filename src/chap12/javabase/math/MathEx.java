package chap12.javabase.math;

public class MathEx {
	
	public static void main( String[] args ) {
		
		/**
		 * 절대값, 올림값, 버림값, 최대값, 최소값, 랜덤값, 반올림값
		 *
		 * 음수의 경우 어떻게 처리하는지 잘 확인
		 */
		
		
		double param = 5.35;
		double param2 = -5.35;
		
		double v_abs = Math.abs( param2 ); // 5.35
		
		double v1 = Math.ceil( param ); // 6.0
		double v1_1 = Math.ceil( param2 ); // -5.0 ( 음수의 경우에도 양의 방향으로 )
		System.out.println( "ceil1 : " + v1 );
		System.out.println( "ceil1_1 : " + v1_1 );
		
		double v2 = Math.floor( param );
		double v2_1 = Math.floor( param2 );
		System.out.println( "floor1 : " + v2 );
		System.out.println( "floor1_1 : " + v2_1 );
		
		double v3_max = Math.max( param, param2 );
		System.out.println( "max : " + v3_max );
		
		// random 은 0.0 ~ 1.0 사이의 double 값을 무작위 생성 반환
		double v4_random = Math.random();
		System.out.println( "random : " + v4_random );
		
		// 소수점 이하 두 자리까지 반올림하여 얻기
		double v5 = 12.34567;
		double v6 = Math.round( v5 * 100 );
		double v7 = v6 / 100;
		System.out.println( "round : " + v7 );
		
	}
}
