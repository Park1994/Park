package com.forexam;

/*
 * 	문제)	두 개의 정수를 입력받아 그 사이에 존재하는 정수들의 합계를 구하는 프로그램을 구현하시오.
 * 
 * 			3 5 -> 3 + 4 + 5 = 12
 * 			5 3 -> 3 + 4 + 5 = 12
 */

import java.util.*;
public class ForExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int sum = 0;
		int c = 0;
		
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		System.out.print("정수 입력: ");
		b = sc.nextInt();
		
//		if(a > b) { // 첫 번째 입력받은 수가 크면 오류나기 때문에 두 수의 자리를 바꾼다. (오름차순)
//			a = a ^ b;
//			b = b ^ a;
//			a = a ^ b;
//		}
		
		 if(a > b) {
				c = a;
				a = b;
				b = c;
				c = a;
		}
		
		for(int i = a; i <= b ;i++) {
			sum += i;
		}
		System.out.println("두 수 사이의 정수들의 합계: " + sum);
	}

}
