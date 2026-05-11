package com.ifexam;

/*
 * 임의의 정수를 입력받아 양수인지 음수인지 0인지 판별하고 출력하시오.
 * 조건 삼항 연산자를 사용하시오.
 */

import java.util.*;
public class Study06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		String b;
		
//		if(a > 0) {
//			System.out.println("양수");
//		} else if(a == 0) {
//			System.out.println("0");
//		} else {
//			System.out.println("음수");
//		}
		
		b = (a > 0) ? "양수" : (a == 0) ? "0" : "음수";
		System.out.println(b);
	}

}
