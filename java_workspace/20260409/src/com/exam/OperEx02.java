package com.exam;

/*
 * 산술 연산자: +, -, *, /, %
 */

public class OperEx02 {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		
		System.out.printf("%2d + %2d = %02d%n", a, b, a + b);
		System.out.printf("%2d - %2d = %02d%n", a, b, a - b);
		System.out.printf("%2d * %2d = %02d%n", a, b, a * b);
		System.out.printf("%2d / %2d = %02d%n", a, b, a / b);
		System.out.printf("%2d %% %2d = %02d%n", a, b, a % b); // %는 두 개가 들어가야 된다.
	}

}
