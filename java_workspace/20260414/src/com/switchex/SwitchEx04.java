package com.switchex;

/*
 * 	문제) 월을 입력받아 월에 해당하는 계절을 출력하는 프로그램을 구현하시오.
 * 			봄	:	3, 4, 5
 * 			여름:	6, 7, 8
 * 			가을:	9, 10, 11
 * 			겨울:	12, 1, 2
 * 
 * 		결과 
 * 		월 입력: 4
 * 		현재의 계절은 봄입니다.
 * 		switch ~ case문으로 구현
 */

import java.io.*;
public class SwitchEx04 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0;
		String b = " ";
		
		System.out.print("월을 입력해주세요: ");
		a = Integer.parseInt(br.readLine());
		
		switch (a) { // case 순서 바뀌어도 출력됌
		case 1:
		case 2:
		case 12:
			b = "겨울";
			break;
		
		case 3:
		case 4:
		case 5:
			b = "봄";
			break;
		
		case 6:
		case 7:
		case 8:
			b = "여름";
			break;	
		
		case 9:
		case 10:
		case 11:
			b = "가을";
			break;
		
		default:
			System.out.println("월을 다시 입력해주세요.");
			return;
		}
		System.out.println("입력하신 " + a + "월은 " + b + "입니다.");
	}

}
