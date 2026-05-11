package com.exam;

/*
 * 	문제)	세 개의 정수를 입력받아 세 개의 정수 중 중간 크기의 수를 출력하는 프로그램을 구현하시오.
 * 			
 * 			출력 결과
 * 			정수 세 개 입력: 20 100 33
 * 			중간 크기: 33
 */

import java.util.*;
public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수입력: ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수입력: ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수입력: ");
		int c = sc.nextInt();
		
		 int mid; // mid: 중간 값을 저장할 변수
		// mid = a; 첫 번째 정수값을 중간값으로 초기화함

  		if((a >= b && a <= c) || (a >= c && a <= b)) {
  			mid = a;
 		} else if((b >= a && b <= c) || (b >= c && b <= a)) {
 			mid = b;
  		} else {
  			mid = c;
  		}
  		System.out.println("중간 크기 " + mid);
 
		
//		if(a > b) {
//			a = a ^ b;
//			b = b ^ a;
//			a = a ^ b;
//		}
//		if(a > c) {
//			a = a ^ c;
//			c = c ^ a;
//			a = a ^ c;
//		}
//		if(b > c) {
//			b = b ^ c;
//			c = c ^ b;
//			b = b ^ c;
//		}
//		System.out.println("중간 크기 " + b);
	}

}
