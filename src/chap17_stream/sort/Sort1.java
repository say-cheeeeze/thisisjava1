package chap17_stream.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort1 {

	public static void main( String[] args ) {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add( new Student( "홍길동", 76 ) );
		studentList.add( new Student( "신용권", 98 ) );
		studentList.add( new Student( "김광고", 55 ) );
		studentList.add( new Student( "이클립", 79 ) );
		
		System.out.println( "##### 학생의 score 값 오름차순 정렬하여 stream 에서 요소 모두 출력하기 ### ");
		studentList.stream()
				.sorted()
				.forEach( student -> {
					System.out.println( student.getName() + " / " + student.getScore() );
				} );
		
		System.out.println( "##### 학생의 score 값 내림차순 정렬하여 stream 에서 요소 모두 출력하기 ### ");
		studentList.stream()
		.sorted( Comparator.reverseOrder())
		.forEach( student -> {
			System.out.println( student.getName() + " / " + student.getScore() );
		} );
	}
}
