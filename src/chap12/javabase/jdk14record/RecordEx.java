package chap12.javabase.jdk14record;

public class RecordEx {
	public static void main( String[] args ) {
		
		MemberRecord record1 = new MemberRecord( "yoonjae", 35 );
		
		System.out.println( record1.name() );
		System.out.println( record1.age() );
		System.out.println( record1.toString() );
	}
}
