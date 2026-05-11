package com.ifexam;

/*
 * 문제) 임의의 정수를 입력받아 홀수인지 짝수인지를 판정하는 프로그램을 작성하시오.
 * 
 * 입력받은 수가 3의 배수인지 아닌지를 판정하시오.
 * 3으로 나누어서 나머지가 0이면 3의 배수
 */

import java.util.*;
public class IfEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		
//		if(a % 2 != 0) {
//			System.out.println("홀수입니다.");
//		}
//		if(a % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
		
		if(a == 0) {
			System.out.println("0입니다.");
			return;
		} else if(a < 0) {
			System.out.println("음수입니다.");
			return;
		} else if(a % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if(a % 3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
