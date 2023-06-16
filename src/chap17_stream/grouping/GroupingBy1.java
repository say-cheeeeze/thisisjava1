package chap17_stream.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
	private String name;
	private int grade;
	
	User( String name, int grade ) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	@Override
	public String toString() {
		return "이름 : " + this.name + " / 등급 : " + this.grade;
	}
}
public class GroupingBy1 {
	
	public static void main( String[] args ) {
		
		User user1 = new User( "남윤재1", 1 );
		User user2 = new User( "남윤재2", 2 );
		User user3 = new User( "남윤재3", 1 );
		User user4 = new User( "남윤재4", 3 );
		User user5 = new User( "남윤재5", 3 );
		User user6 = new User( "남윤재6", 2 );
		User user7 = new User( "남윤재7", 1 );
		User user8 = new User( "남윤재8", 1 );
		
		List<User> userList = Arrays.asList( user1, user2, user3, user4, user5, user6, user7, user8 );
		
		for( User user : userList ) {
			System.out.println( user );
		}
		
		Map<Integer, List<User>> gradeMap = userList.stream().collect( Collectors.groupingBy(
					user -> user.getGrade()
				) );
				
		System.out.println( gradeMap );
		System.out.println( "gradeMap.size() : " + gradeMap.size() );
		
	}

}
