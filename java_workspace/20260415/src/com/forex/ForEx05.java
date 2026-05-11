package com.forex;

/*
 * 	구구단 중 원하는 단을 입력받아 출력하는 프로그램을 구현하시오.
 */

import java.util.*;
public class ForEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("구구단을 입력하세요: ");
		a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d입니다.%n", a, i, a * i);
		}
	}

}
