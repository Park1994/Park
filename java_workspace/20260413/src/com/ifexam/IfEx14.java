package com.ifexam;

/*
 * 문제)
 * 			사용자로부터 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램을 구현하시오.
 * 			윤년의 판정 조건
 * 			년도가 4의 배수이면서 100의 배수가 아니거나 400의 배수이면 윤년으로 판정하고,
 * 			그렇지 않으면 평년으로 판정함
 * 			단, 조건문은 삼항 연산자를 활용하시오.
 * 
 * 			결과
 * 			년도 입력: 2000
 * 			2000 -> 윤년
 * 
 * 			년도 입력: 2012
 * 			2012 -> 윤년
 * 
 * 			년도 입력: 2013
 * 			2013 -> 평년
 */

import java.util.*;
public class IfEx14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();
		String a;
		
//		if(year % 4 == 0) {
//			if(year % 100 != 0) {
//				System.out.println("윤년");
//			} else if(year % 400 == 0) {
//				System.out.println("윤년");
//			} 
//		} else {
//			System.out.println("평년");
//		}
//	}
		a = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";
		System.out.println(a);
	}
}
