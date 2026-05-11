package com.exam;

/*
 *	문제)	두 자리의 정수(10 ~ 99사이의 정수)를 입력받아 십의 자리와 일의 자리가 같은지를 판정하는 프로그램을 구현하시오. 
 *
 *			출력 결과
 *			두 자리 정수 입력: 77
 *			십의 자리와 일의 자리가 같습니다.
 *
 *			두 자리 정수 입력: 76
 *			십의 자리와 일의 자리가 같지 않습니다.
 */

import java.util.*;
public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 자리 정수 입력: ");
		int n = sc.nextInt();
		
		// 정수의 범위를 확인한다.
		if(n < 10 || n > 99) {
			System.out.println("정수의 범위를 벗어났습니다.");
			return;
		}
		
		int ten = n / 10; // 십의 자리
		int il = n % 10; // 일의 자리
		
		if(ten == il) {
			System.out.println("십의 자리와 일의 자리가 같습니다.");
		} else {
			System.out.println("십의 자리와 일의 자리가 같지 않습니다.");
		}
		
	}

}
