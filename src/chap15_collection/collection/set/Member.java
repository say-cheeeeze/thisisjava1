package chap15_collection.collection.set;

public class Member {
	
	private String name;
	private int age;
	
	public Member( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		System.out.println( "name.hashCode() + age : " + this.name.hashCode() + age );
		return this.name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof Member target ) {
			return target.name.equals( name ) && ( target.age == age );
		}
		else {
			return false;
		}
	}

}
