package com.arraythreeex;

/*
 * 	문제)	컴퓨터와 사용자 사이의 가위 바위 보 게임을 구현하시오.
 * 			사용자가 먼저 시작하고, 가위 바위 보 중 하나를 입력하고 엔터키를 치면
 * 			컴퓨터는 랜덤으로 세 가지 중 하나를 선택하여 출력함
 * 			사용자가 입력한 값과 랜덤으로 출력된 값을 비교하여 누가 이겼는지를 판단하는 프로그램
 * 			프로그램을 구현하되, 그만을 입력하면 프로그램을 종료한다.
 * 			단, 배열, 조건문, 반복문, 문자열을 이용하여 구현하시오.
 * 
 * 			String str[] = {"가위", "바위", "보"};
 * 
 * 			int n = (int)(Math.random() * 3)
 * 				n = 0, 1, 2
 * 
 * 			if(str[n].equals("가위"))
 */

import java.util.*;
public class ArrayExam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String com[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("가위바위보: ");
			String a = sc.nextLine(); // 사용자 입력
			
			if(a.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			// 컴퓨터의 가위바위보를 랜덤으로 결정한다.
			int n = (int)(Math.random() * 3);
			// 0, 1, 2 의 정수를 리턴함
			String b = com[n];
			
			System.out.println("사용자: " + a);
			System.out.println("컴퓨터: " + b);
			
			// 조건문으로 판정함
			if(a.equals("가위")) {
				if(b.equals("가위")) {
					System.out.println("비겼습니다.");
				}
				else if(b.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else {
					System.out.println("사용자가 이겼습니다."); // 보 일때
				}
			}
			else if(a.equals("바위")) {
				if(b.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else if(b.equals("바위")) {
					System.out.println("비겼습니다.");
				}
				else {
					System.out.println("컴퓨터가 이겼습니다."); 
				}
			}
			else {
				if(b.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(b.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				else {
					System.out.println("비겼습니다.");
				}
			}
		}
		
//		String a = "";
//		int n = (int)(Math.random() * 3);
//		
//		for(int i = 0; i < str.length; i++) {
//			System.out.print("가위바위보 입력: ");
//			a = sc.nextLine();
//			if(str[n].equals(a)) {
//				System.out.println(str[n]);
//				System.out.println("비겼습니다.");
//			}
//			i = 0;
//		}
		
		
	}

}
