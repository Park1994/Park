package com.forexam;

/*
 * 	문제)	하나의 정수를 입력받아 입력받은 정수의 팩토리얼을 구하는 프로그램을 구현하시오.
 * 
 * 			n! = 7
 * 			1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040
 * 
 * 			결과
 * 			정수 입력: 7
 * 			7의 팩토리얼은 5040입니다.
 */

import java.util.*;
public class ForExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int sum = 1; // 곱하기 할 때는 1로 초기화 해야한다.
		
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			sum *= i;
		}
		System.out.printf("%d의 팩토리얼은 %d입니다.", a, sum);
	}

}
