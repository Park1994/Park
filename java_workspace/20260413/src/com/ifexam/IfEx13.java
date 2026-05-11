package com.ifexam;

/*
 * 문제) 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램을 구현하시오.
 * 			단, 조건 삼항 연산자를 이용하여 구현하시오.
 * 
 * 			결과
 * 
 * 			정수입력: -12
 * 			-12 -> 음수
 * 
 * 			정수입력: 12
 * 			12 -> 양수
 * 
 * 			정수입력: 0
 * 			0 -> 0
 */

import java.util.*;
public class IfEx13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int a = sc.nextInt();
		String b;
		
		if(a < 0) {
			b = "음수";
		} else if (a == 0) {
			b = "0";
		} else {
			b = "양수";
		}
		
		b = (a < 0) ? "음수" : (a == 0) ? "0" : "양수";
		System.out.println(b);
	}
}
