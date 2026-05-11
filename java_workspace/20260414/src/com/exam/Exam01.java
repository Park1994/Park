package com.exam;

/*
 * 	문제)	원화(한국 돈)를 입력받아 달러로 바꾸는 프로그램을 구현하시오.
 * 			1달러 = 1500원
 * 
 * 			출력결과
 * 			원화 입력: 4500
 * 			4500원은 3.0달러입니다. 
 */

import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int won;
//		double dollar;
//		
//		System.out.print("원화 입력: ");
//		won = sc.nextInt();
//		
//		dollar = won / 1500;
//			
//		System.out.println("입력하신 " + won + "원은 " + dollar + "달러입니다." );
		
		final double dollar = 1500.0; // 변수를 상수화 시켜 고정값을 유지시킴
		
		System.out.print("원화 입력: ");
		int won = sc.nextInt();
		
		double change = won / dollar;
		
		System.out.println(won + "원은 " + change + "달러입니다.");
	}

}
