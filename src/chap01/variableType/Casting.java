package chap01.variableType;

public class Casting {
	
	/**
	 * 강제타입 변환
	 *
	 * 큰 허용범위를 작은 허용범위 타입으로 '바꾼다고 명시'하여 타입을 변환할 수 있다.
	 * => 큰 녀석을 작은 그릇으로 Casting 한다.
	 */
	public static void main( String[] args ) {
	
		intToByte();
		intToByte2();
	}
	
	public static void intToByte() {
		/**
		 * int 를 byte 로 타입캐스팅한다.
		 * 4바이트 그릇을 1바이트짜리 그릇으로 옮긴다.
		 */
		int int1 = 100;
		byte byte1 = (byte)int1;
		System.out.println( byte1 );
	}
	
	public static void intToByte2() {
		/**
		 * 만약 허용범위 차이에 의해 손실값이 생긴다면 어떻게 될까?
		 */
		int int1 = 250;
		byte byte1 = ( byte )int1;
		System.out.println( byte1 ); // -6 이 나온다.
		
		// 10진수 250 은 2진수로 나타내면 0b11111010 1바이트로 표현이 가능하다.
		// 근데 byte 로 변환하면 11111010 는 ~128 ~ 127 만 표현가능한 범위 안에서
		// 부호bit 1 을 처리하고 나머지 수들은 1의 모수로 변경되기 때문에 -6 이 된다.
		
		// 타입캐스팅의 목적은 원래 값을 유지하면서 타입만 변경하는 건데
		// 이렇게 하면 값을 손실하게 된다.
		
		// byte 로 변환한다면 ~128 ~ 127 의 int 값만 원래 값을 보존하며 타입을 변경할 수 있다.
	}
}
