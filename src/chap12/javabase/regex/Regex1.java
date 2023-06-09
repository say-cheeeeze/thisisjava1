package chap12.javabase.regex;

import java.util.regex.Pattern;

public class Regex1 {
	
	public static void main( String[] args ) {
	
		String phoneRegEx = "(02|010)-\\d{3,4}-\\d{4}";
		
		String phone = "010-1234-5678";
		
		boolean check = Pattern.matches( phoneRegEx, phone );
		
		System.out.println( check );
		
		String mailRegExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String mail = "angel@mycompany.com"; // true
//		String mail = "angel@mycompanycom"; // false
		
		check = Pattern.matches( mailRegExp, mail );
		System.out.println( check );
	}

}
