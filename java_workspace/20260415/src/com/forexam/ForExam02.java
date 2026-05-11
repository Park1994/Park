package com.forexam;

/*
 * 	문제)	양의 실수만 입력받아	입력받은 수까지의 합계의 평균을 구하시오.
 * 			단, 음의 실수가 입력되면 합계를 출력하도록 구현하시오.
 * 
 * 			출력 결과
 * 			양의 실수: 1.1
 * 			양의 실수: 2.2
 * 			양의 실수: 3.3
 * 			양의 실수: 4.4
 * 			양의 실수: -5.5
 * 			지금까지의 평균: 2.2
 * 	
 */

import java.util.*;
public class ForExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		float a = 0f;
//		float sum = 0f;
//		int cnt = 0;
//		for(; a >= 0.0; ) {
//			sum += a; // 누적 합계
//			System.out.print("양의 실수를 입력: ");
//			a = sc.nextFloat();
//			cnt++; // 카운트를 증가시킴
//		}
//		
//		// 평균을 구하여 출력
//		System.out.println("지금까지 입력받은 양의 실수의 평균: " + sum / cnt);
		
		double a = 0;
		double sum = 0;
		double avg = 0;
		int cnt = 0;
		for(; a >= 0; cnt++) {
			sum = sum + a;
			System.out.print("양의 실수입력: ");
			a = sc.nextDouble();
		}
		avg = sum / cnt;
		System.out.printf("입력하신 양의 실수의 합은 %.2f이고 평균은 %.2f입니다.", sum, avg);
	}

}
