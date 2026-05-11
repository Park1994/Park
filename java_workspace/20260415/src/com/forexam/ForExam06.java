package com.forexam;

/*
 * 	문제)	사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수 까지의 전체의 합계
 * 			짝수의 합계, 홀수의 합계를 구하되, 각각 결과값을 아래와 같이 출력하도록 하시오.
 * 	
 * 			임의의 정수: 50
 * 			
 * 			출력 결과
 * 			1 ~ 10 까지의 전체의 합계
 * 			1 ~ 10 까지의 짝수의 합계
 * 			1 ~ 10 까지의 홀수의 합계
 * 
 * 			1 ~ 20 까지의 전체의 합계
 * 			1 ~ 20 까지의 짝수의 합계
 * 			1 ~ 20 까지의 홀수의 합계
 * 
 * 			1 ~ 30 까지의 전체의 합계
 * 			1 ~ 30 까지의 짝수의 합계
 * 			1 ~ 30 까지의 홀수의 합계
 * 	
 * 			1 ~ 40 까지의 전체의 합계
 * 			1 ~ 40 까지의 짝수의 합계
 * 			1 ~ 40 까지의 홀수의 합계
 * 
 * 			1 ~ 50 까지의 전체의 합계
 * 			1 ~ 50 까지의 짝수의 합계
 * 			1 ~ 50 까지의 홀수의 합계
 * 
 * 			1 ~ 59까지의 전체의 합계:
 * 			1 ~ 59까지의 짝수의 합계:
 * 			1 ~ 59까지의 홀수의 합계:
 */

import java.util.*;
public class ForExam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			sum1 = sum1 + i;
			if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
			else {
				sum3 = sum3 + i;
			}
			/*
			 * if( i % 10 == 0 || i == a) {
			 * 		System.out.printf("1부터 %d까지의 전체의 합계: %d%n", i, sum1);
					System.out.printf("1부터 %d까지의 짝수의 합계: %d%n", i, sum2);
					System.out.printf("1부터 %d까지의 홀수의 합계: %d%n", i, sum3);
					System.out.println();
			 * }
			 */
			if(i % 10 == 0) {
				System.out.printf("1부터 %d까지의 전체의 합계: %d%n", i, sum1);
				System.out.printf("1부터 %d까지의 짝수의 합계: %d%n", i, sum2);
				System.out.printf("1부터 %d까지의 홀수의 합계: %d%n", i, sum3);
				System.out.println();
			}	
			else if(i == a) {
				System.out.printf("1부터 %d까지의 전체의 합계: %d%n", a, sum1);
				System.out.printf("1부터 %d까지의 짝수의 합계: %d%n", a, sum2);
				System.out.printf("1부터 %d까지의 홀수의 합계: %d%n", a, sum3);
			}
		}
	}

}
