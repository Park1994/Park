package com.ex;

/*
 * 	두 변수의 값을 교환(바꾼다)
 *	int x, y;
 *		y 값과 x값을 바꾸고 싶을 때?
 *		비트연산을 통해 바꿀 수 있다.
 *		x = x ^ y;
 *		y = y ^ x;
 *		x = x ^ y;
 *		하면 x와 y 값이 바뀐다.
 *
 *	변수의 이름(식별자)을 정하는 규칙
 *	만들 때는 규칙을 지켜야함
 *	1. 대소문자가 구분되며 길이에 제한이 없다.
 *	2. 예약어를 사용해서는 안된다.
 *	3. 변수명의 첫 글자가 숫자로 시작해서는 안된다.
 *	4. 특수문자는 _ $ 만을 허용한다.
 */
public class VarEx02 {
	public static void main(String[] args) {
		int x = 7;
		int y = 1;
		/*
		int z = 0;
		*/
		
		System.out.println("x: " + x + " y: " + y);
		
		/*
		z = x;
		x = y;
		y = z;
		*/
		
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		
		System.out.println("x: " + x + " y: " + y);
	}
}
