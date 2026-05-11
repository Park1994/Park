package com.forexam;

/*
 * 	문제) 	임의의 정수를 입력받아 입력받은 다음 그 수만큼 3의 배수를 구하는 프로그램을 작성하시오.
 * 			
 * 			임의의 정수: 5
 * 			3 6 9 12 15
 */

import java.util.*;
public class ForExam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			// 3의 배수
			if(i % 3 == 0) {
				System.out.println((i * 3) + "\t");
			}
		}
	}

}
