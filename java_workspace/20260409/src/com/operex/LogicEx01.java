package com.operex;

/*
 * || (or 연산자: 논리합) -> 두 개의 입력 중 하나의 입력이 참이면 모두 참이다.
 * && (and 연산자: 논리곱) -> 두 개의 입력이 모두 참이어야 참이다.
 */

public class LogicEx01 {

	public static void main(String[] args) {
		
		int x = 0;
		char ch = ' '; // 한 칸 띄어줘야 공백임
		
		x = 15;
		System.out.printf("x = %2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);
		
		x = 6;
		System.out.printf("x = %2d, x %% 2 == 0 || x %% 3 == 0 && x %% 6 != 0 %b%n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		// 묶지 않았을 때 and 부터 실행되어 true가 나온다.
		System.out.printf("x = %2d, (x %% 2 == 0 || x %% 3 == 0) && x %% 6 != 0 %b%n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);
		// 묶었기 때문에 묶은 거부터 실행되어 false가 나온다.
		
		ch = '0'; // 48
		System.out.printf("ch = '%c', '0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <= '9');
		
		ch = 'a'; // 97
		System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <= 'z');
		
		ch = 'A'; // 65
		System.out.printf("ch = '%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A' <= ch && ch <= 'Z');
		
		ch ='q';
		System.out.printf("ch = '%c', ch == 'q' || ch == 'Q' = %b%n", ch, ch == 'q' || ch == 'Q');
	}

}
