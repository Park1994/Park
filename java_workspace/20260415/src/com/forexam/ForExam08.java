package com.forexam;

/*
 * 	문제)	임의의 정수를 입력받아 입력받은 정수의 3의 승수를 출력하는 프로그램을 작성하시오.
 * 			
 * 			승수: 5
 * 			3의 5승은 243입니다.
 */

import java.util.*;
public class ForExam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
		for(int  i = 1; i <= a; i++) {
			b = b * 3;
		}
		System.out.println("3의 " + a + "승은 " + b + "입니다.");
	}

}
