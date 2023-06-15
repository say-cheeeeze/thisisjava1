package chap17_stream.sort2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort2 {

	public static void main( String[] args ) {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add( new Student( "홍길동", 76 ) );
		studentList.add( new Student( "신용권", 98 ) );
		studentList.add( new Student( "김광고", 55 ) );
		studentList.add( new Student( "이클립", 79 ) );
		
		System.out.println( "##### 학생의 score 값 오름차순 정렬하여 stream 에서 요소 모두 출력하기 ### ");
		studentList.stream()
		.sorted( ( s1, s2 ) -> {
			return Integer.compare( s1.getScore(), s2.getScore());
		} )
		.forEach( student -> {
			System.out.println( student.getName() + " / " + student.getScore() );
		} );
		
		
		
		///////////////////////////////////////////////////////////////////////////////
		
		// 정렬 순서를 반대로 구현할거면 sorted() 의 구현 객체 반환 메서드의 파라미터위치를 서로 바꿔주면 된다.
		
		///////////////////////////////////////////////////////////////////////////////
		
		System.out.println( "##### 학생의 score 값 내림차순 정렬하여 stream 에서 요소 모두 출력하기 ### ");
		studentList.stream()
		.sorted( ( s1, s2 ) -> {

			// compare() 파라미터의 s1, s2 의 위치를 바꿨다.
			return Integer.compare( s2.getScore(), s1.getScore());
		} )
		.forEach( student -> {
			System.out.println( student.getName() + " / " + student.getScore() );
		} );
	}
}
