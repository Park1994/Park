package com.ifexam;

/*
 * if: 가장 기본적인 조건문 -> (만일 ~이라면)
 * 만일(if) 조건이 참이면{} 안의 문장을 수행
 * 형식
 * if(조건식) {
 * 		조건이 참일 때 수행하는 문장
 * }
 */

public class IfEx01 {

	public static void main(String[] args) {
		
//		int score = 80;
//		
//		if(score > 60) { // 조건이 참일 때
//			// 아래의 문장을 수행합니다.
//			System.out.println("점수가 60보다 큽니다.");
//		}
		
		int x = 0;
		
		System.out.printf("x = %d 일 때, 참인 것은 %n", x);
		
		if(x == 0) {
			System.out.println("x == 0 입니다.");
		}
		
		if(x != 0) {
			System.out.println("x == 0이 아닙니다.");
		}
		
		if(!(x == 0)) {
			System.out.println("!(x == 0)");
		}
		
		if(!(x != 0)) {
			System.out.println("!(x != 0)");
		}
		
		x = 1;
		
		System.out.printf("x = %d 일 때, 참인 것은 %n", x);
		
		if(x == 0) {
			System.out.println("x == 0 입니다.");
		}
		
		if(x != 0) {
			System.out.println("x == 0이 아닙니다.");
		}
		
		if(!(x == 0)) {
			System.out.println("!(x == 0)");
		}
		
		if(!(x != 0)) {
			System.out.println("!(x != 0)");
		}
	}

}
