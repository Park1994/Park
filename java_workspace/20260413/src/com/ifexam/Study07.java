package com.ifexam;

/*
 * 4의 배수이면서 100의 배수가 아니거나 400의 배수인것을 윤년, 다른 것은 평년으로 출력하는 프로그램을 작성
 * 조건 삼항 연산자 사용
 */

import java.util.*;
public class Study07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요. : ");
		int year = sc.nextInt();
		String a;
		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
		
		a = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "윤년" : "평년";
		System.out.println(year + " -> " + a);
	}

}
