package chap12.javabase.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
	
	private String id;
	
	@NonNull
	private String name;
	private int age;
}
