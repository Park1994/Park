package com.forexam;

/*
 * 	문제)	1에서 부터 입력받은 정수까지의 합게를 구하는 프로그램을 구현하시오.
 */

import java.util.*;
public class ForExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("정수를 입력: ");
		a = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합계는 %d%n", a, sum);
	}

}
