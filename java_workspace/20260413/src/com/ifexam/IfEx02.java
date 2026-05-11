package com.ifexam;

/*
 * 블럭, 블레이스 -> {}
 * -> 여러 문장을 하나의 단위로 묶을 수 있다.
 * 		{ 로 시작해서 } 로 끝난다.
 * 		이 블럭에는 세미콜론(;)을 붙이지 않는다.
 * 
 * 문제) 사용자로부터 임의의 정수를 입력받아
 * 			입력받은 정수가 0인지 0이 아닌지를 판정하는
 * 			프로그램을 구현하시오.
 */

import java.util.*;
public class IfEx02 {

	public static void main(String[] args) {
		
//		int score = 55;
//		
//		if(score > 60) {
//			System.out.println("합격입니다.");
//		}
//			System.out.println("축하합니다."); // -> if문에 속하지 않는 문장이다.
//		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		System.out.print("임의의 정수 입력: ");
		
		input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다."); // 조건이 참일 때 수행하는 문장
			System.out.printf("입력하신 숫자는 %d입니다.", input); // 조건과 상관없이 실행되는 문장
		}
		
	}

}
