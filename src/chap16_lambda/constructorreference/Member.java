package chap16_lambda.constructorreference;

public class Member {
	
	private String id;
	private String name;
	
	public Member( String id ) {
		this.id = id;
		System.out.println( "Member(String id)" );
	}
	
	public Member( String id, String name ) {
		this.id = id;
		this.name = name;
		System.out.println( "Member(String id, String name)" );
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( "{ id : " + this.id + ", name : " + this.name + " }" );
		return sb.toString();
	}

}
