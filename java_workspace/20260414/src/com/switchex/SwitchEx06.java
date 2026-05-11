package com.switchex;

/*
 * 문제)	주민등록번호를 입력받아 성별을 판정하는 프로그램을 구현하시오.
 * 			남성은 1, 3
 * 			여성은 2, 4	
 */

import java.util.*;
public class SwitchEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 문자열을 입력받는다.
		System.out.print("주민번호 입력: ");
		String a = sc.nextLine();
		// 입력받은 문자열에서 하나의 문자만 추출한다. (8번째)
		char gender = a.charAt(7);
		
		switch (gender) {
		case '1':case '3':
			switch (gender) {
				case '1':
					System.out.println("2000년 이전에 태어난 남성입니다.");
					return;
				
				case '3':
					System.out.println("2000년 이후에 태어난 남성입니다.");
					return;
			}
			
		case '2':case '4':
			switch (gender) {
				case '2':
					System.out.println("2000년 이전에 태어난 여성입니다.");
					return;
				
				case '4':
					System.out.println("2000년 이후에 태어난 여성입니다.");
					return;
			}
		default:
			System.out.println("알 수 없는 번호입니다.");
			break;
		}
	}

}
