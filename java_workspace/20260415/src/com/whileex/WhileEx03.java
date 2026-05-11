package com.whileex;


/*
 * 	문제)	입력된 정수의 평균을 구하는 프로그램을 구현하시오.
 * 			
 * 			먼저 입력할 정수의 개수를 입력받는다.
 * 			입력받은 수만큼 평균을 출력한다.
 * 			입력받은 수는 정수이지만, 평균은 실수로 처리한다.
 * 
 * 			출력 결과
 * 			정수의 개수: 4
 * 			정수 입력: 2
 * 			정수 입력: 2
 * 			정수 입력: 2
 * 			정수 입력: 2
 * 			입력한 정수의 평균: 3.750000
 */

import java.util.*;
public class WhileEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int a = 0;
		int b = 0;
		int i = 1;
		int sum = 0;
		float avg = 0f;
		System.out.print("정수의 개수 입력: ");
		a = sc.nextInt();
		
		while(i <= a ) {
			// 개수만큼 정수를 입력받아
			System.out.print("정수 입력: ");
			b = sc.nextInt();
			// 합계를 구함
			sum = sum + b;
			i++;
		}
		avg = (float)sum / a;
		System.out.printf("입력한 정수의 평균: %f", avg);
	}

}
