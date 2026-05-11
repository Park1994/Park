package com.arraythreeex;

/*
 * 	문제)	양의 정수 10개를 입력받아 배열에 저장하고 배열에 있는 정수 중 
 * 			3의 배수만 출력하는 프로그램을 구현하시오.
 * 			
 * 			양의 정수 10: 1 5 99 22 345 154 2346 55 32 85
 * 			3의 배수: 99 345 2346
 */

import java.util.*;
public class ArrayExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 정수입력: ", i + 1);
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < 5; i++) {
//			for(int j = 5; j >= i + 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
