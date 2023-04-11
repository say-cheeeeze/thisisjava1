package chap01.enum1;


/**
 * 데이터 중에는 몇가지로 한정된 값을 갖는 경우가 있다.
 * 일주일
 * 계절
 * 이렇게 한정된 값을 갖는 타입을 열거 타입 enumeration type 이라고 한다.
 *
 * 열거타입을 사용하기 위해 먼저 열거 타입 이름으로 소스파일을 *.java 생성하고
 * (Enum으로 생성해야함)
 * 한정된 값을 코드로 정의하면 된다.
 *
 * 이 소스파일의 열거타입 이름은 Week 이며
 * 열거 상수 목록은 MONDAY, ... 이다.
 * 관례적으로 모두 알파벳 대문자로 작성한다.
 * 만약 여러 단어로 이루어질 경우 underscore (_) 를 통해 연결하는 것이 관례이다.
 *
 */
public enum Enum01 {
	
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
