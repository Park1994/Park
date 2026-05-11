package com.ifexam;

/*
 * 문제) 사용자로부터 임의의 정수 3개를 입력받아
 * 			작은 수부터 큰 수를 순서대로 출력하는 프로그램을 작성하시오.
 * 			오름차순 정렬(작은 수 -> 중간 수 -> 큰 수)
 * 			
 * 			첫 번째 정수입력:
 * 			두 번째 정수입력:
 * 			세 번째 정수입력:
 * 	
 * 			정렬 결과: 8 16 21
 */

import java.io.*;
public class IfEx10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
//		int d;
		int x, y, z;
		
		System.out.print("첫 번째 정수입력: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수입력: ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수입력: ");
		c = Integer.parseInt(br.readLine());
		
//		if(a > b && b > c) {
//			System.out.printf("%d %d %d", c, b, a);
//		} else if(a > c && c > b) {
//			System.out.printf("%d %d %d", b, c, a);
//		} else if(b > a && a > c) {
//			System.out.printf("%d %d %d", c, a, b);
//		} else if(b > c && c > a) {
//			System.out.printf("%d %d %d", a, c, b);
//		} else if(c > b && b > a) {
//			System.out.printf("%d %d %d", a, b, c);
//		} else if(c > a && a > b) {
//			System.out.printf("%d %d %d", b, a, c);
//		}
		
//		// 첫 번째 정수가 두 번째 정수보다 큰 경우 자리를 바꾼다.
//		if(a > b) {
//			d = a;
//			a = b;
//			b = d;
//		}
//		// 첫 번째 정수가 세 번째 정수보다 크다면 자리를 바꾼다.
//		if(a > c) {
//			d = a;
//			a = c;
//			c = d;
//		}
//		// 두 번째 정수가 세 번째 정수보다 큰 경우 자리를 바꾼다.
//		if(b > c) {
//			d = b;
//			b = c;
//			c = d;
//		}
		
		if(a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		if(a > c) {
			a = a ^ c;
			c = c ^ a;
			a = a ^ c;
		}
		if(b > c) {
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		
		System.out.println("출력결과: " + a + " -> " + b + " -> " + c); // 오름차순
		System.out.println("출력결과: " + c + " -> " + b + " -> " + a); // 내림차순
	}
}
