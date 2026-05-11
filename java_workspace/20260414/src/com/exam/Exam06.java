package com.exam;

/*
 *	문제) 1 ~ 99까지의 정수를 입력받고 입력받은 정수 중 3, 6, 9 중 하나가 있는 경우
 *			"박수 짝"을 출력하고, 두개가 있는 경우 "박수 짝짝"을 출력하는 프로그램을 구현하시오.
 *			
 *			13 -> 박수 짝
 *			36 -> 박수 짝짝
 *		
 *			결과 출력
 *			1 ~ 99 사이의 정수 입력: 36
 *			박수 짝짝
 */

import java.util.*;
public class Exam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 자리 정수 입력: ");
		int a = sc.nextInt();
		int cnt = 0;
		
		int ten = a / 10; // 십의 자리
		int il = a % 10; // 일의 자리
		
		if(a >= 1 && a <= 99) {
			if(ten != 0 && ten % 3 == 0) {
				cnt++;
			}
			if(il != 0 && il % 3 == 0) {
				cnt++;
			}
			if(cnt == 2) {
				System.out.println("박수 짝짝");
			} else if(cnt == 1) {
				System.out.println("박수 짝");
			} else {
				System.out.println("박수 없음");
			}
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}
}	

