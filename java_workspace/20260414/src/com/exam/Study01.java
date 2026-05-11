package com.exam;

/*
 * 	3자리 정수를 입력해서 3 6 9 게임 만들기
 */

import java.util.*;
public class Study01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, cnt = 0;
		System.out.print("세 자리 정수 입력: ");
		a = sc.nextInt();
		
		int hun = a / 100;
		int ten = a / 10;
		int il = a % 10;
		
		if(1 <= a && a <= 999) {
			if(hun != 0 && hun % 3 == 0) {
				cnt++;
			}
			if(ten != 0 && ten % 3 == 0) {
				cnt++;
			}
			if(il != 0 && il % 3 == 0) {
				cnt++;
			}
			if(cnt == 3) {
				System.out.println("박수짝짝짝");
			} else if(cnt == 2) {
				System.out.println("박수짝짝");
			} else if(cnt == 1) {
				System.out.println("박수짝");
			} else {
				System.out.println("박수없음");
			}
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}

}
