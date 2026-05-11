package com.forexam;

/*
 * 	무한대로 두 정수를 입력받아 합계를 구하는 프로그램을 구현하시오.
 * 
 * 	두 개의 정수 입력: 5 4
 * 	두 수의 합계: 9
 * 두 개의 정수 입력: 6 3
 * 	두 수의 합계: 9
 * 두 개의 정수 입력: 2 7
 * 	두 수의 합계: 9
 * 두 개의 정수 입력: 8 1
 * 	두 수의 합계: 9
 */

import java.util.*;
public class ForExam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int sum = 0;
		for(; ;) {
			System.out.print("정수 입력: ");
			a = sc.nextInt();
			System.out.print("정수 입력: ");
			b = sc.nextInt();
			sum = a + b;
			System.out.println("두 수의 합계: " + sum);
		}
	}

}
