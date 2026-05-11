package com.ifexam;

/*
 * 오름차순 내림차순 만들기
 */

import java.util.*;
public class Study01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수:");
		int a = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수: ");
		int c = sc.nextInt();
		System.out.print("네 번째 정수: ");
		int d = sc.nextInt();
		
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
		if(a > d) {
			a = a ^ d;
			d = d ^ a;
			a = a ^ d;
		}
		if(b > c) {
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		if(b > d) {
			b = b ^ d;
			d = d ^ b;
			b = b ^ d;
		}
		if(c > d) {
			c = c ^ d;
			d = d ^ c;
			c = c ^ d;
		}
		System.out.println("출력결과: " + a + " " + b +  " "  + c +  " "  + d); // 오름차순
		System.out.println("출력결과: " + d + " " + c + " " + b + " " + a); // 내림차순
	}

}
