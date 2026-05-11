package com.example;

import java.util.Scanner;

/*
 * 문제1) 하나의 문자를 입력받아 그것의 char형 문자와 ASCII 코드 값을 출력하는 프로그램을 구현하시오.
 * 문자 입력: a
 * 결과: a = 97 
 */

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		char ch = ' ';
//		
//		System.out.print("문자 입력: ");
//		String str = sc.nextLine(); // 문자를 입력받을 수 있는 메소드
//		next() 와 nextLine() 차이는 next()는 공백이 있으면 공백 전까지만 출력, nextLine()은 공백이후 문자열 전부 출력		
//		// 스캐너 클래스에 문자를 입력받을 수 있는 메소드를 호출해서
//		ch = str.charAt(0); // 0번 인덱스 문자만 추출한다.
//		System.out.printf("ASCII 코드 값: %d%n", (int)ch);
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		System.out.printf("%c = %d", ch, (int)ch);
	}

}
