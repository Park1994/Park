package com.ifexam;

/*
 * 문제) 사용자로부터 임의의 두 정수와 연산자를 입력받아
 * 			해당 연산자를 처리하는 프로그램을 구현하시오.
 * 		
 * 		결과
 * 			첫번째 정수 입력:
 *  		두번째 정수 입력:
 *  		연산자 입력(+, -, *, /): +
 *  		10 + 14 = 24
 */

import java.io.*;
// import java.util.*;
public class IfEx09 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in);
		
		int a, b, d;
		char c = ' ';
		
		System.out.print("첫번째 정수 입력: ");
		a = Integer.parseInt(br.readLine());
		// a = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		b = Integer.parseInt(br.readLine());
		// b = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /): ");
		c = (char)System.in.read();
		// c = sc.next().charAt(0);
		
		if(c == '+') {
			d = a + b;
			System.out.printf("%d %c %d = %d", a, c, b, d);
		} else if(c == '-') {
			d = a - b;
			System.out.printf("%d %c %d = %d", a, c, b, d);
		} else if(c == '*') {
			d = a * b;
			System.out.printf("%d %c%d = %d", a, c, b, d);
		} else if(c == '/') {
			d = a / b;
			System.out.printf("%d %c %d = %d", a, c, b, d);
		} else {
			System.out.println("올바른 연산자가 아닙니다.");
		}
	}
}
