package com.switchex;

/*
 * 	문제) 사용자로부터 임의의 두 정수와 연산자를 입력받아
 * 			해당 연산을 처리하는 프로그램을 구현하시오.
 * 			단, switch ~ case문을 이용하여 구현하시오.
 * 			입력은 BufferedReader를 활용하시오.
 * 			
 * 			결과
 * 			첫번째 정수: 10
 * 			연산자(+, -, *, /): +
 * 			두번째 정수: 14
 * 			10 + 14 = 24
 */

import java.io.*;
public class SwitchEx02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, sum;
		// int sum = 0;
		String c;
		// char oper = ' ';
		
		System.out.print("첫번째 정수를 입력하세요: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("연산자(+, -, *, /)를 입력하세요: ");
		c = br.readLine();
		// oper = (char)System.in.read();
		// System.in.skip(2); - 1. 둘 중에 하나
		// System.in.read(); - 2. 둘 중에 하나
		// System.in.read(); - 2
		System.out.print("두번째 정수를 입력하세요: ");
		b = Integer.parseInt(br.readLine());
		
		switch (c) {
		case "+":
			sum = a + b;
			System.out.printf("%d %s %d = %d", a, c, b, sum);
			break;
			
		case "-":
			sum = a - b;
			System.out.printf("%d %s %d = %d", a, c, b, sum);
			break;
			
		case "*":
			sum = a * b;
			System.out.printf("%d %s %d = %d", a, c, b, sum);
			break;
			
		case "/":
			sum = a / b;
			System.out.printf("%d %s %d = %d", a, c, b, sum);
			break;

		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		}
		// System.out.printf("%d %s %d = %d", a, c, b, sum);
	}

}
