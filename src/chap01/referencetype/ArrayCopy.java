package chap01.referencetype;

public class ArrayCopy {
	
	public static void main( String[] args ) {
		
		/**
		 * 배열 복사
		 */
		int[] intArr = new int[]{ 0,1,2,3,4 };
		
		int[] arr2 = new int[intArr.length];
		
		System.arraycopy( intArr, 0, arr2, 0, intArr.length );
		
		for( int num : arr2 ) {
			System.out.println( num );
		}
		
	}
}
