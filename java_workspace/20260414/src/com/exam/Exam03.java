package com.exam;

/*
 * 	문제) 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전,
 * 			50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지를 출력하는 프로그램을 구현하시오.
 * 			
 * 			출력 결과
 * 			금액 입력: 65376
 * 			오만원권: 1매
 * 			만원권: 1매
 * 			천원권: 5매
 * 			백원: 3개
 * 			오십원: 1개
 * 			십원: 2개
 * 			일원: 6개
 */

import java.util.*;
public class Exam03 {
	
	// 변하지 않는 상수 값 지정
	final static int oman =50000;
	final static int man = 10000;
	final static int ocheon = 5000;
	final static int cheon = 1000;
	final static int obaek = 500;
	final static int baek = 100;
	final static int oship = 50;
	final static int ship = 10;
	final static int il = 1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈의 액수: ");
		int money = sc.nextInt();
		
		// 오만원권 계산
		int n = money / oman;
		// 다시 남은 돈 계산
		money = money % oman;
		if(n > 0) { // 오만원권 돈의 개수가 존재한다면
			// 오만원권 매수출력
			System.out.println("오만원권 " + n + "매");
		}
		// 만원권 계산
		n = money / man;
		money = money % man;
		if(n > 0) {
			System.out.println("만원권 " + n + "매");
		}
		// 오천원권 계산
		n = money /  ocheon;
		money = money %  ocheon;
		if(n > 0) {
			System.out.println("오천원권 " + n + "매");
		}
		//천원권 계산
		n = money / cheon;
		money = money % cheon;
		if(n > 0) {
			System.out.println("천원권 " + n + "매");
		}
		// 오백원 계산
		n = money / obaek;
		money = money % obaek;
		if(n > 0) {
			System.out.println("오백원 " + n + "개");
		}
		// 백원 계산
		n = money / baek;
		money = money % baek;
		if(n > 0) {
			System.out.println("백원 " + n + "개");
		}
		// 오십원 계산
		n = money / oship;
		money = money % oship;
		if(n > 0) {
			System.out.println("오십원 " + n + "개");
		}
		// 십원 계산
		n = money / ship;
		money = money % ship;
		if(n > 0) {
			System.out.println("십원 " + n + "개");
		}
		// 일원 계산
		n = money / il;
		money = money % il;
		if(n > 0 ) {
			System.out.println("일원 " + n + "개");
		} else {
			return;
		}
	}

}
