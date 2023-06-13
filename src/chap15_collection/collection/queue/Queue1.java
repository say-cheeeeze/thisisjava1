package chap15_collection.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main( String[] args ) {
		
		Queue<String> queue1 = new LinkedList<>();
		
		queue1.offer( "sendMail1" );
		queue1.offer( "sendMail2" );
		queue1.offer( "sendMail3" );
		
		while ( !queue1.isEmpty() ) {
			
			String item = queue1.poll();
			
			System.out.println( item );
		}
		
	}
}
