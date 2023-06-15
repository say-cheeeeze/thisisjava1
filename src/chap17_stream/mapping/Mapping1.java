package chap17_stream.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
	private String name;
	private int age;
	
	public User( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class Mapping1 {
	
	public static void main( String[] args ) {
		
		List<User> userList = new ArrayList<>();
		
		userList.add( new User( "남윤재1", 31 ) );
		userList.add( new User( "남윤재2", 32 ) );
		userList.add( new User( "남윤재3", 33 ) );
		
		userList.stream().mapToInt( user -> user.getAge() )
		.forEach( user -> System.out.println( user ) );
		
	}

}
