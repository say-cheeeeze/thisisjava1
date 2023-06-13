package chap15_collection.collection.list;

import java.util.Stack;

public class Stack1 {

	public static void main( String[] args ) {
		
		Stack<Integer> stack1 = new Stack<>();
		stack1.push( 1 );
		stack1.push( 1 );
		stack1.push( 1 );
		stack1.push( 1 );
		stack1.push( 1 );
		stack1.push( 1 );
		
		while ( !stack1.isEmpty() ) {
			System.out.println( "size : " + stack1.size() );
			System.out.println( "계속 꺼내셈 : " + stack1.pop() );
		}
	}
}
