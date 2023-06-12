package chap15_collection.collection.map;

import java.io.IOException;
import java.util.Properties;

public class Properties1 {

	public static void main( String[] args ) throws IOException {
		
		Properties properties = new Properties();
		properties.load( Properties1.class.getResourceAsStream( "database.properties" ) );
		
		String driverName = properties.getProperty( "driver" );
		String url = properties.getProperty( "url" );
		String username = properties.getProperty( "username" );
		String password = properties.getProperty( "password" );
		String admin = properties.getProperty( "admin" );
		
		System.out.println( "driverName : " + driverName );
		System.out.println( "url : " + url );
		System.out.println( "username : " + username );
		System.out.println( "password : " + password );
		System.out.println( "admin : " + admin );
		
		
	}
}
