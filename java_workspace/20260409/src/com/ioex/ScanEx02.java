package com.ioex;

/*
 * 사용자로부터 입력받는 방법
 * Scanner 클래스
 * 1. import java.util.*;
 * 2. 객체를 생성한다.
 * 		Scanner sc = new Scanner(System.in);
 * 		
 *	문자열: next() -> 문자열을 리턴함
 *			 nextLine()  -> \n 을 포함한 라인을 읽고난 뒤 \n 을 버리고 문자열만 리턴함
 *	정수형: nextInt()
 *	실수형(float): nextFloat()
 *	실수형(double): nextDouble()
 */

import java.util.*;
public class ScanEx02 {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		/*
		System.out.print("이름 입력: ");
		str1 = sc.next(); // 문자열과 문자열 사이에 공백이 있는 경우는 뒤에 문자열을 읽어들일 수 없다.
		System.out.println(str1);
		*/
		
		System.out.print("이름 입력: ");
		str2 = sc.nextLine(); // 공백이 있는 긴 문자열도 읽어들일 수 있다.
		System.out.println(str2);
		
		sc.close(); // 스캐너를 닫아준다.
	}

}
