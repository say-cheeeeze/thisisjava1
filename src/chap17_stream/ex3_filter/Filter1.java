package chap17_stream.ex3_filter;

import java.util.ArrayList;
import java.util.List;

public class Filter1 {

	public static void main( String[] args ) {
		
		List<String> userList = new ArrayList<>();
		
		userList.add( "김일동" );
		userList.add( "박종철" );
		userList.add( "신민주" );
		userList.add( "최현옥" );
		userList.add( "남윤재" );
		userList.add( "남윤재" );
		userList.add( "남윤재" );
		userList.add( "남오현" );
		userList.add( "남주연" );

		// 중복 요소 제거하고 출력
		userList.stream().distinct().forEach( user -> System.out.println( user ) );
		
		System.out.println( "성이 '남' 씨인 이름만 추출 " );
		// 성이 '남' 씨인 이름만 추출
		userList.stream()
				.filter( user -> user.startsWith( "남" ) )
				.forEach( user -> System.out.println( user ) );
		
		
		
	}
}
