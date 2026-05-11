package com.whileex;

/*
 * 	문제)	1: 콜라, 2: 사이다, 3: 마운틴, 4: 초코송이, 5: 에이스, 6: 웨하스가 나오는 자판기 프로그램을 작성하시오.
 * 			단, while문을 활용하시오.
 * 			상품을 선택한다.
 * 			0을 입력하면 프로그램을 종료한다.
 */

import java.util.*;
public class WhileEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		String str = " ";
		
		while(a >= 0) {
			System.out.println("0: 종료, 1: 콜라, 2: 사이다, 3: 마운틴, 4: 초코송이, 5: 에이스, 6: 웨하스");
			System.out.print("상품을 선택해주세요: ");
			a = sc.nextInt();
			
			switch (a) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1:
				str = "콜라";
				break;
			case 2:
				str = "사이다";
				break;
			case 3:
				str = "마운틴";
				break;
			case 4:
				str = "초코송이";
				break;
			case 5:
				str = "에이스";
				break;
			case 6:
				str = "웨하스";
				break;

			default:
				System.out.println("선택하신 상품은 없습니다.");
				break;
			}
			System.out.println(str);
			System.out.println();
		}
	}

}
