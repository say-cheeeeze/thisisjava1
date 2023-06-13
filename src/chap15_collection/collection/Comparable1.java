package chap15_collection.collection;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	
	public Person( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;

	@Override
	public int compareTo(Person o) {
		
		if ( o.age > this.age ) {
			return -1;
		}
		else if ( o.age < this.age ) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " / " + this.age;
	}
	
}
public class Comparable1 {

	public static void main( String[] args ) {
		
		TreeSet<Person> personTree =  new TreeSet<>();
		personTree.add( new Person( "홍길동", 33 ) );
		personTree.add( new Person( "남윤재", 31 ) );
		personTree.add( new Person( "일윤재", 11 ) );
		personTree.add( new Person( "칠윤재", 37 ) );
		
		for( Person person : personTree ) {
			
			System.out.println( person );
		}
		
		Person lastPerson = personTree.last();
		System.out.println( "lastPerson : " + lastPerson );
	}
	
}
