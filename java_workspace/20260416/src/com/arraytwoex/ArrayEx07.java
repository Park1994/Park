package com.arraytwoex;

/*
 * 	문제)	학생 수를 입력받고, 그 수만큼 점수를 입력받아
 * 			전체 학생의 점수의 총점, 평균, 표준편차를 구하는 
 * 			프로그램을 구현하시오.
 * 			단, 배열을 활용하여 구현
 * 
 * 			출력 결과
 * 			학생 수: 5
 * 			1번 학생 점수:90
 * 			2번 학생 점수:82
 * 			3번 학생 점수:64
 * 			4번 학생 점수:36
 * 			5번 학생 점수:98
 * 
 * 			총점: 370
 * 			평균: 74.0
 * 			표준편차: 
 * 			90: -16
 * 			78: -4
 * 			64: 10
 * 			36: 38
 * 			98: -24
 */

import java.util.*;
public class ArrayEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int sum = 0;
		float avg = 0.0f;
		int y = 0;
		
		System.out.print("학생 수 입력: ");
		x = sc.nextInt();
		
		int[] arr;
		arr = new int[x];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 학생의 점수 입력: ");
			y = sc.nextInt();
			arr[i] = y;
			sum = sum + y;
		}
		System.out.println("학생 수: " + x);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번쨰 학생의 점수: " + arr[i]);
		}
		avg = (float)sum / arr.length;
		System.out.println("총점: " + sum);
		System.out.printf("평균: %.2f%n",  avg);
		System.out.println("표준편차");
		for(int t : arr) {
			System.out.printf("%d : %.2f%n", t, (avg - t));
		}
	}

}
