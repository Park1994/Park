package com.switchex;

/*
 * 	문제) switch ~ case문을 이용해서 글로벌 카페의 커피 메뉴의 가격을 알려주는 프로그램을 작성하시오.
 * 			커피 종류: 에스프레소, 카푸치노, 카페라떼의 가격은 3,500이고
 * 						아메리카노는 2,000원임
 * 
 * 		무슨 커피를 드릴까요?	카페라떼
 * 		카페라떼는 3,500원입니다.
 */

import java.io.*;
public class SwitchEx03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = " ";
		int price = 0;
		
		System.out.print("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.println();
		System.out.print("무슨 커피를 드릴까요? ");
		a = br.readLine();
		
		switch (a) {
		case "에스프레소":
			
		case "카푸치노":
			
		case "카페라떼":
			price = 3500;
			break;
			
		case "아메리카노":
			price = 2000;
			break;

		default:
			System.out.println("메뉴를 다시 입력해주세요.");
			return; // 메인 메소드를 바로 종료한다.
		}
		System.out.printf("선택하신 커피 %s의 가격은 %d입니다.", a, price);
	}

}
