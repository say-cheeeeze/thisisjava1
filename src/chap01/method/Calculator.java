package chap01.method;

public class Calculator {
	
	// 정사각형인 경우 한변의 길이만 가지고 넓이를 구할 수 있다.
	double areaRectangle( double width ) {
		return width * width;
	}
	
	double areaRectangle( double width, double height ) {
		return width * height;
	}
}
