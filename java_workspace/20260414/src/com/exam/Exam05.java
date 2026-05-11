package com.exam;

/*
 *	문제)	삼각형의 변의 길이를 나타내는 정수 3개를 입력받고 이 3개의 정수로 삼각형을 만들 수 있는지를 판별하는 프로그램을 구현하시오.
 *			단, 삼각형이 되려면 두 변의 합이 다른 한변의 합보다 커야함
 *
 * 			출력 결과
 * 			정수 3개 입력: 4 3 5
 * 			삼각형이 된다.	
 */

import java.util.*;
public class Exam05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수입력: ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수입력: ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수입력: ");
		int c = sc.nextInt();
		
		if((a + b) <= c || (a + c) <= b || (b + c) <= a) {
			System.out.println("삼각형이 되지 않는다.");
		} else {
			System.out.println("삼각형이 된다.");
		}
		
		if((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("삼각형이 된다.");
		} else {
			System.out.println("삼각형이 되지 않는다.");
		}
	}
}
