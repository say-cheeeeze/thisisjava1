package chap12.javabase.jdk14record;

public class MemberDTO {
	
	private final String name;
	private final int age;
	
	public MemberDTO( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	@Override public int hashCode() {
		return super.hashCode();
	}
	
	@Override public boolean equals( Object obj ) {
		return super.equals( obj );
	}
	
	@Override public String toString() {
		return super.toString();
	}
}
