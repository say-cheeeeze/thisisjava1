package chap01.variableType;

public class String1 {
	
	public static void main( String[] args ) {
		
		/**
		 * java 13 부터는 텍스트 블록 문법을 제공한다.
		 */
		String str1 = """
			 {
				"id" : "winter",
				"name" : "눈송이"
			 }
					""";
		
		System.out.println( str1 );
		
		/**
		 * 또 java14 부터는 텍스트 블록에서 줄바꿈하지 않고 싶은 경우 \ 를 맨 끝에 붙여주면 된다.
		 */
		String str2 = """
					이것은 모두 \
					한줄로 \
					나오게 될 겁니다.\
					신기하쥬?
					""";
		System.out.println( str2 );
	}
}
